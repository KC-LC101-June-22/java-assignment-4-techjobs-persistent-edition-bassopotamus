package org.launchcode.techjobs.persistent.models;

import java.util.List;
import java.util.ArrayList;
import javax.persistence.*;
import javax.validation.constraints.Size;
import javax.validation.constraints.NotBlank;

@Entity
public class Employer extends AbstractEntity {

    @Size(min=3, max=40, message="Location must be at least 3 characters long")
    @NotBlank
    private String location;

    public void setLocation(String location) {
        this.location = location;
    }

    public String getLocation() {
        return location;
    }

    public Employer() {
    }

     @OneToMany
     @JoinColumn(name = "employer_id")
     private List<Job> jobs = new ArrayList<>();

    public void setJobs(List<Job> jobs) {
        this.jobs = jobs;

    }

    public List<Job> getJobs() {
        return jobs;

    }

}

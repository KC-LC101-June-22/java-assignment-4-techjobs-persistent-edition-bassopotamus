-- Part 1: Test it with SQL
SELECT column_name, data_type
FROM information_schema.columns
WHERE table_schema = techjobs;

-- Part 2: Test it with SQL
SELECT name
FROM employer
WHERE location = "St. Louis City";

-- Part 3: Test it with SQL
DROP
TABLE job;

-- Part 4: Test it with SQL
SELECT name
FROM skill
WHERE id IN (SELECT skills_id FROM job_skills WHERE skills_id IS NOT NULL)
ORDER BY name ASC;
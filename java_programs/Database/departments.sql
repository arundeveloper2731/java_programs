CREATE TABLE departments(
 department_id INT PRIMARY KEY,
 department_name VARCHAR(50) NOT NULL,
 location VARCHAR(50) NOT NULL
);

SELECT*FROM departments;

INSERT INTO departments VALUES
(1,'HR','Chennai'),
(2,'Development','Bangalore'),
(3,'Testing','Chennai'),
(4,'Support','Hyderabad');

SELECT *
FROM departments
WHERE location = 'Chennai';
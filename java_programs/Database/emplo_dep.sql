CREATE TABLE departments_dep(
 dep_id INT PRIMARY KEY,
 dep_name VARCHAR(50) NOT NULL,
 location VARCHAR(50) NOT NULL
);

INSERT INTO departments_dep VALUES
(1,'HR','Chennai'),
(2,'Development','Bangalore'),
(3,'Testing','Chennai'),
(4,'Support','Hyderabad');

SELECT * FROM emplo_dep;
CREATE TABLE emplo_dep(
 emp_id INT PRIMARY KEY,
 emp_name VARCHAR(50) NOT NULL,
 age INT CHECK(age > 18),
 salary INT NOT NULL,
 dep_id INT,
 manager_id INT,
 
 FOREIGN KEY (dep_id) REFERENCES departments_dep(dep_id),
 FOREIGN KEY (manager_id) REFERENCES emplo_dep(emp_id)
);

INSERT INTO emplo_dep VALUES
(101,'Arun',30,40000,2,NULL),
(102,'Bala',28,30000,2,101),
(103,'Charan',35,50000,1,NULL),
(104,'Dinesh',25,25000,3,103),
(105,'Ezhil',27,28000,4,101);

SELECT * 
FROM emplo_dep
WHERE salary > 30000;

UPDATE emplo_dep
SET salary = 35000
WHERE emp_name = 'Bala';
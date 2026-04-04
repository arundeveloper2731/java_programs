CREATE TABLE emp_detail(
 emp_id INT PRIMARY KEY,
 emp_name VARCHAR(50) NOT NULL,
 age INT CHECK(age > 18),
 salary INT CHECK(salary > 0),
 department_id INT,
 manager_id INT,
 
);
select*from emp_detail;
INSERT INTO emp_detail VALUES
(101,'Arun',30,40000,2,NULL),
(102,'Bala',28,30000,2,101),
(103,'Charan',35,50000,1,NULL),
(104,'Dinesh',25,25000,3,103),
(105,'Ezhil',27,28000,4,101);
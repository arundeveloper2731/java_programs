create table department(
dept_id int primary key,
dept_name varchar(50) not null,
location varchar(50) not null
);

create table employe(
emp_id int primary key,
emp_name varchar(50) not null,
age int not null,
salary int not null,
dept_id int,
job_role varchar(50) not null
);



insert into department values (10, 'HR', 'Chennai'),
( 20, 'IT', 'Madurai'),
(30, 'Finance', 'Trichy'),
 (40, 'Sales', 'Coimbatore');

 insert into employe values (101, 'Arun', 23, 25000, 20, 'Developer'),
(102, 'Bala', 30, 40000, 10, 'Recruiter'),
 (103, 'Charan', 27, 35000, 20, 'Tester'),
 (104, 'Divya', 35, 50000, 30, 'Accountant'),
 (105, 'Eswar', 29, 28000, 40, 'Sales Executive'),
 (106, 'Farhana', 26, 32000, 20, 'Developer'),
 (107, 'Gokul', 31, 45000, 30, 'Analyst'),
 (108, 'Hari', 24, 22000, 10, 'Assistant');
 
-- Display employee name with department name

select*from employe;
select*from department;

-- Show employees who work in IT department.

select e.emp_id,e.emp_name,e.dept_name from employe e ept_id = 'it';


--Display employee name and salary with annual salary (salary * 12).
--Display employee name and salary after adding bonus 5000.
--Display employee name and monthly salary after deducting 2000.

-- Arithmetic operator

select emp_name ,salary*12 as new_salary from employe;
select emp_name ,salary+ 5000 as new_salary from employe;
select emp_name ,salary- 2000 as new_salary from employe;

--Comparison operator
--Show employees whose salary is greater than 30000.
--Show employees whose age is less than 28.
--Show employees whose salary is equal to 25000.
--Show employees whose age is not equal to 30.

select emp_name,salary from employe where (salary >=30000);
select emp_name,age from employe where (age >= 28);
select emp_name,salary from employe where (salary = 25000);
select emp_name,age from employe where (age != 30);

--Logical Operator
--Show employees whose salary is greater than 25000 AND dept_id is 20.
--Show employees whose dept_id is 10 OR dept_id is 30.
--Show employees whose salary is not less than 30000.
--Show employees whose age is greater than 25 AND salary is less than 45000.

select e.emp_name,e.salary,dept_id from employe e where (salary >=25000 AND dept_id = 20);
select emp_name,dept_id from employe where (dept_id >10 or dept_id = 30 );
select emp_name, salary from employe where NOT(salary <  30000);
select e.emp_name,e.salary,e.age from employe e where (age >25 AND salary < 45000);

--Special Operators
--Show employees whose salary is between 25000 and 40000.
--Show employees whose dept_id is in (10, 20).
--Show employees whose name starts with 'A'.
--Show employees whose name ends with 'a'.
--Show employees whose name contains 'ar'.
--Show employees whose dept_id is not in (30, 40).

select emp_name,salary from employe  where salary BETWEEN 25000 AND 40000;
select emp_name,dept_id from employe  where dept_id in (10,20);
select emp_name from employe where emp_name like 'A%';
select emp_name from employe where emp_name like '%a';
select emp_name from employe where emp_name like '%ar%';
select dept_id,emp_name from employe where dept_id not in (30,40);





 
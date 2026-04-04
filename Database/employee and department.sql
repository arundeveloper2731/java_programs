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

select e.emp_id,e.emp_name,d.dept_name from employe e join department d on e.dept_id = d.dept_id where d.dept_name = 'IT';

select e.emp_id,e.emp_name,d.dept_name from employe e join department d on e.dept_id = d.dept_id where d.dept_name = 'Sales';

--4. Show employees whose department location is Chennai.
select e.emp_id,e.emp_name,d.location from employe e join department d on e.dept_id = d.dept_id where d.location = 'Chennai';

--5. Show employees with salary greater than 30000 along with department name.

select e.emp_id,e.emp_name,e.salary,dept_name from employe e join department d on e.dept_id = d.dept_id where  (salary >= 30000);   

--6. Count employees in each department using join.
select d.dept_name, count (e.emp_id) as emp_count from employe e join department d on e.dept_id = d.dept_id group by d.dept_name;

select d.dept_name,d.location, count (e.emp_id) as emp_count from employe e join department d on e.dept_id = d.dept_id group by d.dept_name,d.location; 


--7. Show departments having more than 1 employee using join and having clause.

select d.dept_name, count(e.emp_id) as emp_count from employe e join department d on e.dept_id = d.dept_id group by d.dept_name;

 
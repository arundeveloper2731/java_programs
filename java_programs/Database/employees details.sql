create table  Employees(
emp_id int primary key,
emp_name varchar(50) not null,
role varchar(50) not null,
salary int not null default 60
);

select * from Employees;

select * from Employees where (salary >= 25000);
update Employees set salary = 35000 where emp_id = 202;
update Employees set salary = 400000 where emp_id = 204;

delete from Employees where emp_id = 204;
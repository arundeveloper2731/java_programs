create table orders(
order_id int primary key,
customer_name varchar(50) not null,
product_name varchar(50) not null,
quantity int not null,
status varchar(50) not null
);

select *from orders;

insert into orders values(401,'Arun','Laptop',1,'Placed'),
(402,'Bala','Mobile',2,'Placed'),
(403,'charan','tablet',1,'Placed');

select*from orders where (status = 'Placed');
update orders set status = 'Shipped' where (order_id = 402);


insert into departments values (401,'HR','Chennai'),(402,'HR','salem');
insert into departments values (101,'HR','Chennai'),(102,'HR','salem');

--//left join

select o.order_id,o.customer_name,o.product_name,o.status from  orders o 
inner join departments d on o.order_id = d.department_id;


select emp_id,emp_name,dept_name,salary from  Employee_Details,departments

UPDATE Employee_Details SET department_id = 1 WHERE id = 101;
UPDATE Employee_Details SET department_id = 2 WHERE id = 102;
UPDATE Employee_Details SET department_id = 3 WHERE id = 103;
SELECT 
e.id,
e.name,
e.age,
d.department_name,
d.location
FROM Employee_Details e
INNER JOIN departments d
ON e.department_id = d.department_id
WHERE d.location = 'Chennai';

SELECT 
e.id,
e.name,
e.age,
d.department_name,
d.location
FROM Employee_Details e
INNER JOIN departments d
ON e.department_id = d.department_id;

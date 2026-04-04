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



--//left join

select o.order_id,o.customer_name,o from  orders o
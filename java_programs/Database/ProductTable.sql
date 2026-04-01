create table Products(
product_id int primary key,
product_name varchar(50) not null,
price int not null,
stock int not null
);

insert into Products values(301,'Pen',10,100),
(302,'Book',50,200),
(303,'Bag',500,50),
(304,'Bottle',150,0),
(305,'Box',80,20);

select*from Products;

select * from Products where (stock=0);
update  Products set price = 550 where (product_id = 303);
delete from Products where product_id = 301;
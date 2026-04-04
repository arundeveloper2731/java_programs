CREATE TABLE Student(

std_id serial primary key,
std_name varchar(50) not null,
age int not null,
dateofbirth DATE not null
);

SELECT * FROM Student
INSERT INTO Student (std_name,age,dateofbirth) VALUES ('Arun',20,'2004-05-10;);
INSERT INTO Student (std_name, age, dateofbirth) VALUES ('Priya', 22, 2003-02-15);
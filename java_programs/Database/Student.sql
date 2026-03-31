CREATE TABLE Student(
 std_id SERIAL PRIMARY KEY,
 std_name VARCHAR(50) NOT NULL,
 age INT NOT NULL,
 dateofbirth DATE NOT NULL
);

SELECT * FROM Student;

INSERT INTO Student (std_name, age, dateofbirth)
VALUES ('Arun', 20, '2004-05-10');

INSERT INTO Student (std_name, age, dateofbirth)
VALUES ('Priya', 22, '2003-02-15');
TRUNCATE Student;
DROP TABLE Student;
----Create a table bank_account. Insert some records. Update balance but rollback the transaction.

-- Create table
CREATE TABLE bank_account (
    account_id INT PRIMARY KEY,
    account_holder VARCHAR(50),
    balance DECIMAL(10,2)
);

-- Insert records
INSERT INTO bank_account VALUES (101, 'Arun', 5000.00),(102, 'Kumar', 7500.00), (103, 'Priya', 6200.00);

-- Start transaction
BEGIN;

-- Update balance
UPDATE bank_account
SET balance = balance + 1000
WHERE account_id = 101;

-- Check updated data
SELECT * FROM bank_account;

-- Rollback transaction
ROLLBACK;

-- Check data after rollback
SELECT * FROM bank_account;


--Create a view to show only employee names and give SELECT permission on that view to user guest.


-- Create employee table (example)
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary DECIMAL(10,2),
    department VARCHAR(30)
);

-- Create view to show only employee names
CREATE VIEW employee_names AS
SELECT emp_name
FROM employee;

-- Grant SELECT permission on the view to guest user
GRANT SELECT
ON emp_name
TO employee;

SELECT * FROM employee_names;

-- Create employee table
CREATE TABLE employee (
    emp_id INT PRIMARY KEY,
    emp_name VARCHAR(50),
    salary DECIMAL(10,2),
    department VARCHAR(30)
);

-- Insert sample data
INSERT INTO employee VALUES
(1, 'Arun', 25000, 'IT'),
(2, 'Priya', 30000, 'HR'),
(3, 'Kumar', 28000, 'Sales');

-- Menu-driven procedure
CREATE OR REPLACE PROCEDURE manage_view(choice INT)
LANGUAGE plpgsql
AS $$
BEGIN
    CASE choice

        -- 1. Create View
        WHEN 1 THEN
            CREATE OR REPLACE VIEW employee_view AS
            SELECT emp_id, emp_name, salary
            FROM employee;
            RAISE NOTICE 'View created successfully';

        -- 2. Display Data from View
        WHEN 2 THEN
            RAISE NOTICE 'Use this query: SELECT * FROM employee_view;';

        -- 3. Update Data using View
        WHEN 3 THEN
            UPDATE employee_view
            SET salary = salary + 5000
            WHERE emp_id = 1;
            RAISE NOTICE 'Data updated successfully through view';

        -- 4. Drop View
        WHEN 4 THEN
            DROP VIEW IF EXISTS employee_view;
            RAISE NOTICE 'View dropped successfully';

        -- 5. Exit
        WHEN 5 THEN
            RAISE NOTICE 'Exiting program';

        ELSE
            RAISE NOTICE 'Invalid choice';

    END CASE;
END;
$$;


CALL manage_view(1);

CALL manage_view(2);
SELECT * FROM employee_view;

CALL manage_view(3);
SELECT * FROM employee_view;

CALL manage_view(5);




-- Create database
CREATE DATABASE transport_company;

-- Use database
\c transport_company;

-- Create vehicle_details table
CREATE TABLE vehicle_details (
    vehicle_id INT PRIMARY KEY,
    vehicle_name VARCHAR(50),
    vehicle_number VARCHAR(20),
    capacity INT
);

-- Create delivery_details table
CREATE TABLE delivery_details (
    delivery_id INT PRIMARY KEY,
    product_name VARCHAR(50),
    shop_name VARCHAR(50),
    delivery_area VARCHAR(50),
    status VARCHAR(20)
);

-- Create view for completed deliveries
CREATE VIEW completed_deliveries AS
SELECT delivery_id, product_name, shop_name, delivery_area
FROM delivery_details
WHERE status = 'Completed';

-- Create index on delivery_area
CREATE INDEX idx_delivery_area
ON delivery_details(delivery_area);

-- Insert 3 delivery records
BEGIN;

INSERT INTO delivery_details VALUES
(1, 'Rice Bags', 'ABC Stores', 'Chennai', 'Completed'),
(2, 'Oil Cans', 'XYZ Mart', 'Madurai', 'Pending'),
(3, 'Sugar Packs', 'Fresh Shop', 'Coimbatore', 'Completed');

COMMIT;

-- Delete one record and rollback
BEGIN;

DELETE FROM delivery_details
WHERE delivery_id = 2;

ROLLBACK;

-- Create user
CREATE USER guest_user WITH PASSWORD 'guest123';

-- Grant only SELECT permission
GRANT SELECT
ON delivery_details
TO guest_user;








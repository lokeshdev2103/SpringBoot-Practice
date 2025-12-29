package com.example.springpractice.Sql;


/*
 Types of databases :
 1. Relational Databases (RDBMS) : MySQL, PostgreSQL, Oracle, SQL Server
 2. NoSQL Databases : MongoDB, Cassandra, Redis


 Common SQL Commands :
 1. Data Definition Language (DDL) : CREATE, ALTER, DROP, TRUNCATE
 2. Data Manipulation Language (DML) : SELECT, INSERT, UPDATE, DELETE
 3. Data Control Language (DCL) : GRANT, REVOKE
 4. Transaction Control Language (TCL) : COMMIT, ROLLBACK, SAVEPOINT



 1.1 CREATE : create table
    Example : CREATE TABLE Students (ID int, Name varchar(255), Age int, Address varchar(255), PhoneNumber varchar(15));
 1.2 ALTER : alter table or modify table structure
    Example : ALTER TABLE Students ADD COLUMN Email varchar(255);
 1.3 DROP : drop table or delete table
    Example : DROP TABLE Students;
 1.4 TRUNCATE : delete all records from table not the table structure
    Example : TRUNCATE TABLE Students;
 2.1 SELECT : select records from table
    Example : SELECT * FROM Students;
 2.2 INSERT : insert records into table
    Example : INSERT INTO Students (ID, Name, Age, Address, PhoneNumber) VALUES (1, 'Lokesh', 21, '123 Main St', '1234567890');
              INSERT INTO Students (ID, Name, Age, Address, PhoneNumber) VALUES (2, 'Pujitha', 22, '456 Oak St', '1234567890');
              INSERT INTO Students (ID, Name, Age, Address, PhoneNumber) VALUES (3, 'Nikhil', 23, '789 Pine St', '1234567890');
 2.3 UPDATE : update records in table
    Example : UPDATE Students SET Age = 23 WHERE ID = 1;
 2.4 DELETE : delete records from table
    Example : DELETE FROM Students WHERE ID = 2;
 3.1 GRANT : give permissions to user
    Example : GRANT SELECT, INSERT ON Students TO 'username'@'localhost';
 3.2 REVOKE : take back permissions from user
    Example : REVOKE INSERT ON Students FROM 'username'@'localhost';
 4.1 COMMIT : save transaction permanently
    Example : COMMIT;
 4.2 ROLLBACK : undo transaction
    Example : ROLLBACK;
 4.3 SAVEPOINT : set a point within a transaction to which you can later
    Example : SAVEPOINT savepoint_name;


    Constraints in SQL :
 1. NOT NULL : ensures that a column cannot have a NULL value
    Example : CREATE TABLE Students (ID int NOT NULL, Name varchar(255) NOT NULL);
 2. UNIQUE : ensures that all values in a column are unique
    Example : CREATE TABLE Students (ID int UNIQUE, Email varchar(255) UNIQUE);
 3. PRIMARY KEY : uniquely identifies each record in a table
    Example : CREATE TABLE Students (ID int PRIMARY KEY, Name varchar(255));
 4. FOREIGN KEY : ensures referential integrity between two tables
    Example : CREATE TABLE Orders (OrderID int PRIMARY KEY, StudentID int, FOREIGN KEY (StudentID) REFERENCES Students(ID));
 5. CHECK : ensures that all values in a column satisfy a specific condition
    Example : CREATE TABLE Students (ID int, Age int CHECK (Age >= 18));
 6. DEFAULT : sets a default value for a column when no value is specified
    Example : CREATE TABLE Students (ID int, Name varchar(255), Status varchar(50) DEFAULT 'active');


    Causes in Sql :

    Where : Used to filter records based on specific conditions.
    Example : SELECT * FROM Students WHERE Age > 20;

    And : Combines multiple conditions in a WHERE clause, returning records that satisfy all conditions.
    Example : SELECT * FROM Students WHERE Age > 20 AND City = 'New York';

    Or : Combines multiple conditions in a WHERE clause, returning records that satisfy at least one condition.
    Example : SELECT * FROM Students WHERE Age < 18 OR City = 'Los Angeles';

    Like : Used in a WHERE clause to search for a specified pattern in a column.
    Example : SELECT * FROM Students WHERE Name LIKE 'L%';

    In : Used in a WHERE clause to specify multiple values for a column.
    Example : SELECT * FROM Students WHERE City IN ('New York', 'Los Angeles', 'Chicago');

    Between : Used in a WHERE clause to filter records within a specific range.
    Example : SELECT * FROM Students WHERE Age BETWEEN 18 AND 25;

    order by : Used to sort the result set of a query by one or more columns.
    Example : SELECT * FROM Students ORDER BY Name ASC;

    Distinct : Used to return only distinct (different) values in the result set.
    Example : SELECT DISTINCT City FROM Students;

    Limit : Used to specify the maximum number of records to return in the result set.
    Example : SELECT * FROM Students LIMIT 10;

    Group by and Having : Group By is used to group rows that have the same values in specified columns into summary rows.
                          Having is used to filter groups based on a specified condition.
    Example : SELECT City, COUNT(*) FROM Students GROUP BY City HAVING COUNT(*) > 5;




*/


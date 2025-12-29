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

    Joins:
    CREATE TABLE Students (ID int PRIMARY KEY, Name varchar(255));
    CREATE TABLE Orders (OrderID int PRIMARY KEY, StudentID int, FOREIGN KEY (StudentID) REFERENCES Students(ID));

    Inner Join : Returns records that have matching values in both tables.
    Example : SELECT Students.Name, Orders.OrderID FROM Students INNER JOIN Orders ON Students.ID = Orders.StudentID;

    Left Join : Returns all records from the left table and the matched records from the right table.
    Example : SELECT Students.Name, Orders.OrderID FROM Students LEFT JOIN Orders ON Students.ID = Orders.StudentID;
    Right Join : Returns all records from the right table and the matched records from the left table.
    Example : SELECT Students.Name, Orders.OrderID FROM Students RIGHT JOIN Orders ON Students.ID = Orders.StudentID;
    Full Join : Returns all records when there is a match in either left or right table.
    Example : SELECT Students.Name, Orders.OrderID FROM Students FULL JOIN Orders ON Students.ID = Orders.StudentID;


    Advaced Sql :
    stored procedures, views, indexes, triggers, transactions, normalization, denormalization, ACID properties, CAP theorem.

    1. stored procedures: stored procedures are precompiled SQL statements that can be executed repeatedly.
    Example : CREATE PROCEDURE GetStudents AS SELECT * FROM Students;

    2. views: views are virtual tables that are based on the result set of a SQL query.
    Example : CREATE VIEW StudentView AS SELECT Name, Age FROM Students WHERE Age > 18;

    3. indexes: indexes are used to improve the performance of SQL queries by providing quick access to rows in a table.
    Example : CREATE INDEX idx_name ON Students (Name);

    4. triggers: triggers are special types of stored procedures that are automatically executed in response to certain events on a table.
    Example : CREATE TRIGGER trg_after_insert AFTER INSERT ON Students FOR EACH ROW BEGIN INSERT INTO AuditLog (Action, Timestamp) VALUES ('Insert', NOW()); END;

    5. transactions: transactions are a sequence of SQL statements that are executed as a single unit of work.
    Example : BEGIN TRANSACTION; UPDATE Students SET Age = Age + 1 WHERE ID = 1; COMMIT;


    6. normalization: normalization is the process of organizing data in a database to reduce redundancy and improve data integrity.
    Example : First Normal Form (1NF), Second Normal Form (2NF), Third Normal Form (3NF)
    7. denormalization: denormalization is the process of combining tables to improve read performance at the cost of write performance and data integrity.
    Example : Combining Customer and Orders tables into a single table.

    8. ACID properties: ACID properties are a set of properties that guarantee that database transactions are processed reliably.
    Example : Atomicity, Consistency, Isolation, Durability
    8.1 Atomicity : ensures that all operations within a transaction are completed successfully or none at all.
    Example : If a transaction consists of multiple SQL statements, either all statements are executed successfully, or none are applied to the database.
    8.2 Consistency : ensures that a transaction brings the database from one valid state to another valid state.
    Example : If a transaction violates any database constraints, it will be rolled back to maintain data integrity.
    8.3 Isolation : ensures that concurrent transactions do not interfere with each other.
    Example : If two transactions are trying to update the same record simultaneously, isolation ensures that one transaction's changes are not visible to the other until it is committed.
    8.4 Durability : ensures that once a transaction is committed, its changes are permanent and will survive any subsequent system failures.
    Example : Once a transaction is committed, the changes made to the database will persist even if there is a power failure or crash immediately after  the commit.

    9. CAP theorem: CAP theorem states that it is impossible for a distributed data store to simultaneously provide more than two out of the following three guarantees: Consistency, Availability, Partition tolerance
    Example : A distributed database can be designed to be either CP (Consistency and Partition tolerance) or AP (Availability and Partition tolerance), but not both.


    lock and deadlock in sql :
    Lock : A lock is a mechanism used to control concurrent access to database resources, such as tables or rows, to ensure data integrity and consistency.
    Example : When a transaction updates a record, it may acquire a lock on that record to prevent other transactions from modifying it until the first transaction is complete.
    deadlock : A deadlock is a situation in which two or more transactions are waiting for each other to release locks on resources, resulting in a standstill where none of the transactions can proceed.
    Example : Transaction A holds a lock on Resource 1 and is waiting for a lock on Resource 2, while Transaction B holds a lock on Resource 2 and is waiting for a lock on Resource 1.



*/


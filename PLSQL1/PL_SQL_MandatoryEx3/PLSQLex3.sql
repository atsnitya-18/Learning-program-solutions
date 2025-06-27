CREATE TABLE accounts (
    account_id NUMBER PRIMARY KEY,
    customer_name VARCHAR2(50),
    balance NUMBER,
    account_type VARCHAR2(20)
);

CREATE TABLE employees (
    emp_id NUMBER PRIMARY KEY,
    emp_name VARCHAR2(50),
    department VARCHAR2(30),
    salary NUMBER
);

INSERT INTO accounts VALUES (1, 'Ravi', 10000, 'savings');
INSERT INTO accounts VALUES (2, 'Priya', 20000, 'savings');
INSERT INTO accounts VALUES (3, 'Anil', 15000, 'current');

INSERT INTO employees VALUES (101, 'Asha', 'Sales', 50000);
INSERT INTO employees VALUES (102, 'Kiran', 'Sales', 60000);
INSERT INTO employees VALUES (103, 'Sneha', 'HR', 55000);

COMMIT;
CREATE TABLE customers (
    customer_id NUMBER PRIMARY KEY,
    name VARCHAR2(50),
    age NUMBER,
    balance NUMBER,
    is_vip CHAR(1) DEFAULT 'N'
);


CREATE TABLE loans (
    loan_id NUMBER PRIMARY KEY,
    customer_id NUMBER,
    interest_rate NUMBER,
    due_date DATE,
    FOREIGN KEY (customer_id) REFERENCES customers(customer_id)
);

INSERT INTO customers VALUES (1, 'Ravi', 65, 12000, 'N');
INSERT INTO customers VALUES (2, 'Priya', 45, 8000, 'N');
INSERT INTO customers VALUES (3, 'Anil', 70, 15000, 'N');
INSERT INTO customers VALUES (4, 'Meena', 30, 3000, 'N');

INSERT INTO loans VALUES (101, 1, 8.5, SYSDATE + 10);
INSERT INTO loans VALUES (102, 2, 9.0, SYSDATE + 40);
INSERT INTO loans VALUES (103, 3, 10.0, SYSDATE + 5);
INSERT INTO loans VALUES (104, 4, 7.5, SYSDATE + 25);


COMMIT;
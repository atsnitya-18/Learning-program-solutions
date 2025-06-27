CREATE OR REPLACE PROCEDURE ProcessMonthlyInterest IS
BEGIN
    UPDATE accounts
    SET balance = balance + (balance * 0.01)
    WHERE account_type = 'savings';

    DBMS_OUTPUT.PUT_LINE('Monthly interest processed for savings accounts.');
END;
BEGIN
    ProcessMonthlyInterest;
END;
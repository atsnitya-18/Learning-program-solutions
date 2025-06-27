BEGIN
    FOR cust IN (SELECT customer_id FROM customers WHERE age > 60) LOOP
        UPDATE loans
        SET interest_rate = interest_rate - 1
        WHERE customer_id = cust.customer_id;
    END LOOP;

    COMMIT;

    DBMS_OUTPUT.PUT_LINE('1% discount applied to senior citizens.');
END;
SELECT * FROM loans;
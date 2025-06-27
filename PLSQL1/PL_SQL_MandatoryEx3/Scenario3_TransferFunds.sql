DECLARE
  from_acc_id NUMBER := 1;
  to_acc_id NUMBER := 2;
  transfer_amount NUMBER := 2000;
  from_balance NUMBER;
BEGIN

  SELECT balance INTO from_balance
  FROM accounts
  WHERE account_id = from_acc_id;

  IF from_balance >= transfer_amount THEN

    UPDATE accounts
    SET balance = balance - transfer_amount
    WHERE account_id = from_acc_id;

    UPDATE accounts
    SET balance = balance + transfer_amount
    WHERE account_id = to_acc_id;

    DBMS_OUTPUT.PUT_LINE('Transfer successful.');
  ELSE
    DBMS_OUTPUT.PUT_LINE('Insufficient balance. Transfer failed.');
  END IF;
END;
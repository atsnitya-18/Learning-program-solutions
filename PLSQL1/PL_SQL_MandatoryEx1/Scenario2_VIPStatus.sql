BEGIN
  FOR cust IN (
    SELECT customer_id FROM customers
    WHERE balance > 10000
  ) LOOP
    UPDATE customers
    SET is_vip = 'Y'
    WHERE customer_id = cust.customer_id;
  END LOOP;

  DBMS_OUTPUT.PUT_LINE('VIP status updated for high balance customers.');
END;
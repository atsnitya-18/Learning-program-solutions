DECLARE
  dept_name VARCHAR2(30) := 'Sales';
  bonus_percent NUMBER := 10;
BEGIN
  UPDATE employees
  SET salary = salary + (salary * bonus_percent / 100)
  WHERE department = dept_name;

  DBMS_OUTPUT.PUT_LINE('Bonus updated for department: ' || dept_name);
END;
SELECT *
FROM EMPLOYEES;

select MANAGER_ID
from DEPARTMENTS;

select department_name
from DEPARTMENTS;

SELECT employee_ID, First_Name
from	EMPLOYEES;

SELECT salary as �޿�, SALARY * 12 as ����
from EMPLOYEES;

SELECT FIRST_NAME as �����, (SALARY+ SALARY * nvl(COMMISSION_PCT, 0)) * 12 as "����"
FROM EMPLOYEES;

select first_name || ', ' || last_name as full_name
from EMPLOYEES;

SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, JOB_ID
FROM EMPLOYEES
WHERE JOB_ID = 'IT_PROG';
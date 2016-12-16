select B.EMPLOYEE_ID, B.FIRST_NAME, B.SALARY, A.GRA
from JOB_GRADES A, EMPLOYEES B
WHERE B.SALARY >= A.LOWEST_SAL 
and B.SALARY<=A.HIGHEST_SAL
order by B.Employee_ID;

SELECT A.FIRST_NAME, A.DEPARTMENT_ID, B.DEPARTMENT_NAME
FROM EMPLOYEES A, DEPARTMENTS B
WHERE A.DEPARTMENT_ID = B.DEPARTMENT_ID(+);

--1 ��� ����� �̸�, �μ����̵�, �μ��̸��� ǥ���ϱ�
select A.FIRST_NAME, A.DEPARTMENT_ID , B.department_name
from EMPLOYEES A, DEPARTMENTS B
where B.DEPARTMENT_ID(+) = A.DEPARTMENT_ID;

--2 Ŀ�̼��� �޴� ��� ����� �̸�, �μ��̸�, ��ġ ���̵� �� �������� ǥ���ϱ�
SELECT A.FIRST_NAME, B.DEPARTMENT_NAME, C.LOCATION_ID, C.CITY
from EMPLOYEES A, DEPARTMENTS B, LOCATIONS C
WHERE A.COMMISSION_PCT is not NULL
AND A.DEPARTMENT_ID = B.DEPARTMENT_ID(+)
and B.LOCATION_ID = C.LOCATION_ID(+)
ORDER by A.FIRST_NAME;

--3 �̸��� a�� ���Ե� ��� ����� �̸��� �μ��̸� ǥ���ϱ�
SELECT A.FIRST_NAME, B.DEPARTMENT_NAME
from EMPLOYEES A, DEPARTMENTS B
where A.FIRST_NAME Like '%a%'
-- instr(A.FIRST_NAME, 'a')<>0
AND A.DEPARTMENT_ID = B.DEPARTMENT_ID
order by A.FIRST_NAME;

--4 Toronto�� �ٹ��ϴ� ��� ����� �̸�, ����, �μ���ȣ �� �μ��̸��� ǥ���ϱ�
SELECT B.FIRST_NAME, B.JOB_ID, C.DEPARTMENT_ID, C.DEPARTMENT_NAME
FROM EMPLOYEES B, DEPARTMENTS C, LOCATIONS A
where A.CITY = 'Toronto'
and A.LOCATION_ID = C.LOCATION_ID
and B.DEPARTMENT_ID = C.DEPARTMENT_ID
order by B.FIRST_NAME;

--5 ����� �̸��� ������̵�� �� ����� �����ϴ� ����� ������̵�� ��� �̸��� ǥ���ϱ�
SELECT A.EMPLOYEE_ID as emp_id, A.FIRST_NAME as emp_name, B.EMPLOYEE_ID as manager_id, B.FIRST_NAME as manager_name
from EMPLOYEES A, EMPLOYEES B
where A.MANAGER_ID = B.EMPLOYEE_ID
order by A.EMPLOYEE_ID;

--6 ��� ����� �̸�, ����, �μ��̸�, �޿�, �޿������ ǥ���ϱ�
SELECT A.FIRST_NAME, A.JOB_ID, C.DEPARTMENT_NAME, A.SALARY, B.GRA
FROM EMPLOYEES A, JOB_GRADES B, DEPARTMENTS C
WHERE A.DEPARTMENT_ID = C.DEPARTMENT_ID(+)
and A.SALARY >= B.LOWEST_SAL 
AND A.SALARY <= B.HIGHEST_SAL
order by A.FIRST_NAME;

--7 ������ ��纸�� ���� �Ի��� ����� �̸�, �Ի���, �������� �̸� �� �Ի����� ǥ���ϱ�
SELECT A.FIRST_NAME as ���, to_char(A.HIRE_DATE, 'yyyy-mm-dd')as �Ի���, B.FIRST_NAME as ������, to_char(B.HIRE_DATE, 'yyyy-mm-dd')as �Ի���
FROM EMPLOYEES A, EMPLOYEES B
where A.MANAGER_ID = B.EMPLOYEE_ID
and A.HIRE_DATE < B.HIRE_DATE
order by A.FIRST_NAME;

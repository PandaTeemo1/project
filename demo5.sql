SELECT sum(SALARY), avg(SALARY)
from EMPLOYEES;

select sum(commission_pct), avg(commission_pct)
from EMPLOYEES;

--employees ���̺��� ��� ���� ���� ��ȸ
SELECT count(*)
from EMPLOYEES
where COMMISSION_PCT is null;

select count(*)
from EMPLOYEES
where job_id = 'ST_MAN';

--employees ���̺��� commission_pct �÷��� ����
--null�� �ƴ� ���� ������ ��Þ����.
select count(commission_pct)
from EMPLOYEES;

--employees ���̺��� ������� �����ϰ� �ִ� ������ ������ ��ȸ�Ѵ�.
select count(DISTINCT job_id)
from EMPLOYEES;

--60�� �μ����� ���ϴ� ������� �ּұ޿�, �ְ�޿��� ��ȸ�ϱ�
select min(salary), max(salary)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--60�� �μ����� ���ϴ� ������� ��ձ޿��� ���ϱ�
select avg(salary)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--10,20,30,40�� �μ� ���ϴ� �޿��հ�
select SUM(salary)
from EMPLOYEES
where DEPARTMENT_ID in(10,20,30,40);

--Ŀ�̼��� �޴� ������� �޿� �����
select avg(salary)
from EMPLOYEES
where COMMISSION_PCT is not null;

--60�� �μ����� ���ϴ� ����� �ο��� ��ȸ�ϱ�
select count(*)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--toronto�� ��ġ�� �μ����� ���ϴ� ����� ���ڴ�?
SELECT count(*)
from EMPLOYEES A, DEPARTMENTS B, LOCATIONS C
where C.CITY = 'Toronto'
and A.DEPARTMENT_ID = B.DEPARTMENT_ID
and B.LOCATION_ID = C.LOCATION_ID;

select count(*)
from EMPLOYEES
where to_number(TO_CHAR(HIRE_DATE, 'yy')) >= 06;

select count(*)
from EMPLOYEES
where TO_CHAR(HIRE_DATE, 'mm-dd') = TO_char(SYSDATE, 'mm-dd');

SELECT count(*)
from EMPLOYEES
where to_char(HIRE_DATE, 'mm') = '12';

select DEPARTMENT_ID,count(*)
from EMPLOYEES
group by DEPARTMENT_id
order by Department_id;

SELECT B.department_name, count(*)
FROM EMPLOYEES A, DEPARTMENTS B
where A.DEPARTMENT_ID = B.DEPARTMENT_ID
GROUP by B.DEPARTMENT_NAME
order by B.DEPARTMENT_Name;

SELECT B.department_name, count(*)
FROM EMPLOYEES A, DEPARTMENTS B
where A.DEPARTMENT_ID = B.DEPARTMENT_ID
GROUP by B.DEPARTMENT_NAME
HAVING count(*) >= 20
order by B.DEPARTMENT_Name;

select max(count(*))
from EMPLOYEES
group by DEPARTMENT_id;

SELECT salary, count(*)
from EMPLOYEES
group by salary
order by salary;

SELECT TRUNC(salary/1000)as "����(����:õ�޷�)", count(*)as �ο���
from EMPLOYEES
group by TRUnc(salary/1000)
order by 1;

SELECT DEPARTMENT_ID,job_ID, rpad('=',count(*),'=') || '(' || count(*) || ')'
FROM EMPLOYEES
group by DEPARTMENT_ID, job_id
having DEPARTMENT_ID in(50, 80)
order by 1;

--1 50�� �μ��� �ٹ��ϴ� �ο����� ��ȸ�ϱ�
SELECT count(*) 
FROM EMPLOYEES
where DEPARTMENT_ID = 50;

--2 ��� ����� �ְ� �޿���, ���� �޿���, �ޤ� �Ѿ�, ��� �޿����� ��ȸ�ϱ�
SELECT max(salary), min(salary), sum(salary), avg(salary)
from EMPLOYEES;

--3�������� ������� �ְ� �޿���, �����޿���, �޿� �Ѿ�, ��� �޿��� ��ȸ�ϱ�
select DEPARTMENT_ID, max(salary), min(salary), sum(salary), avg(salary)
from EMPLOYEES
GROUP BY department_id;

--4������ ������ �����ϴ� ������� ���� �������� ǥ���ϱ�
SELECT job_id,count(*)
from EMPLOYEES
group BY job_id;

--5����� �߿��� �������� ������� �ο��� ��ȸ�ϱ�(���ڸ� ǥ��)
SELECT count(DISTINCT MANAGER_ID)
FROM EMPLOYEES;

--6 50�� �μ��� �ְ� �޿��װ� ���� �޿����� ���̸� ��ȸ�ϱ�
select max(salary) - min(salary)
from EMPLOYEES
where DEPARTMENT_ID = 50
GROUP BY DEPARTMENt_Id;


--7 ������ ���̵�� �ش� �����ڿ� ���� ������� �ο����� ǥ���ϱ�
SELECt MANAGER_ID, count(*)
from EMPLOYEES
group by manager_Id;

--8 ������ ���̵�� �ش� �����ڿ� ���� ������� ���� �޿��� ǥ���ϱ�,
--	(�����ڰ� �������� ���� ����� ���� �޿��� 6000�޷� �̸��� �׷��� �����ϱ�)
SELECT MANAGER_ID, count(*), min(salary)
FROM EMPLOYEES
group by manager_ID
HAVING manager_ID is not null
and min(salary) > 6000;



--9 �μ��� �μ��̸��� �����, �μ��� ������� ��� �޿��� ǥ���ϱ�
--��ձ޿��� �Ҽ��� 2��°�ڸ��� �ݿø��ϱ�, �μ��̸� ������ ����
select A.DEPARTMENT_ID, A.DEPARTMENT_NAME, count(*), round(avg(salary), 2)
from DEPARTMENTS A, EMPLOYEES B
where A.DEPARTMENT_ID = B.DEPARTMENT_ID
group by A.DEPARTMENT_ID, A.DEPARTMENT_NAME
order by A.department_name;

--10 �Ի�⵵���� �Ի��� ������� ǥ���ϱ�
select to_char(HIRE_DATE, 'yyyy') , count(*)
from EMPLOYEES
group by to_char(Hire_Date, 'yyyy')
order by 1;

SELECT DEPARTMENT_ID,
	count(DEPARTMENT_ID) as "total",
	sum(decode(TO_CHAR(hire_date, 'yy'), '01', 1, 0))As "2001��",
	sum(decode(TO_CHAR(hire_date, 'yy'), '02', 1, 0))As "2002��",
	sum(decode(TO_CHAR(hire_date, 'yy'), '03', 1, 0))As "2003",
	sum(decode(TO_CHAR(hire_date, 'yy'), '04', 1, 0))As "2004",
	sum(decode(TO_CHAR(hire_date, 'yy'), '05', 1, 0))AS "2005",
	sum(decode(TO_CHAR(hire_date, 'yy'), '06', 1, 0))As "2006",
	sum(decode(TO_CHAR(hire_date, 'yy'), '07', 1, 0))as "2007",
	sum(decode(TO_CHAR(hire_date, 'yy'), '08', 1, 0))as "2008"
FROM EMPLOYEES
group by DEPARTMENT_id
having DEPARTMENT_id is not null
order by 1;
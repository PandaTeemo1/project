--MONTH_BETWEEN(��¥1, ��¥2)
--��¥1�� ��¥2������ ���� ���� ��ȯ�Ѵ�.

select 	first_name,							--�̸� 
		hire_date, 							--�Ի���
		MONTHS_BETWEEN(SYSDATE, hire_date)	--�Ի� �� ��� ���� ��
from EMPLOYEES;

--Add_months(��¥1, ������)
--��¥1���� ������ ������
select ADD_MONTHS(SYSDATE, 5)
from dual;

--Last_day(��¥)
--������ ��¥�� ���� ���� ������ ��¥�� ��ȯ�Ѵ�.
SELECT last_day(sysdate)
from dual;

--next_day(��¥, '����')
--������ ��¥ ������ ��¥ �߿��� �ش� ������ ��¥�� ��ȯ�Ѵ�.
SELECT next_day(sysdate, '�Ͽ���')
from dual;

SELECT TO_CHAR(123456, '999,999')
from dual;

--employees ���̺� ������� �޿��� 3�ڸ����� ,�� �߰��ؼ� ǥ���ϱ�
SELECT first_name, TO_CHAR(salary, '999,999.99')
from EMPLOYEES;

SELECT first_name, to_char(commission_pct, '0.99')
from EMPLOYEES
where COMMISSION_PCT is not null;

SELECT to_char(1.32, '0.99')
from dual;

select '11' * 2
FROM DUAL;

--to_number('���ڷκ�ȯ�� ����', '������ �����')
select to_number('1,234','9,999')*2
from dual;

select to_char(sysdate, 'yyyy-mm-dd')
from dual;

select to_char(SYSdate, 'hh:mi:ss')
from dual;

select to_char(sysdate, 'hh24:mi:ss')
from dual;

--employees ���̺��� ���� ù���� �Ի��� ����� �̸�, �Ի��� ��ȸ�ϱ�

SELECT first_name, HIRE_DATE
from EMPLOYEES
where to_char(hire_date,'dd') = '01';
--WHERE substr(to_char(HIRE_DATE, 'yyyy-mm-dd'), 9, 2) = 01;

SELECT FIRST_NAME, HIRE_DATE
from EMPLOYEES
WHERE to_char(last_day(hire_date), 'mm-dd') = to_char(hire_date, 'mm-dd');

SELECT FIRST_NAME, HIRE_DATE
from EMPLOYEES
where to_char(HIRE_DATE, 'yyyy') = '2002';

SELECT FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
where to_char(HIRE_DATE, 'mm-dd')  = to_char(SYSDATE, 'mm-dd');

select to_date('2002/12/12', 'yyyy/mm/dd')
from dual;

select to_date('12/12', 'mm/dd')
from dual;

select FIRST_NAME, HIRE_DATE
FROM EMPLOYEES
WHERE to_char(HIRE_DATE, 'yyyy') <= 2004;

select first_name, hire_date
from EMPLOYEES
where HIRE_DATE < to_date('2005/01/01');

select COMMISSION_PCT, nvl(COMMISSION_PCT, 0)
from EMPLOYEES;

SELECT EMPLOYEE_ID,FIRST_NAME, SALARY, COMMISSION_PCT, salary * 12 + salary * 12 * nvl(commission_pct, 0)as ����
from EMPLOYEES;

SELECT FIRST_NAME, COMMISSION_PCT, nvl(to_char(COMMISSION_PCT),'����')
FROM EMPLOYEES;

select commission_pct, nvl2(commission_pct, '����', '����')
from EMPLOYEES;

select first_name,
		salary,
		commission_pct,
		salary*12 + nvl2(commission_pct,salary*12*commission_pct,0)
from EMPLOYEES;

--if�� �䳻�� ���� �ִ� ǥ����
--case��
--case when ǥ����1 then ��ȯ��_ǥ����1
--		when ǥ����2 then ��ȯ��_ǥ����2
--		else ��ȯ��_ǥ����
--end
SELECT case when 1 = 1 then 3
			when 1 = 1 then 4
		END
from dual; 


SELECT first_name, salary, case when salary<=10000 then salary*1.2
								WHEN salary<=20000 then salary*1.1
								else salary*1.05
								END AS �λ�ݾ�
from EMPLOYEES;

SELECT 	FIRST_NAME,
		DEPARTMENT_ID,
		case when DEPARTMENT_ID in(10,20,30,40) then '"A"��'
			when DEPARTMENT_ID in(50,60) then '"B"��'
			else '"C"��'
			END as ����
from EMPLOYEES
order by ����;

--decode ��
--decode(�÷� Ȥ�� ǥ����, ǥ����1, �����1,
--							ǥ����2, �����2,
--							ǥ����3, �����3,
--							�⺻��)
-- �÷� Ȥ�� ǥ������ ���� ǥ����1�� ��ġ�ϸ� �����1�� �������� �������� �ǰ�
-- ǥ����2�� ��ġ�ϸ� �����2�� �������� �������� �ǰ�
-- ǥ����3�� ��ġ�ϸ� �����3�� �������� �������� �ǰ� �������� �⺻���� �ȴ�.
SELECT first_name, department_ID, decode(department_ID, 10, 'A', 20,'A', 30,'A',40,'A',
														50,'B',60, 'B','C')
from EMPLOYEES;

SELECT salary, decode(trunc(salary/1000, -1), 0, '1���޷� ���� ������', 10, '1���޷� �̻� ������', 20, '2���޷� �̻� ������') as ���޴��
from EMPLOYEES;

--1
select to_char(SYSDATE, 'yyyy.mm.dd')
from dual;

--2
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, salary*1.15
from EMPLOYEES;

--3
SELECT EMPLOYEE_ID, FIRST_NAME, SALARY, salary*1.15, salary*1.15-salary
from EMPLOYEES;

--4
SELECT first_name
from EMPLOYEES
WHERE substr(first_name, 1, 1) in ('A','J','M');
--5
SELECT first_name, hire_date, trunc(MONTHS_BETWEEN(SYSDATE, hire_date))As �ٹ���
FROM EMPLOYEES
order by �ٹ���;

--6
SELECT FIRST_NAME, SALARY, rpad('*',SALARY/1000,'*')
from EMPLOYEES;

--7
select FIRST_NAME, JOB_ID, decode(job_id, 'AD_PRES', 'A', 'ST_MAN', 'B', 'IT_PROG', 'C', 'SA_REP', 'D', 'ST_CLERK', 'E', 'Z') AS ������
from EMPLOYEES;
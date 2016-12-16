--MONTH_BETWEEN(날짜1, 날짜2)
--날짜1과 날짜2사이의 개월 수를 반환한다.

select 	first_name,							--이름 
		hire_date, 							--입사일
		MONTHS_BETWEEN(SYSDATE, hire_date)	--입사 후 경과 개월 수
from EMPLOYEES;

--Add_months(날짜1, 개월수)
--날짜1에서 지정된 개월수
select ADD_MONTHS(SYSDATE, 5)
from dual;

--Last_day(날짜)
--지정된 날짜가 속한 달의 마지막 날짜를 반환한다.
SELECT last_day(sysdate)
from dual;

--next_day(날짜, '요일')
--지정된 날짜 이후의 날짜 중에서 해당 요일의 날짜를 반환한다.
SELECT next_day(sysdate, '일요일')
from dual;

SELECT TO_CHAR(123456, '999,999')
from dual;

--employees 테이블에 사원들의 급여를 3자리마다 ,를 추가해서 표시하기
SELECT first_name, TO_CHAR(salary, '999,999.99')
from EMPLOYEES;

SELECT first_name, to_char(commission_pct, '0.99')
from EMPLOYEES
where COMMISSION_PCT is not null;

SELECT to_char(1.32, '0.99')
from dual;

select '11' * 2
FROM DUAL;

--to_number('숫자로변환할 문자', '문자의 생김새')
select to_number('1,234','9,999')*2
from dual;

select to_char(sysdate, 'yyyy-mm-dd')
from dual;

select to_char(SYSdate, 'hh:mi:ss')
from dual;

select to_char(sysdate, 'hh24:mi:ss')
from dual;

--employees 테이블에서 월의 첫날에 입사한 사람의 이름, 입사일 조회하기

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

SELECT EMPLOYEE_ID,FIRST_NAME, SALARY, COMMISSION_PCT, salary * 12 + salary * 12 * nvl(commission_pct, 0)as 연봉
from EMPLOYEES;

SELECT FIRST_NAME, COMMISSION_PCT, nvl(to_char(COMMISSION_PCT),'없음')
FROM EMPLOYEES;

select commission_pct, nvl2(commission_pct, '있음', '없음')
from EMPLOYEES;

select first_name,
		salary,
		commission_pct,
		salary*12 + nvl2(commission_pct,salary*12*commission_pct,0)
from EMPLOYEES;

--if문 흉내를 낼수 있는 표현식
--case문
--case when 표현식1 then 반환값_표현식1
--		when 표현식2 then 반환값_표현식2
--		else 반환값_표현식
--end
SELECT case when 1 = 1 then 3
			when 1 = 1 then 4
		END
from dual; 


SELECT first_name, salary, case when salary<=10000 then salary*1.2
								WHEN salary<=20000 then salary*1.1
								else salary*1.05
								END AS 인상금액
from EMPLOYEES;

SELECT 	FIRST_NAME,
		DEPARTMENT_ID,
		case when DEPARTMENT_ID in(10,20,30,40) then '"A"팀'
			when DEPARTMENT_ID in(50,60) then '"B"팀'
			else '"C"팀'
			END as 팀명
from EMPLOYEES
order by 팀명;

--decode 문
--decode(컬럼 혹은 표현식, 표현식1, 결과식1,
--							표현식2, 결과식2,
--							표현식3, 결과식3,
--							기본값)
-- 컬럼 혹은 표현식의 길이 표현식1과 일치하면 결과식1의 수행결과가 최종값이 되고
-- 표현식2와 일치하면 결과식2의 수행결과가 최종값이 되고
-- 표현식3과 일치하면 결과식3의 수행결과가 최종값이 되고 나머지는 기본값이 된다.
SELECT first_name, department_ID, decode(department_ID, 10, 'A', 20,'A', 30,'A',40,'A',
														50,'B',60, 'B','C')
from EMPLOYEES;

SELECT salary, decode(trunc(salary/1000, -1), 0, '1만달러 이하 지급자', 10, '1만달러 이상 지급자', 20, '2만달러 이상 지급자') as 지급대상
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
SELECT first_name, hire_date, trunc(MONTHS_BETWEEN(SYSDATE, hire_date))As 근무달
FROM EMPLOYEES
order by 근무달;

--6
SELECT FIRST_NAME, SALARY, rpad('*',SALARY/1000,'*')
from EMPLOYEES;

--7
select FIRST_NAME, JOB_ID, decode(job_id, 'AD_PRES', 'A', 'ST_MAN', 'B', 'IT_PROG', 'C', 'SA_REP', 'D', 'ST_CLERK', 'E', 'Z') AS 사원등급
from EMPLOYEES;
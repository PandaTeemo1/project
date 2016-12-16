SELECT sum(SALARY), avg(SALARY)
from EMPLOYEES;

select sum(commission_pct), avg(commission_pct)
from EMPLOYEES;

--employees 테이블의 모든 행의 갯수 조회
SELECT count(*)
from EMPLOYEES
where COMMISSION_PCT is null;

select count(*)
from EMPLOYEES
where job_id = 'ST_MAN';

--employees 테이블에서 commission_pct 컬럼의 값이
--null이 아닌 행의 갯수를 조횧ㄴ다.
select count(commission_pct)
from EMPLOYEES;

--employees 테이블에서 사원들이 종사하고 있는 업무의 갯수를 조회한다.
select count(DISTINCT job_id)
from EMPLOYEES;

--60번 부서에서 일하는 사람들의 최소급여, 최고급여를 조회하기
select min(salary), max(salary)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--60번 부서에서 일하는 사람들의 평균급여를 죄하기
select avg(salary)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--10,20,30,40번 부서 일하는 급여합계
select SUM(salary)
from EMPLOYEES
where DEPARTMENT_ID in(10,20,30,40);

--커미션을 받는 사람들의 급여 평균을
select avg(salary)
from EMPLOYEES
where COMMISSION_PCT is not null;

--60번 부서에서 일하는 사람의 인원수 조회하기
select count(*)
from EMPLOYEES
where DEPARTMENT_ID = 60;

--toronto에 위치한 부서에서 일하는 사원의 숫자는?
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

SELECT TRUNC(salary/1000)as "연봉(단위:천달러)", count(*)as 인원수
from EMPLOYEES
group by TRUnc(salary/1000)
order by 1;

SELECT DEPARTMENT_ID,job_ID, rpad('=',count(*),'=') || '(' || count(*) || ')'
FROM EMPLOYEES
group by DEPARTMENT_ID, job_id
having DEPARTMENT_ID in(50, 80)
order by 1;

--1 50번 부서에 근무하는 인원수를 조회하기
SELECT count(*) 
FROM EMPLOYEES
where DEPARTMENT_ID = 50;

--2 모든 사원의 최고 급여액, 최저 급여액, 급ㅇ 총액, 평균 급여액을 조회하기
SELECT max(salary), min(salary), sum(salary), avg(salary)
from EMPLOYEES;

--3업무별로 사원들의 최고 급여액, 최저급여액, 급여 총액, 평균 급여액 조회하기
select DEPARTMENT_ID, max(salary), min(salary), sum(salary), avg(salary)
from EMPLOYEES
GROUP BY department_id;

--4동일한 업무에 종사하는 사원들의 수를 업무별로 표시하기
SELECT job_id,count(*)
from EMPLOYEES
group BY job_id;

--5사원들 중에서 관리자인 사원들의 인원수 조회하기(숫자만 표시)
SELECT count(DISTINCT MANAGER_ID)
FROM EMPLOYEES;

--6 50번 부서의 최고 급여액과 최저 급여액의 차이를 조회하기
select max(salary) - min(salary)
from EMPLOYEES
where DEPARTMENT_ID = 50
GROUP BY DEPARTMENt_Id;


--7 관리자 아이디와 해당 관리자에 속한 사원들의 인원수를 표시하기
SELECt MANAGER_ID, count(*)
from EMPLOYEES
group by manager_Id;

--8 관리자 아이디와 해당 관리자에 속한 사원들의 최저 급여를 표시하기,
--	(관리자가 지정되지 않은 사원과 최저 급여가 6000달러 미만인 그룹은 제외하기)
SELECT MANAGER_ID, count(*), min(salary)
FROM EMPLOYEES
group by manager_ID
HAVING manager_ID is not null
and min(salary) > 6000;



--9 부서명 부서이름과 사원수, 부서내 사원들의 평균 급여를 표시하기
--평균급여는 소숫점 2번째자리로 반올림하기, 부서이름 순으로 정렬
select A.DEPARTMENT_ID, A.DEPARTMENT_NAME, count(*), round(avg(salary), 2)
from DEPARTMENTS A, EMPLOYEES B
where A.DEPARTMENT_ID = B.DEPARTMENT_ID
group by A.DEPARTMENT_ID, A.DEPARTMENT_NAME
order by A.department_name;

--10 입사년도별로 입사한 사원수를 표시하기
select to_char(HIRE_DATE, 'yyyy') , count(*)
from EMPLOYEES
group by to_char(Hire_Date, 'yyyy')
order by 1;

SELECT DEPARTMENT_ID,
	count(DEPARTMENT_ID) as "total",
	sum(decode(TO_CHAR(hire_date, 'yy'), '01', 1, 0))As "2001년",
	sum(decode(TO_CHAR(hire_date, 'yy'), '02', 1, 0))As "2002년",
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
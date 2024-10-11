-- 코드를 작성해주세요
select hd.DEPT_ID, dept_name_en, round(avg(SAL), 0) as avg_sal
from HR_DEPARTMENT hd
join HR_EMPLOYEES he
on hd.DEPT_ID = he.DEPT_ID
group by hd.DEPT_ID
order by avg_sal desc;
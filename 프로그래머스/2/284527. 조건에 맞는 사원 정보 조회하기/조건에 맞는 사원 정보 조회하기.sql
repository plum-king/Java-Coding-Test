-- 코드를 작성해주세요
select sum(SCORE) as SCORE, he.EMP_NO, EMP_NAME, POSITION, EMAIL
from HR_EMPLOYEES he
join HR_GRADE hg
on he.EMP_NO = hg.EMP_NO
where YEAR = 2022
group by he.EMP_NO
order by score desc
limit 1;
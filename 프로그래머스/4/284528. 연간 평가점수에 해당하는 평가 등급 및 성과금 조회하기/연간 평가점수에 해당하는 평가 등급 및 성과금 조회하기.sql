-- 코드를 작성해주세요
select he.EMP_NO, EMP_NAME, 
(case 
 when average >= 96 then 'S'
 when average >= 90 then 'A'
 when average >= 80 then 'B'
 else 'C'
 end)
as GRADE, 
((case 
 when average >= 96 then 0.2
 when average >= 90 then 0.15
 when average >= 80 then 0.1
 else 0
 end) * SAL)
as BONUS
from HR_EMPLOYEES he
join 
(select EMP_NO, avg(score) as average from HR_GRADE group by EMP_NO) as tmp
on tmp.EMP_NO = he.EMP_NO
order by EMP_NO;
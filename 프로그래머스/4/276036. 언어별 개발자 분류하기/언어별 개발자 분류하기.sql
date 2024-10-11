-- 코드를 작성해주세요
select 
(case
    when (skill_code & (select sum(CODE) from SKILLCODES where category like 'Front%')) and (SKILL_CODE & (select CODE from SKILLCODES where name ='Python')) then 'A'
    when SKILL_CODE & (select CODE from SKILLCODES where name ='C#') then 'B'
    when SKILL_CODE & (select sum(CODE) from SKILLCODES where category like 'front%') then 'C'
    else null
end) as GRADE, ID, EMAIL
from DEVELOPERS
-- group by GRADE, ID, EMAIL
having grade is not null
order by GRADE, ID;

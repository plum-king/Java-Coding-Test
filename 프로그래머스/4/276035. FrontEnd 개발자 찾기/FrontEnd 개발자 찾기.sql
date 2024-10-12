-- 코드를 작성해주세요
select distinct id, email, first_name, last_name
from developers d
join skillcodes s
on s.code = s.code & d.skill_code
where s.category Like 'Front%'
order by id;
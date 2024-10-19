-- 코드를 작성해주세요
select count(*) as fish_count, max(length) max_length, fish_type
from (select id, fish_type, ifnull(length, 10) as length from fish_info) as new_length
group by fish_type
having avg(length) >= 33
order by fish_type;
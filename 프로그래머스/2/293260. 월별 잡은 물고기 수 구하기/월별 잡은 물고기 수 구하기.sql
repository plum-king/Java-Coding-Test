-- 코드를 작성해주세요
select count(*) as FISH_COUNT, month(TIME) as month
from FISH_INFO
group by month
order by month;
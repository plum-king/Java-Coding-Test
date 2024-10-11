-- 코드를 작성해주세요
select count(*) as FISH_COUNT, FISH_NAME
from FISH_NAME_INFO fni
join FISH_INFO fi
on fni.FISH_TYPE = fi.FISH_TYPE
group by FISH_NAME
order by FISH_COUNT desc;
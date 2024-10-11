-- 코드를 작성해주세요
select count(*) as FISH_COUNT, max(NULLIF(length, 10)) as MAX_LENGTH, FISH_TYPE
from FISH_INFO
group by FISH_TYPE
having avg(NULLIF(length, 10)) >= 33
order by FISH_TYPE;
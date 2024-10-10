-- 코드를 작성해주세요
select ID, FISH_NAME, LENGTH
from FISH_INFO fi
join FISH_NAME_INFO fni
on fi.FISH_TYPE = fni.FISH_TYPE
where length = (select max(length) from FISH_INFO where FISH_TYPE = fi.FISH_TYPE)
order by ID;
-- 코드를 입력하세요
SELECT HOUR(DATETIME) as hour, count(*) as COUNT 
from ANIMAL_OUTS
where HOUR(DATETIME) between '9' and '19'
group by HOUR(DATETIME)
order by HOUR(DATETIME);
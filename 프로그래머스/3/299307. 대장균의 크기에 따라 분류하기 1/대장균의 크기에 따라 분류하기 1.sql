-- 코드를 작성해주세요
select id, 
(case
    when 100 >= SIZE_OF_COLONY then 'LOW'
    when 1000 >= SIZE_OF_COLONY then 'MEDIUM'
    else 'HIGH'
end) as SIZE
from ECOLI_DATA
order by ID;
-- 코드를 작성해주세요
select id, 
(case
    when percent_rank() over (order by SIZE_OF_COLONY desc) <= 0.25 then 'CRITICAL'
    when percent_rank() over (order by SIZE_OF_COLONY desc) <= 0.5 then 'HIGH'
    when percent_rank() over (order by SIZE_OF_COLONY desc) <= 0.75 then 'MEDIUM'
    else 'LOW'
end) as colony_name
from ECOLI_DATA
order by id;

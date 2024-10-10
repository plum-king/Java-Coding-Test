-- 코드를 작성해주세요
select ed.ID as ID, 
case
    when ed.per <= 0.25 then 'CRITICAL'
    when ed.per <= 0.5 then 'HIGH'
    when ed.per <= 0.75 then 'MEDIUM'
    else 'LOW'
end as COLONY_NAME
from 
(select ID, PERCENT_RANK() over (order by SIZE_OF_COLONY desc) as per from ECOLI_DATA) as ed
order by ID;
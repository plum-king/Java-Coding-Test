-- 코드를 작성해주세요
select id, coalesce(child_count, 0) as child_count
from ECOLI_DATA as ec1
left join 
(select PARENT_ID, COUNT(*) as CHILD_COUNT
from ECOLI_DATA
group by PARENT_ID) as ec2
on ec1.id = ec2.PARENT_ID
order by id;
-- 코드를 작성해주세요
select ID
from ECOLI_DATA
where PARENT_ID IN (select ID from ECOLI_DATA where PARENT_ID IN (select ID from ECOLI_DATA where PARENT_ID is null))
order by ID;

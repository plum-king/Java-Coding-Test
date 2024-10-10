-- 코드를 작성해주세요
select YEAR(DIFFERENTIATION_DATE) as YEAR , abs(ed2.max_size - SIZE_OF_COLONY) as YEAR_DEV, ed1.ID
from ECOLI_DATA ed1
join (select year(DIFFERENTIATION_DATE) as year, max(SIZE_OF_COLONY) as max_size from ECOLI_DATA group by year) as ed2
on YEAR(ed1.DIFFERENTIATION_DATE) = ed2.year
order by YEAR, YEAR_DEV;
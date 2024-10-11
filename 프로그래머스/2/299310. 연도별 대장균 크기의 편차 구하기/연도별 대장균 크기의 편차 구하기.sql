-- 코드를 작성해주세요
select tmp.year, (max_size - size_of_colony) as year_dev, id
from ECOLI_DATA ed1
join (
select year(DIFFERENTIATION_DATE) as year, max(size_of_colony) as max_size from ECOLI_DATA 
    group by year(DIFFERENTIATION_DATE)
) as tmp
on YEAR(DIFFERENTIATION_DATE) = tmp.year
order by year, year_dev;
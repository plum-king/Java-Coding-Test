-- 코드를 입력하세요
SELECT INGREDIENT_TYPE, sum(TOTAL_ORDER) as TOTAL_ORDER
from FIRST_HALF fh
join ICECREAM_INFO ii
on fh.FLAVOR = ii.FLAVOR 
group by INGREDIENT_TYPE
order by TOTAL_ORDER;
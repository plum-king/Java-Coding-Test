-- 코드를 입력하세요
SELECT tmp.FOOD_TYPE, REST_ID, REST_NAME, tmp.FAVORITES
from REST_INFO ri
join (select FOOD_TYPE, max(FAVORITES) as FAVORITES from REST_INFO group by FOOD_TYPE) as tmp
on tmp.FAVORITES = ri.FAVORITES
group by FOOD_TYPE
order by FOOD_TYPE desc;
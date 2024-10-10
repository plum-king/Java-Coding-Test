-- 코드를 입력하세요
SELECT tmp.CATEGORY, tmp.MAX_PRICE, PRODUCT_NAME
from FOOD_PRODUCT fp
join (SELECT PRODUCT_ID, CATEGORY, max(price) as MAX_PRICE
      from FOOD_PRODUCT
      where category = '과자' or category = '국' or category = '김치' or category = '식용유'
      group by CATEGORY) tmp
on fp.CATEGORY = tmp.CATEGORY
where price = tmp.max_price
group by CATEGORY
order by MAX_PRICE desc;
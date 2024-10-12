-- 코드를 입력하세요
SELECT fp.PRODUCT_ID, PRODUCT_NAME, sum(price * amount) as TOTAL_SALES
from food_product fp
join food_order fo
on fp.product_id = fo.product_id
where date_format(PRODUCE_DATE, '%Y-%m') = '2022-05'
group by fp.product_id
order by TOTAL_SALES desc, product_id;
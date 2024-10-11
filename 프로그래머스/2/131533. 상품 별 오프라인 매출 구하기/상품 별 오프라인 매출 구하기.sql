-- 코드를 입력하세요
SELECT PRODUCT_CODE, sum(SALES_AMOUNT * PRICE) as SALES
from PRODUCT p
join offline_sale os
on p.product_id = os.product_id
group by PRODUCT_CODE
order by SALES desc, PRODUCT_CODE;
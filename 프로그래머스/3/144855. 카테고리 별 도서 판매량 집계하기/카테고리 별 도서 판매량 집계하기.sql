-- 코드를 입력하세요
SELECT CATEGORY, sum(SALES) as TOTAL_SALES
from BOOK b
join BOOK_SALES bs
on b.BOOK_ID = bs.BOOK_ID
 where SALES_DATE LIKE '2022-01%'
group by CATEGORY
order by CATEGORY;
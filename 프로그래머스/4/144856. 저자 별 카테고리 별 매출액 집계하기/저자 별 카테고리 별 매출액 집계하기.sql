-- 코드를 입력하세요
SELECT b.AUTHOR_ID, AUTHOR_NAME, CATEGORY, (sum(PRICE * SALES)) as TOTAL_SALES
from BOOK b
join AUTHOR a
on b.AUTHOR_ID = a.AUTHOR_ID
join BOOK_SALES bs
on b.BOOK_ID = bs.BOOK_ID
where SALES_DATE LIKE '2022-01%'
group by AUTHOR_NAME, CATEGORY
order by AUTHOR_ID, CATEGORY desc;
-- 코드를 입력하세요
SELECT a.AUTHOR_ID, AUTHOR_NAME, CATEGORY, sum(sales * price) as TOTAL_SALES
from book b
join author a
on b.author_id = a.author_id
join book_sales bs
on bs.BOOK_ID = b.book_id
where date_format(SALES_DATE, '%Y-%m') = '2022-01'
group by AUTHOR_ID, CATEGORY
order by AUTHOR_ID, CATEGORY desc;
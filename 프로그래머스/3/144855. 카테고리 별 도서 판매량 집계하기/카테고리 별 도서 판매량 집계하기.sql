-- 코드를 입력하세요
SELECT category, sum(sales) as total_sales
from book b
join book_sales bs
on b.BOOK_ID = bs.BOOK_ID
where date_format(SALES_DATE, '%Y-%m') = '2022-01'
group by category
order by category;
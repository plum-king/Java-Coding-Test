-- 코드를 입력하세요
SELECT user_id, nickname, sum(PRICE) as total_sales
from USED_GOODS_BOARD ugb
join USED_GOODS_USER ugu
on ugb.WRITER_ID = ugu.USER_ID
where status = 'DONE'
group by user_id
having total_sales >= 700000
order by total_sales;
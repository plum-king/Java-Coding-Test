-- 코드를 입력하세요
SELECT USER_ID, NICKNAME, sum(PRICE) as TOTAL_SALES
from USED_GOODS_BOARD ugb
join USED_GOODS_USER ugu
on ugb.WRITER_ID = ugu.USER_ID
where STATUS = 'DONE'
group by USER_ID
having sum(PRICE) >= 700000 
order by TOTAL_SALES;
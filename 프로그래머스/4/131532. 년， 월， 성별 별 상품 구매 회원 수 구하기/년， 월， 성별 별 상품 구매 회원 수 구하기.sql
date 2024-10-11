-- 코드를 입력하세요
SELECT YEAR(SALES_DATE) as YEAR, MONTH(SALES_DATE) as month, GENDER, count(distinct ui.user_id) as USERS
from USER_INFO ui
join ONLINE_SALE os
on ui.USER_ID = os.USER_ID
where GENDER is not null
group by YEAR(SALES_DATE), MONTH(SALES_DATE), gender
order by YEAR, MONTH, GENDER;
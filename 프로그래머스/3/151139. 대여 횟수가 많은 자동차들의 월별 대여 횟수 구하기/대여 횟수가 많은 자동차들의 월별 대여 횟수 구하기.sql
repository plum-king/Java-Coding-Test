-- 코드를 입력하세요

# select car_id, count(*) from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
# where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10' and car_id = 2
# group by car_id
# having count(*) >= 5;
                   

SELECT MONTH(START_DATE) as month, CAR_ID, count(*) as RECORDS
from CAR_RENTAL_COMPANY_RENTAL_HISTORY
where CAR_ID IN (select car_id from CAR_RENTAL_COMPANY_RENTAL_HISTORY 
                   where date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
                   group by car_id
                   having count(*) >= 5
                  ) and date_format(START_DATE, '%Y-%m') between '2022-08' and '2022-10'
group by CAR_ID, month
order by month, CAR_ID desc;
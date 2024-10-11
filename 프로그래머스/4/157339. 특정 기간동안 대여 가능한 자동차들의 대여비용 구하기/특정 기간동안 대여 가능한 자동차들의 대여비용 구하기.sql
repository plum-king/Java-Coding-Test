SELECT crcc.CAR_ID, crcc.CAR_TYPE, 
round(DAILY_FEE*((100-DISCOUNT_RATE)/100)*30, 0) as FEE
from CAR_RENTAL_COMPANY_CAR crcc
join CAR_RENTAL_COMPANY_RENTAL_HISTORY crcrh
on crcc.CAR_ID = crcrh.CAR_ID
join CAR_RENTAL_COMPANY_DISCOUNT_PLAN crcdp
on crcc.CAR_TYPE = crcdp.CAR_TYPE

where crcc.car_id not in (
    select car_id 
    from CAR_RENTAL_COMPANY_RENTAL_HISTORY
    where date_format(end_date, '%Y-%m-%d') >= '2022-11-01' 
    and date_format(start_date, '%Y-%m-%d') <= '2022-11-30'
) and DURATION_TYPE = '30일 이상'
and crcc.CAR_TYPE in ('세단','suv') 
group by crcc.CAR_ID
having fee >= 500000 and fee < 2000000
order by fee desc, CAR_TYPE desc, CAR_ID desc;
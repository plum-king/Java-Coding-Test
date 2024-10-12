# -- 코드를 입력하세요
select tmp.flavor
from
(select fh.flavor, (total1 + total2) as tot_sum 
 from
    (SELECT FLAVOR, sum(total_order) as total1
    from first_half
    group by flavor) as fh
join
    (SELECT FLAVOR, sum(total_order) as total2
    from july
    group by flavor) as j
on fh.flavor = j.flavor
) as tmp
order by tot_sum desc
limit 3;

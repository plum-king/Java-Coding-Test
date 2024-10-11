-- 코드를 입력하세요
# with recursive tmp as(
#     select 0 as hour, 0 as count 
#     union all
#     select hour+1 as hour, count
#     from tmp
#     where hour < 23
# )

set @hour := -1;
SELECT (@hour := @hour + 1) as HOUR, (select count(*) from ANIMAL_OUTS where hour(DATETIME) = @hour) as count
from ANIMAL_OUTS
where @hour < 23;
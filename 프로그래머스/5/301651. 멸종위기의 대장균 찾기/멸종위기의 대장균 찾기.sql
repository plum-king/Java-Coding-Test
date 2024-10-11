-- 코드를 작성해주세요
with recursive tmp as(
    select id, parent_id, 1 as generation
    from ecoli_data
    where parent_id is null
    union all
    select ed1.id, ed1.parent_id, tmp.generation+1
    from tmp
    join ecoli_data ed1
    on ed1.parent_id = tmp.id
)

select count(*) as count, generation
from tmp
where id not in (select distinct parent_id from tmp where parent_id is not null)
group by generation
order by generation;
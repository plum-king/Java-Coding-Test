-- 코드를 작성해주세요
select it.ITEM_ID, ITEM_NAME
from ITEM_TREE it
join ITEM_INFO ii
on it.item_id = ii.item_id
where PARENT_ITEM_ID is null
order by it.ITEM_ID;
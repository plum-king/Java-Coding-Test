-- 코드를 작성해주세요
select it.ITEM_ID, ITEM_NAME, RARITY
from ITEM_TREE it
join ITEM_INFO ii
on it.ITEM_ID = ii.ITEM_ID
where it.ITEM_ID not in (select distinct parent_item_id from item_tree where parent_item_id is not null) and it.item_id is not null
order by ITEM_ID desc;

# select parent_item_id from item_tree;
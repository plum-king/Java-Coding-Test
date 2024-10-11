-- 코드를 입력하세요
SELECT concat('/home/grep/src/', ugb.BOARD_ID, '/', FILE_ID, FILE_NAME, FILE_EXT) as FILE_PATH
from USED_GOODS_BOARD ugb
join USED_GOODS_FILE ugf
on ugb.BOARD_ID = ugf.BOARD_ID
where ugb.BOARD_ID = (select BOARD_ID from USED_GOODS_BOARD where views = (select max(views) from USED_GOODS_BOARD))
order by file_id desc;
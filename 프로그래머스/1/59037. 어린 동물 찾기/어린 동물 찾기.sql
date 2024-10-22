-- 코드를 입력하세요
SELECT animal_id, name
from ANIMAL_INS
where INTAKE_CONDITION != "aged"
order by animal_id;
-- 코드를 입력하세요
SELECT ai.ANIMAL_ID, ai.animal_type, ai.name
from animal_ins ai
join animal_outs ao
on ai.animal_id = ao.animal_id
where ai.animal_id in (select animal_id from animal_ins where SEX_UPON_INTAKE Like 'Intact%')
and ai.animal_id in 
(select animal_id from animal_outs where sex_upon_outcome like 'Neutered%' or 
sex_upon_outcome like 'Spayed%')
order by animal_id;
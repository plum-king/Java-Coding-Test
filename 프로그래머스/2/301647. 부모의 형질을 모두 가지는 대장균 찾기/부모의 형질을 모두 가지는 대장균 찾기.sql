-- 코드를 작성해주세요
select ed2.ID, ed2.GENOTYPE, ed1.GENOTYPE as PARENT_GENOTYPE
from ECOLI_DATA ed1
JOIN ECOLI_DATA ed2
on ed1.ID = ed2.PARENT_ID
where ed2.GENOTYPE & ed1.GENOTYPE = ed1.GENOTYPE
order by ed2.ID;
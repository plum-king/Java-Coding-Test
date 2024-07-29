-- 코드를 작성해주세요
SELECT
    e4.ID
FROM 
    (SELECT 
        e2.ID
     FROM 
        ECOLI_DATA e1 
     INNER JOIN
        ECOLI_DATA e2 ON e1.ID = e2.PARENT_ID 
     WHERE 
        e1.PARENT_ID IS NULL) e3 
    INNER JOIN 
        ECOLI_DATA e4 ON e3.ID = e4.PARENT_ID
ORDER BY 
    e4.ID
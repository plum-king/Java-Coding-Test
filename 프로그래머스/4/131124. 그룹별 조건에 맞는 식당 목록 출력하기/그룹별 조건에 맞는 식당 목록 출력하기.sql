# -- 코드를 입력하세요
SELECT MEMBER_NAME, REVIEW_TEXT, date_format(REVIEW_DATE, '%Y-%m-%d') as REVIEW_DATE
from MEMBER_PROFILE mr
join REST_REVIEW rr
on mr.member_id = rr.member_id
where mr.member_id = (select member_id from rest_review group by member_id order by count(*) desc limit 1)
order by REVIEW_DATE, REVIEW_TEXT;
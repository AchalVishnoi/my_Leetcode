# Write your MySQL query statement below
with cte as (
    select requester_id as id from RequestAccepted
    union all
    select accepter_id as id from RequestAccepted
),
cnt as (
    select id,count(*) as cnt from cte group by id
)

select id,cnt as num from cnt where cnt=(select max(cnt) from cnt)
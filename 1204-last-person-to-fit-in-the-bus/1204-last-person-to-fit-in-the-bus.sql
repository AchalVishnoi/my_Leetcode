# Write your MySQL query statement below
with ctc as(
    select person_name, sum(weight) over(order by turn) as rs, turn
    from Queue
    order by turn
)

select person_name
from ctc
where rs<=1000
order by turn desc
limit 1
offset 0
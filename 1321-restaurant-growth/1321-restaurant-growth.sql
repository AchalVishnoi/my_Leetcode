# Write your MySQL query statement below
with daily as (
    select visited_on,sum(amount) as amount
    from Customer
    group by visited_on
),
t as (
    select visited_on, sum(amount) over(
        order by visited_on range between interval 6 day preceding and current row
        ) as amount
    from daily
)

select visited_on,amount,round(amount/7,2) as average_amount
from t
where visited_on>=(select date_add(min(visited_on),interval 6 day) from daily)
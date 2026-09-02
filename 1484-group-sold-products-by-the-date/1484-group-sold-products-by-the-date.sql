# Write your MySQL query statement below

select a.sell_date, 
count(distinct product) as num_sold,
group_concat(distinct product order by product separator ',') as products
from Activities a
group by a.sell_date
order by a.sell_date
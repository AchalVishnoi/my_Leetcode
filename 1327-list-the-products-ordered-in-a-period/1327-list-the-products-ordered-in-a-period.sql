# Write your MySQL query statement below
with t as (
    select product_id as id,sum(unit) as unit
    from Orders
    where order_date between '2020-02-01' and '2020-02-29'
    group by product_id
    having sum(unit)>=100
)

select p.product_name, t.unit
from t join Products p
on t.id=p.product_id

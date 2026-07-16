# Write your MySQL query statement below

with lates_price as(
    select product_id, new_price, row_number() over(
        partition by product_id
        order by change_date desc
    ) as rn
    from Products where change_date<='2019-08-16'
)

select p.product_id, coalesce(lp.new_price, 10) as price
from (
    select distinct product_id
    from Products
) as p left join lates_price as lp
on p.product_id=lp.product_id
where lp.rn=1 or lp.rn is null

# Write your MySQL query statement below

with t as (
    select 
        case 
            when ac.income<20000 then 'Low Salary' 
            when ac.income between 20000 and 50000 then 'Average Salary'
            else 'High Salary'
        end as cat
    from Accounts ac
)

select c.cat as category, count(t.cat) as accounts_count
from (
    select 'Low Salary' as cat
    union
    select 'Average Salary' as cat
    union
    select 'High Salary' as cat
) as c left join t
on c.cat=t.cat
group by c.cat
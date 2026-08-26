# Write your MySQL query statement below


select u.user_id, ifnull(round(sum(action='confirmed')/count(*),2),0.00) as confirmation_rate
from Signups u left join Confirmations c
on u.user_id=c.user_id
group by u.user_id

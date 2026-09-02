# Write your MySQL query statement below
with t as (select email, min(id) as id from Person group by email)

delete from Person p
where p.id != (select id from t where email=p.email)
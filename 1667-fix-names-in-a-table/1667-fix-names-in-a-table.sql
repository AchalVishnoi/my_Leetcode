

select u.user_id,CONCAT(UPPER(SUBSTRING(u.name, 1, 1)),LOWER(SUBSTRING(u.name, 2))) as name
from Users u
order by user_id

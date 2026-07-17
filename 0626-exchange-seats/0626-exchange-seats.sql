# Write your MySQL query statement below

select 
(
    case 
        when s.id%2=0 then s.id-1 
        when s.id%2!=0 and s.id!=(SELECT MAX(id) FROM Seat) then s.id+1
        else s.id
    end
) as id,
s.student
from Seat s
order by id
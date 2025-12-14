# Write your MySQL query statement below

SELECT E.name, B.bonus
FROM
(Employee E LEFT JOIN Bonus B ON E.empId=B.empId)

WHERE E.empId
NOT IN 
    (SELECT empId FROM Bonus WHERE bonus>=1000)

WITH cte AS (
    SELECT
        salary,
        DENSE_RANK() OVER (
            ORDER BY salary DESC
        ) AS rn
    FROM Employee
)
SELECT (
    SELECT salary
    FROM cte
    WHERE rn = 2
    LIMIT 1
) AS SecondHighestSalary;
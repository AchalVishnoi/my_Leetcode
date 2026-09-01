with t as (
    select salary, dense_rank() over(order by salary desc) as rn
    from Employee
)

select (select distinct salary from t where rn = 2) as SecondHighestSalary 
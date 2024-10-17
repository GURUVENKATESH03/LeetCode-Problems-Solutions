# Write your MySQL query statement below

        select e1.name as Employee
        from Employee as  e1
        join Employee as  e2
        on e1.managerId = e2.id 
        where e2.salary < e1.salary 

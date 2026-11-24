# Write your MySQL query statement below
Select e.name , b.bonus from employee e
left join bonus b
ON e.empId = b.empId 
Where bonus<1000 OR bonus IS NULL;
select Employee.employee_id, team_size from Employee left join
(select team_id, count(team_id) as team_size from Employee group by team_id) a on a.team_id = Employee.team_id
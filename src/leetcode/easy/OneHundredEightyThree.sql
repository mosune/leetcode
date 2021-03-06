--183. 从不订购的客户
--
--某网站包含两个表，Customers 表和 Orders 表。编写一个 SQL 查询，找出所有从不订购任何东西的客户。
--
--Customers 表：
--
--+----+-------+
--| Id | Name  |
--+----+-------+
--| 1  | Joe   |
--| 2  | Henry |
--| 3  | Sam   |
--| 4  | Max   |
--+----+-------+
--Orders 表：
--
--+----+------------+
--| Id | CustomerId |
--+----+------------+
--| 1  | 3          |
--| 2  | 1          |
--+----+------------+
--例如给定上述表格，你的查询应返回：
--
--+-----------+
--| Customers |
--+-----------+
--| Henry     |
--| Max       |
--+-----------+

-- not in写法
select Name as Customers from Customers where id not in (select DISTINCT CustomerId from Orders);

-- left join 写法
select c.Name as Customers from Customers c left join Orders o on c.Id = o.CustomerId where o.id is null;
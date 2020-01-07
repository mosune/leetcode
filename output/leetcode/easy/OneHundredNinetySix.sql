--196. 删除重复的电子邮箱
--
--编写一个 SQL 查询，来删除 Person 表中所有重复的电子邮箱，重复的邮箱里只保留 Id 最小 的那个。
--
--+----+------------------+
--| Id | Email            |
--+----+------------------+
--| 1  | john@example.com |
--| 2  | bob@example.com  |
--| 3  | john@example.com |
--+----+------------------+
--Id 是这个表的主键。
--例如，在运行你的查询语句之后，上面的 Person 表应返回以下几行:
--
--+----+------------------+
--| Id | Email            |
--+----+------------------+
--| 1  | john@example.com |
--| 2  | bob@example.com  |
--+----+------------------+
-- in方式
delete from Person where `Id` in (select a.Id from (select b.id from Person b, Person a where b.Email = a.Email and b.Id > a.Id) a);

-- not in 方式
delete from Person where `Id` not in (select a.`Id` from (select min(`Id`) as `Id` from Person group by `Email`) a);
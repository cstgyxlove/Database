/**
Given a Weather table, write a SQL query to find all dates' Ids with higher temperature compared to its previous (yesterday's) dates.

+---------+------------+------------------+
| Id(INT) | Date(DATE) | Temperature(INT) |
+---------+------------+------------------+
|       1 | 2015-01-01 |               10 |
|       2 | 2015-01-02 |               25 |
|       3 | 2015-01-03 |               20 |
|       4 | 2015-01-04 |               30 |
+---------+------------+------------------+
For example, return the following Ids for the above Weather table:
+----+
| Id |
+----+
|  2 |
|  4 |
+----+
*/

# Write your MySQL query statement below
SELECT t1.Id
FROM Weather t1
INNER JOIN Weather t2
ON TO_DAYS(t1.Date) = TO_DAYS(t2.Date) + 1
WHERE t1.Temperature > t2.Temperatur

/* TLE!!!!!!!!!!!!!!
SELECT W1.ID 
FROM Weather W1, Weather W2
WHERE W1.TEMPERATURE > 
(SELECT W2.TEMPERATURE
FROM Weather W2
WHERE TO_DAYS(W1.DATE) -TO_DAYS(W2.DATE) = 1)
*/

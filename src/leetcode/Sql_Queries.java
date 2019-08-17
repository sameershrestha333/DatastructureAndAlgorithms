package leetcode;

public class Sql_Queries {
    /*
    176. Second Highest Salary
    SELECT
    (SELECT DISTINCT
            Salary
        FROM
            Employee
        ORDER BY Salary DESC
        LIMIT 1 OFFSET 1
     )
        AS SecondHighestSalary
     */

    /*
    // 182. Duplicate Emails

    SELECT Email FROM Person
    GROUP BY Email
    HAVING Count(Email) >1

    */
}

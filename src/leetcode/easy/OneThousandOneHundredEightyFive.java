package leetcode.easy;

/**
 * 1185. 一周中的第几天
 *
 * 给你一个日期，请你设计一个算法来判断它是对应一周中的哪一天。
 *
 * 输入为三个整数：day、month 和 year，分别表示日、月、年。
 *
 * 您返回的结果必须是这几个值中的一个 {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"}。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：day = 31, month = 8, year = 2019
 * 输出："Saturday"
 * 示例 2：
 *
 * 输入：day = 18, month = 7, year = 1999
 * 输出："Sunday"
 * 示例 3：
 *
 * 输入：day = 15, month = 8, year = 1993
 * 输出："Sunday"
 *  
 *
 * 提示：
 *
 * 给出的日期一定是在 1971 到 2100 年之间的有效日期。
 *
 * @author gcg
 * @create 2020-03-24 13:49
 **/
public class OneThousandOneHundredEightyFive {

    public String dayOfTheWeek(int day, int month, int year) {
        String[] results = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};
        int[][] months = {{1, 31}, {2, 28}, {3, 31}, {4, 30}, {5, 31}, {6, 30}, {7, 31}, {8, 31}, {9, 30}, {10, 31}, {11, 30}, {12, 31}};

        // 从1971年1月1日开始计算，有一个基姆拉尔森计算公式从0年1月1日开始计算
        int days = day;
        for (int i = 0; i < month - 1; i++) days += months[i][1];
        days += (year - 1971) * 365;
        days += (year - 1971) / 4;
        int n = (year - 1971) % 4;
        if (n > 1) days++;
        else if (n == 1 && month > 2) days++;

        return results[(days + 4) % 7];
    }

}

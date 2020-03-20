package leetcode.easy;

/**
 * 1154. 一年中的第几天
 *
 * 给你一个按 YYYY-MM-DD 格式表示日期的字符串 date，请你计算并返回该日期是当年的第几天。
 *
 * 通常情况下，我们认为 1 月 1 日是每年的第 1 天，1 月 2 日是每年的第 2 天，依此类推。每个月的天数与现行公元纪年法（格里高利历）一致。
 *
 *
 *
 * 示例 1：
 *
 * 输入：date = "2019-01-09"
 * 输出：9
 * 示例 2：
 *
 * 输入：date = "2019-02-10"
 * 输出：41
 * 示例 3：
 *
 * 输入：date = "2003-03-01"
 * 输出：60
 * 示例 4：
 *
 * 输入：date = "2004-03-01"
 * 输出：61
 *
 *
 * 提示：
 *
 * date.length == 10
 * date[4] == date[7] == '-'，其他的 date[i] 都是数字。
 * date 表示的范围从 1900 年 1 月 1 日至 2019 年 12 月 31 日。
 *
 * @author gcg
 * @create 2020-03-20 12:16
 **/
public class OneThousandOneHundredFiftyFour {

    public int dayOfYear(String date) {
        int[][] months = {{1, 31}, {2, 28}, {3, 31}, {4, 30}, {5, 31}, {6, 30}, {7, 31}, {8, 31}, {9, 30}, {10, 31}, {11, 30}, {12, 31}};

        int sum = 0;
        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        sum += Integer.parseInt(date.substring(8));

        for (int i = 0; i < month - 1; i++) sum += months[i][1];
        if (year % 4 == 0 && month > 2 && year != 1900) sum++;
        return sum;
    }

}

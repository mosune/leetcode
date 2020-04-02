package leetcode.easy;

/**
 * 1360. 日期之间隔几天
 *
 * 请你编写一个程序来计算两个日期之间隔了多少天。
 *
 * 日期以字符串形式给出，格式为 YYYY-MM-DD，如示例所示。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：date1 = "2019-06-29", date2 = "2019-06-30"
 * 输出：1
 * 示例 2：
 *
 * 输入：date1 = "2020-01-15", date2 = "2019-12-31"
 * 输出：15
 *  
 *
 * 提示：
 *
 * 给定的日期是 1971 年到 2100 年之间的有效日期。
 *
 * @author gcg
 * @create 2020-04-02 13:19
 **/
public class OneThousandThreeHundredSixty {

    int[][] months = {{1, 31}, {2, 28}, {3, 31}, {4, 30}, {5, 31}, {6, 30}, {7, 31}, {8, 31}, {9, 30}, {10, 31}, {11, 30}, {12, 31}};

    public int daysBetweenDates(String date1, String date2) {
        return Math.abs(getDay(date1) - getDay(date2));
    }

    private int getDay(String date) {
        int days = 0;

        int year = Integer.parseInt(date.substring(0, 4));
        int month = Integer.parseInt(date.substring(5, 7));
        int day = Integer.parseInt(date.substring(8));

        // 年
        days += (year - 1971) * 365;
        // 月
        for (int i = 0; i < month - 1; i++) days += months[i][1];
        // 日
        days += day;
        // 闰年个数
        if (year > 1971) days += (year - 1972) / 4 + 1;
        // 当前为闰年并且一月二月减1
        if (year % 4 == 0 && month < 3) days--;
        // 减去2100年
        if (year == 2100 && month > 3) days--;

        return days;
    }

}

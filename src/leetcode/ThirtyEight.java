package leetcode;

/**
 *
 * 报数序列是一个整数序列，按照其中的整数的顺序进行报数，得到下一个数。其前五项如下：
 *
 * 1.     1
 * 2.     11
 * 3.     21
 * 4.     1211
 * 5.     111221
 * 1 被读作  "one 1"  ("一个一") , 即 11。
 * 11 被读作 "two 1s" ("两个一"）, 即 21。
 * 21 被读作 "one 2",  "one 1" （"一个二" ,  "一个一") , 即 1211。
 *
 * 给定一个正整数 n（1 ≤ n ≤ 30），输出报数序列的第 n 项。
 *
 * 注意：整数顺序将表示为一个字符串。
 *
 *
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: "1"
 * 示例 2:
 *
 * 输入: 4
 * 输出: "1211"
 *
 * @author gcg
 * @create 2019-05-14 12:42
 **/
public class ThirtyEight {

    public String countAndSay(int n) {
        if (n == 1) return "1";
        String index = "1";
        StringBuilder sb = null;
        for (int i = 1; i < n; i++) {
            int count = 0;
            char[] chars = index.toCharArray();
            int pre = 0;
            sb = new StringBuilder();
            for (int j = 0; j < chars.length; j++) {
                if (chars[j] == chars[pre]) {
                    count++;
                    continue;
                }
                sb.append(count + "" + chars[pre]);
                count = 1;
                pre = j;
            }
            sb.append(count + "" + chars[pre]);
            index = sb.toString();
        }
        return sb.toString();
    }

}

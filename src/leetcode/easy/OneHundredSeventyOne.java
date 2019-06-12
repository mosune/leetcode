package leetcode.easy;

/**
 * 171. Excel表列序号
 *
 * 给定一个Excel表格中的列名称，返回其相应的列序号。
 *
 * 例如，
 *
 *     A -> 1
 *     B -> 2
 *     C -> 3
 *     ...
 *     Z -> 26
 *     AA -> 27
 *     AB -> 28
 *     ...
 * 示例 1:
 *
 * 输入: "A"
 * 输出: 1
 * 示例 2:
 *
 * 输入: "AB"
 * 输出: 28
 * 示例 3:
 *
 * 输入: "ZY"
 * 输出: 701
 *
 * @author gcg
 * @create 2019-06-12 10:05
 **/
public class OneHundredSeventyOne {

    public int titleToNumber(String s) {
        char[] chars = s.toCharArray();
        int sum = 0;
        // 进制求解
//        for (int i = chars.length - 1; i >= 0; i--) {
//            sum += (int) ((chars[i] - 64) * Math.pow(26, chars.length - 1 - i));
//        }

        // todo：巧妙求解法
        for (int i = 0; i < chars.length; i++) {
            int num = chars[i] - 64;
            sum = sum * 26 + num;
        }
        return sum;
    }

}

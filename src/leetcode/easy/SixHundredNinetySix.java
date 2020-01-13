package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 696. 计数二进制子串
 *
 * 给定一个字符串 s，计算具有相同数量0和1的非空(连续)子字符串的数量，并且这些子字符串中的所有0和所有1都是组合在一起的。
 *
 * 重复出现的子串要计算它们出现的次数。
 *
 * 示例 1 :
 *
 * 输入: "00110011"
 * 输出: 6
 * 解释: 有6个子串具有相同数量的连续1和0：“0011”，“01”，“1100”，“10”，“0011” 和 “01”。
 *
 * 请注意，一些重复出现的子串要计算它们出现的次数。
 *
 * 另外，“00110011”不是有效的子串，因为所有的0（和1）没有组合在一起。
 * 示例 2 :
 *
 * 输入: "10101"
 * 输出: 4
 * 解释: 有4个子串：“10”，“01”，“10”，“01”，它们具有相同数量的连续1和0。
 * 注意：
 *
 * s.length 在1到50,000之间。
 * s 只包含“0”或“1”字符。
 *
 * @author gcg
 * @create 2019-11-12 16:39
 **/
public class SixHundredNinetySix {

//    public int countBinarySubstrings(String s) {
//        char[] chars = s.toCharArray();
//        int preSize, index = 0, num = chars[0], sum = 0;
//        while (index < chars.length && chars[index] == num) {
//            index++;
//        }
//        preSize = index;
//
//        if (index >= chars.length) {
//            return 0;
//        }
//        num = chars[index];
//        int now = index;
//        while (index < chars.length) {
//            if (chars[index] == num) {
//                index++;
//            } else {
//                int length = index - now;
//                sum += Math.min(preSize, length);
//                preSize = length;
//                now = index;
//                num = chars[index];
//            }
//        }
//
//        return sum + Math.min(preSize, s.length() - now);
//    }

    public int countBinarySubstrings(String s) {
        char[] chars = s.toCharArray();
        List<Integer> results = new ArrayList<>(chars.length);

        int num = chars[0];
        int index = 0;
        for (int i = 0; i < chars.length; i++) {
            if (chars[i] != num) {
                results.add(i - index);
                index = i;
                num = chars[i];
            }
        }
        results.add(chars.length - index);

        int sum = 0;
        for (int i = 1; i < results.size(); i++) {
            sum += Math.min(results.get(i), results.get(i - 1));
        }

        return sum;
    }


}

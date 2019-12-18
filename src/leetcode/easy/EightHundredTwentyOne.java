package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 821. 字符的最短距离
 *
 * 给定一个字符串 S 和一个字符 C。返回一个代表字符串 S 中每个字符到字符串 S 中的字符 C 的最短距离的数组。
 *
 * 示例 1:
 *
 * 输入: S = "loveleetcode", C = 'e'
 * 输出: [3, 2, 1, 0, 1, 0, 0, 1, 2, 2, 1, 0]
 * 说明:
 *
 * 字符串 S 的长度范围为 [1, 10000]。
 * C 是一个单字符，且保证是字符串 S 里的字符。
 * S 和 C 中的所有字母均为小写字母。
 *
 * @author gcg
 * @create 2019-12-17 19:57
 **/
public class EightHundredTwentyOne {

//    public int[] shortestToChar(String S, char C) {
//        int[] nums = new int[S.length()];
//
//        List<Integer> list = new ArrayList<>();
//        int index = S.indexOf(C);
//        while (index != -1) {
//            list.add(index);
//            index = S.indexOf(C, index + 1);
//        }
//
//        int num;
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < list.size(); j++) {
//                num = list.get(j);
//                if (i < num) {
//                    if (j == 0) {
//                        nums[i] = num - i;
//                        break;
//                    } else {
//                        nums[i] = Math.min(num - i, i - list.get(j - 1));
//                        break;
//                    }
//                } else if (i == num) {
//                    nums[i] = 0;
//                    break;
//                } else {
//                    if (j == list.size() - 1) {
//                        nums[i] = i - list.get(j);
//                        break;
//                    }
//                }
//            }
//        }
//
//        return nums;
//    }

    public int[] shortestToChar(String S, char C) {
        int[] nums = new int[S.length()];
        int pre = Integer.MIN_VALUE / 2;

        // 前遍历一次
        for (int i = 0; i < S.length(); i++) {
            if (S.charAt(i) == C) pre = i;
            nums[i] = i - pre;
        }

        // 后遍历一次
        pre = Integer.MAX_VALUE / 2;
        for (int i = S.length() - 1; i >= 0; i--) {
            if (S.charAt(i) == C) pre = i;
            nums[i] = Math.min(nums[i], pre - i);
        }
        return nums;
    }

}

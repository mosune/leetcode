package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1317. 将整数转换为两个无零整数的和
 *
 * 「无零整数」是十进制表示中 不含任何 0 的正整数。
 *
 * 给你一个整数 n，请你返回一个 由两个整数组成的列表 [A, B]，满足：
 *
 * A 和 B 都是无零整数
 * A + B = n
 * 题目数据保证至少有一个有效的解决方案。
 *
 * 如果存在多个有效解决方案，你可以返回其中任意一个。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：n = 2
 * 输出：[1,1]
 * 解释：A = 1, B = 1. A + B = n 并且 A 和 B 的十进制表示形式都不包含任何 0 。
 * 示例 2：
 *
 * 输入：n = 11
 * 输出：[2,9]
 * 示例 3：
 *
 * 输入：n = 10000
 * 输出：[1,9999]
 * 示例 4：
 *
 * 输入：n = 69
 * 输出：[1,68]
 * 示例 5：
 *
 * 输入：n = 1010
 * 输出：[11,999]
 *  
 *
 * 提示：
 *
 * 2 <= n <= 10^4
 *
 * @author gcg
 * @create 2020-03-31 11:43
 **/
public class OneThousandThreeHundredSeventeen {

    private Map<Integer, Boolean> map = new HashMap<>();

    public int[] getNoZeroIntegers(int n) {
        int[] nums = new int[2];

        for (int i = 1; i < n; i++) {
            if (checkZero(i) && checkZero(n - i)) {
                nums[0] = i;
                nums[1] = n - i;
                break;
            }
        }

        return nums;
    }

    private boolean checkZero(int n) {
        if (map.containsKey(n)) return map.get(n);
        while (n != 0) {
            if (n % 10 == 0) {
                map.put(n, false);
                return false;
            }
            n /= 10;
        }
        map.put(n, true);
        return true;
    }

}

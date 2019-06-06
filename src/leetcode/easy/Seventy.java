package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Objects;

/**
 *
 * 假设你正在爬楼梯。需要 n 阶你才能到达楼顶。
 *
 * 每次你可以爬 1 或 2 个台阶。你有多少种不同的方法可以爬到楼顶呢？
 *
 * 注意：给定 n 是一个正整数。
 *
 * 示例 1：
 *
 * 输入： 2
 * 输出： 2
 * 解释： 有两种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶
 * 2.  2 阶
 * 示例 2：
 *
 * 输入： 3
 * 输出： 3
 * 解释： 有三种方法可以爬到楼顶。
 * 1.  1 阶 + 1 阶 + 1 阶
 * 2.  1 阶 + 2 阶
 * 3.  2 阶 + 1 阶
 *
 * @author gcg
 * @create 2019-05-24 22:24
 **/
public class Seventy {

    // 递归
//    private Map map = new HashMap<Integer, Integer>();
//
//    public int climbStairs(int n) {
//        return climb(n);
//    }
//
//    private int climb(int n) {
//        Integer num = (Integer) map.get(n);
//        if (!Objects.isNull(num)) return num;
//        if (n == 1) return 1;
//        if (n == 2) return 2;
//        int count = climb(n - 1) + climb(n - 2);
//        map.put(n, count);
//        return count;
//    }

    /*
     * 循环解决
     */

    public int climbStairs(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;

        // 当前
        int index = 0;
        // 上一个
        int pre = 2;
        // 上上个
        int prepre = 1;

        for (int i = 3; i <= n; i++) {
            index = pre + prepre;
            prepre = pre;
            pre = index;
        }
        return index;
    }

}

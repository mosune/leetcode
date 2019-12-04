package leetcode.easy;

/**
 * 754. 到达终点数字
 *
 * 在一根无限长的数轴上，你站在0的位置。终点在target的位置。
 *
 * 每次你可以选择向左或向右移动。第 n 次移动（从 1 开始），可以走 n 步。
 *
 * 返回到达终点需要的最小移动次数。
 *
 * 示例 1:
 *
 * 输入: target = 3
 * 输出: 2
 * 解释:
 * 第一次移动，从 0 到 1 。
 * 第二次移动，从 1 到 3 。
 * 示例 2:
 *
 * 输入: target = 2
 * 输出: 3
 * 解释:
 * 第一次移动，从 0 到 1 。
 * 第二次移动，从 1 到 -1 。
 * 第三次移动，从 -1 到 2 。
 * 注意:
 *
 * target是在[-10^9, 10^9]范围中的非零整数。
 *
 * @author gcg
 * @create 2019-12-04 10:21
 **/
public class SevenHundredFiftyFour {

    public int reachNumber(int target) {
        if (target == 0) return 0;
        // 不管是正负都看作正数
        target = Math.abs(target);
        int sum = 0;

        for (int i = 1;;i++) {
            sum += i;
            // 直到相加的数大于等于目标数时，判断sum和target的差值是否为偶数，如果为偶数说明可以通过向左平移一个数字导致2倍的差值得到
            if (sum >= target && (sum - target) % 2 == 0) return i;
        }
    }

}

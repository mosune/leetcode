package leetcode.easy;

/**
 * 204. 计数质数
 *
 * 统计所有小于非负整数 n 的质数的数量。
 *
 * 示例:
 *
 * 输入: 10
 * 输出: 4
 * 解释: 小于 10 的质数一共有 4 个, 它们是 2, 3, 5, 7 。
 *
 * @author gcg
 * @create 2019-06-18 23:12
 **/
public class TwoHundredFour {

    // 厄拉多筛选法
    public int countPrimes(int n) {
        int num = 0;

        int[] nums = new int[n + 1];

        // 排除每个数的倍数数字
        for (int i = 2; i < n; i++) {
            if (nums[i] == 1) continue;
            int j = 2, r = i * 2;
            while (r < n) {
                if (nums[r] == 0) nums[r] = 1;
                r = i * j++;
            }
        }

        // 获取最后留下的数字
        for (int i = 2; i < nums.length - 1; i++) {
            if (nums[i] == 0) num++;
        }

        return num;
    }

}

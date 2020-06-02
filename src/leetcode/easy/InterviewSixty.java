package leetcode.easy;

/**
 * 面试题60. n个骰子的点数
 *
 * 把n个骰子扔在地上，所有骰子朝上一面的点数之和为s。输入n，打印出s的所有可能的值出现的概率。
 *
 *  
 *
 * 你需要用一个浮点数数组返回答案，其中第 i 个元素代表这 n 个骰子所能掷出的点数集合中第 i 小的那个的概率。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: 1
 * 输出: [0.16667,0.16667,0.16667,0.16667,0.16667,0.16667]
 * 示例 2:
 *
 * 输入: 2
 * 输出: [0.02778,0.05556,0.08333,0.11111,0.13889,0.16667,0.13889,0.11111,0.08333,0.05556,0.02778]
 *  
 *
 * 限制：
 *
 * 1 <= n <= 11
 *
 * @author gcg
 * @create 2020-06-02 10:15
 **/
public class InterviewSixty {

    public double[] twoSum(int n) {
        int[] dps = new int[n * 6];

        for (int i = 0; i < 6; i++) dps[i] = 1;

        for (int i = 1; i < n; i++) {
            for (int j = dps.length - 1; j >= i; j--) {
                dps[j] = 0;
                for (int k = 1; k <= 6; k++) {
                    if (j - k < 0) break;
                    dps[j] += dps[j - k];
                }
            }
            dps[i - 1] = 0;
        }

        double nums = Math.pow(6, n);
        double[] results = new double[dps.length - n + 1];
        for (int i = 0; i < results.length; i++) {
            results[i] = dps[i - 1 + n] / nums;
        }

        return results;
    }

}

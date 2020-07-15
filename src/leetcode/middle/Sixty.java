package leetcode.middle;

/**
 * 60. 第k个排列
 *
 * 给出集合 [1,2,3,…,n]，其所有元素共有 n! 种排列。
 *
 * 按大小顺序列出所有排列情况，并一一标记，当 n = 3 时, 所有排列如下：
 *
 * "123"
 * "132"
 * "213"
 * "231"
 * "312"
 * "321"
 * 给定 n 和 k，返回第 k 个排列。
 *
 * 说明：
 *
 * 给定 n 的范围是 [1, 9]。
 * 给定 k 的范围是[1,  n!]。
 * 示例 1:
 *
 * 输入: n = 3, k = 3
 * 输出: "213"
 * 示例 2:
 *
 * 输入: n = 4, k = 9
 * 输出: "2314"
 *
 * @author gcg
 * @create 2020-07-15 11:07
 **/
public class Sixty {

    StringBuilder sb = new StringBuilder();

    boolean[] booleans;

    public String getPermutation(int n, int k) {
        booleans = new boolean[n];
        getStr(n, k, n);
        return sb.toString();
    }

    private void getStr(int n, int k, int sum) {
        if (sb.length() == sum) return;
        int num = 1, data;
        for (int i = 2; i < n; i++) num *= i;
        data = (k - 1) / num;
        int index = 0;
        for (int i = 0; i < booleans.length; i++) {
            if (!booleans[i]) {
                if (index == data) {
                    sb.append(i + 1);
                    booleans[i] = true;
                    break;
                }
                index++;
            }
        }
        getStr(n - 1, k - data * num, sum);
    }

}

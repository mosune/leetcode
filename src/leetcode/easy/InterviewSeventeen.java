package leetcode.easy;

/**
 * 面试题17. 打印从1到最大的n位数
 *
 * 输入数字 n，按顺序打印出从 1 到最大的 n 位十进制数。比如输入 3，则打印出 1、2、3 一直到最大的 3 位数 999。
 *
 * 示例 1:
 *
 * 输入: n = 1
 * 输出: [1,2,3,4,5,6,7,8,9]
 *  
 *
 * 说明：
 *
 * 用返回一个整数列表来代替打印
 * n 为正整数
 *
 * @author gcg
 * @create 2020-05-20 11:39
 **/
public class InterviewSeventeen {

    public int[] printNumbers(int n) {
        int num = (int) (Math.pow(10, n) - 1);
        int[] results = new int[num];

        for (int i = 1; i <= num; i++) {
            results[i - 1] = i;
        }

        return results;
    }

}

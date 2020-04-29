package leetcode.easy;

/**
 * 面试题 08.01. 三步问题
 *
 * 三步问题。有个小孩正在上楼梯，楼梯有n阶台阶，小孩一次可以上1阶、2阶或3阶。实现一种方法，计算小孩有多少种上楼梯的方式。结果可能很大，你需要对结果模1000000007。
 *
 * 示例1:
 *
 *  输入：n = 3
 *  输出：4
 *  说明: 有四种走法
 * 示例2:
 *
 *  输入：n = 5
 *  输出：13
 * 提示:
 *
 * n范围在[1, 1000000]之间
 *
 * @author gcg
 * @create 2020-04-29 11:35
 **/
public class InterviewEightOne {

    public int waysToStep(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        long pre = 4, prePre = 2, prePrePre = 1;

        for (int i = 0; i < n - 3; i ++) {
            long num = (pre + prePre + prePrePre) % 1000000007;
            prePrePre = prePre;
            prePre = pre;
            pre = num;
        }

        return (int) (pre % 1000000007);
    }

}

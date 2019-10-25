package leetcode.easy;

/**
 * 633. 平方数之和
 *
 * 给定一个非负整数 c ，你要判断是否存在两个整数 a 和 b，使得 a2 + b2 = c。
 *
 * 示例1:
 *
 * 输入: 5
 * 输出: True
 * 解释: 1 * 1 + 2 * 2 = 5
 *  
 *
 * 示例2:
 *
 * 输入: 3
 * 输出: False
 *
 * @author gcg
 * @create 2019-10-25 14:35
 **/
public class SixHundredThrityThree {

    /**
     * 计算版本
     */
//    public boolean judgeSquareSum(int c) {
//        int i = 0;
//        while (true) {
//            long result = (long) Math.pow(i, 2);
//            if (result > c) break;
//            if (Math.pow((long) Math.sqrt(c - result), 2) == c - result) return true;
//            i++;
//        }
//
//        return false;
//    }

    /**
     * 比较版本
     * @param c
     * @return
     */
    public boolean judgeSquareSum(int c) {
        int i = 0;
        while (true) {
            long result = (long) Math.pow(i, 2);
            if (result > c) break;
            double r = Math.sqrt(c - result);
            if (r == (int) r) return true;
            i++;
        }

        return false;
    }

}

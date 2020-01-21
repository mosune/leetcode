package leetcode.easy;

/**
 * 977. 有序数组的平方
 *
 * 给定一个按非递减顺序排序的整数数组 A，返回每个数字的平方组成的新数组，要求也按非递减顺序排序。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[-4,-1,0,3,10]
 * 输出：[0,1,9,16,100]
 * 示例 2：
 *
 * 输入：[-7,-3,2,3,11]
 * 输出：[4,9,9,49,121]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * -10000 <= A[i] <= 10000
 * A 已按非递减顺序排序。
 *
 * @author gcg
 * @create 2020-01-21 10:42
 **/
public class NineHundredSeventySeven {

    public int[] sortedSquares(int[] A) {
        int head = 0, last = A.length - 1, index = A.length - 1;
        int[] result = new int[A.length];

        while (head <= last) {
            if (Math.abs(A[head]) < Math.abs(A[last])) result[index--] = (int) Math.pow(A[last--], 2);
            else result[index--] = (int) Math.pow(A[head++], 2);
        }

        return result;
    }

}

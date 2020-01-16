package leetcode.easy;

/**
 * 941. 有效的山脉数组
 *
 * 给定一个整数数组 A，如果它是有效的山脉数组就返回 true，否则返回 false。
 *
 * 让我们回顾一下，如果 A 满足下述条件，那么它是一个山脉数组：
 *
 * A.length >= 3
 * 在 0 < i < A.length - 1 条件下，存在 i 使得：
 * A[0] < A[1] < ... A[i-1] < A[i]
 * A[i] > A[i+1] > ... > A[B.length - 1]
 *  
 *
 * 示例 1：
 *
 * 输入：[2,1]
 * 输出：false
 * 示例 2：
 *
 * 输入：[3,5,5]
 * 输出：false
 * 示例 3：
 *
 * 输入：[0,3,2,1]
 * 输出：true
 *  
 *
 * 提示：
 *
 * 0 <= A.length <= 10000
 * 0 <= A[i] <= 10000 
 *
 * @author gcg
 * @create 2020-01-16 10:52
 **/
public class NineHundredFortyOne {

//    public boolean validMountainArray(int[] A) {
//        if (A.length < 3) return false;
//        boolean isDown = false;
//
//        for (int i = 0; i < A.length - 1; i++) {
//            if (A[i] == A[i + 1]) return false;
//            if (isDown) {
//                if (A[i] - A[i + 1] < 0) return false;
//            } else {
//                if (A[i] - A[i + 1] > 0) {
//                    if (i == 0) return false;
//                    isDown = true;
//                }
//            }
//        }
//
//        return isDown;
//    }

    /**
     * 先上山后下山
     * @param A
     * @return
     */
    public boolean validMountainArray(int[] A) {
        if (A.length < 3) return false;
        int index = 0;

        while (index < A.length - 1 && A[index] < A[index + 1]) index++;
        if (index == 0 || index + 1 == A.length) return false;
        while (index < A.length - 1 && A[index] > A[index + 1]) index++;

        return index == A.length - 1;
    }

}

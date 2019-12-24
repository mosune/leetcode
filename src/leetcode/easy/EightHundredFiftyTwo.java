package leetcode.easy;

/**
 * 852. 山脉数组的峰顶索引
 *
 * 我们把符合下列属性的数组 A 称作山脉：
 *
 * A.length >= 3
 * 存在 0 < i < A.length - 1 使得A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1]
 * 给定一个确定为山脉的数组，返回任何满足 A[0] < A[1] < ... A[i-1] < A[i] > A[i+1] > ... > A[A.length - 1] 的 i 的值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[0,1,0]
 * 输出：1
 * 示例 2：
 *
 * 输入：[0,2,1,0]
 * 输出：1
 *  
 *
 * 提示：
 *
 * 3 <= A.length <= 10000
 * 0 <= A[i] <= 10^6
 * A 是如上定义的山脉
 *
 * @author gcg
 * @create 2019-12-24 15:35
 **/
public class EightHundredFiftyTwo {

    public int peakIndexInMountainArray(int[] A) {
        int pre = 0, last = A.length - 1, mid;

        while (pre < last) {
            mid = (last - pre) / 2 + pre;
            if (A[mid] < A[mid + 1]) pre = mid + 1;
            else last = mid;
        }
        return pre;
    }

//    public int peakIndexInMountainArray(int[] A) {
//        int pre = 0, last = A.length - 1, mid;
//
//        while (pre < last) {
//            mid = (last - pre) / 2 + pre;
//            if (A[mid] > A[mid - 1]) {
//                if (A[mid] > A[mid + 1]) return mid;
//                pre = mid + 1;
//            } else {
//                last = mid - 1;
//            }
//        }
//        return pre;
//    }

}

package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 961. 重复 N 次的元素
 *
 * 在大小为 2N 的数组 A 中有 N+1 个不同的元素，其中有一个元素重复了 N 次。
 *
 * 返回重复了 N 次的那个元素。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,3]
 * 输出：3
 * 示例 2：
 *
 * 输入：[2,1,2,5,3,2]
 * 输出：2
 * 示例 3：
 *
 * 输入：[5,1,5,2,5,3,5,4]
 * 输出：5
 *  
 *
 * 提示：
 *
 * 4 <= A.length <= 10000
 * 0 <= A[i] < 10000
 * A.length 为偶数
 *
 * @author gcg
 * @create 2020-01-19 16:47
 **/
public class NineHundredSixtyOne {

    /**
     * 哈希表解法
     * @param A
     * @return
     */
//    public int repeatedNTimes(int[] A) {
//        Map<Integer, Integer> map = new HashMap<>(A.length / 2);
//
//        for (int i = 0; i < A.length; i++) {
//            if (map.get(A[i]) == null) map.put(A[i], 1);
//            else return A[i];
//        }
//
//        return 0;
//    }

    /**
     * 官方牛逼操作，保证相同元素最大距离不会超过3进行遍历，O(1)的空间复杂度
     * @param A
     * @return
     */
    public int repeatedNTimes(int[] A) {
        for (int k = 1; k <= 3; ++k) {
            for (int i = 0; i < A.length - k; ++i) {
                if (A[i] == A[i+k]) return A[i];
            }
        }

        return 0;
    }

}

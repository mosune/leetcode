package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

/**
 * 989. 数组形式的整数加法
 *
 * 对于非负整数 X 而言，X 的数组形式是每位数字按从左到右的顺序形成的数组。例如，如果 X = 1231，那么其数组形式为 [1,2,3,1]。
 *
 * 给定非负整数 X 的数组形式 A，返回整数 X+K 的数组形式。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：A = [1,2,0,0], K = 34
 * 输出：[1,2,3,4]
 * 解释：1200 + 34 = 1234
 * 示例 2：
 *
 * 输入：A = [2,7,4], K = 181
 * 输出：[4,5,5]
 * 解释：274 + 181 = 455
 * 示例 3：
 *
 * 输入：A = [2,1,5], K = 806
 * 输出：[1,0,2,1]
 * 解释：215 + 806 = 1021
 * 示例 4：
 *
 * 输入：A = [9,9,9,9,9,9,9,9,9,9], K = 1
 * 输出：[1,0,0,0,0,0,0,0,0,0,0]
 * 解释：9999999999 + 1 = 10000000000
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 10000
 * 0 <= A[i] <= 9
 * 0 <= K <= 10000
 * 如果 A.length > 1，那么 A[0] != 0
 *
 * @author gcg
 * @create 2020-02-03 14:08
 **/
public class NineHundredEightyNine {

    /**
     * 复杂的做法
     * @param A
     * @param K
     * @return
     */
//    public List<Integer> addToArrayForm(int[] A, int K) {
//        int index = A.length - 1;
//        boolean isTen = false;
//        List<Integer> results = new ArrayList<>();
//        while (K != 0) {
//            if (index < 0) break;
//            int num = K % 10;
//            int sum = num + A[index--];
//            if (isTen) {
//                sum++;
//                isTen = false;
//            }
//            if (sum < 10) results.add(sum);
//            else {
//                results.add(sum % 10);
//                isTen = true;
//            }
//            K /= 10;
//        }
//        if (K != 0) {
//            while (K != 0) {
//                if (isTen) {
//                    if (K % 10 + 1 < 10) {
//                        results.add(K % 10 + 1);
//                        isTen = false;
//                    } else {
//                        results.add(0);
//                        isTen = true;
//                    }
//                } else results.add(K % 10);
//                K /= 10;
//            }
//        }
//        if (index >= 0) {
//            while (index >= 0) {
//                if (isTen) {
//                    if (A[index] + 1 < 10) {
//                        results.add(A[index] + 1);
//                        isTen = false;
//                    } else {
//                        results.add(0);
//                        isTen = true;
//                    }
//                } else results.add(A[index]);
//                index--;
//            }
//        }
//        if (isTen) results.add(1);
//        for (int i = 0; i < results.size() / 2; i++) {
//            int num = results.get(i);
//            results.set(i, results.get(results.size() - 1 - i));
//            results.set(results.size() - 1 - i, num);
//        }
//        return results;
//    }

    /**
     * 官方比较牛逼的解法
     * @param A
     * @param K
     * @return
     */
    public List<Integer> addToArrayForm(int[] A, int K) {
        List<Integer> list = new ArrayList<>();
        int index = A.length - 1;

        while (index >= 0 || K > 0) {
            int sum = K;
            if (index >= 0) {
                sum = K + A[index--];
            }
            list.add(sum % 10);
            K = sum / 10;
        }
        Collections.reverse(list);

        return list;
    }

}

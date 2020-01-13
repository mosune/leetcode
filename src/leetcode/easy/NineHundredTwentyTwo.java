package leetcode.easy;

/**
 * 922. 按奇偶排序数组 II
 *
 * 给定一个非负整数数组 A， A 中一半整数是奇数，一半整数是偶数。
 *
 * 对数组进行排序，以便当 A[i] 为奇数时，i 也是奇数；当 A[i] 为偶数时， i 也是偶数。
 *
 * 你可以返回任何满足上述条件的数组作为答案。
 *
 *  
 *
 * 示例：
 *
 * 输入：[4,2,5,7]
 * 输出：[4,5,2,7]
 * 解释：[4,7,2,5]，[2,5,4,7]，[2,7,4,5] 也会被接受。
 *  
 *
 * 提示：
 *
 * 2 <= A.length <= 20000
 * A.length % 2 == 0
 * 0 <= A[i] <= 1000
 *
 * @author gcg
 * @create 2020-01-13 10:26
 **/
public class NineHundredTwentyTwo {

    /**
     * 蠢办法
     * @param A
     * @return
     */
//    public int[] sortArrayByParityII(int[] A) {
//        int head = 0;
//
//        while (head < A.length) {
//            if (head % 2 != A[head] % 2) {
//                int index = head + 1;
//                while (index < A.length) {
//                    if (index % 2 != A[index] % 2 && A[index] % 2 != A[head] % 2) {
//                        int num = A[head];
//                        A[head] = A[index];
//                        A[index] = num;
//                        break;
//                    }
//                    index++;
//                }
//            }
//            head++;
//        }
//
//        return A;
//    }

    /**
     * 奇偶双指针
     * @param A
     * @return
     */
    public int[] sortArrayByParityII(int[] A) {
        int a = 0, b = 1;

        while (a < A.length - 1) {
            if (A[a] % 2 != 0) {
                while (b < A.length) {
                    if (A[b] % 2 != 1) {
                        int num = A[b];
                        A[b] = A[a];
                        A[a] = num;
                        break;
                    }
                    b += 2;
                }
            }
            a += 2;
        }

        return A;
    }

}

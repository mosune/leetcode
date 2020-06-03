package leetcode.easy;

/**
 * 面试题66. 构建乘积数组
 *
 * 给定一个数组 A[0,1,…,n-1]，请构建一个数组 B[0,1,…,n-1]，其中 B 中的元素 B[i]=A[0]×A[1]×…×A[i-1]×A[i+1]×…×A[n-1]。不能使用除法。
 *
 *  
 *
 * 示例:
 *
 * 输入: [1,2,3,4,5]
 * 输出: [120,60,40,30,24]
 *  
 *
 * 提示：
 *
 * 所有元素乘积之和不会溢出 32 位整数
 * a.length <= 100000
 *
 * @author gcg
 * @create 2020-06-03 09:53
 **/
public class InterviewSixtySix {

    public int[] constructArr(int[] a) {
        int[] b = new int[a.length];
        if (a.length == 0) return b;
        b[0] = 1;

        int num = a[0];

        for (int i = 1; i < b.length; i++) {
            b[i] = num;
            num *= a[i];
        }

        num = a[a.length - 1];
        for (int i = b.length - 2; i >= 0; i--) {
            b[i] *= num;
            num *= a[i];
        }

        return b;
    }

}

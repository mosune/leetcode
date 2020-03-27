package leetcode.easy;

/**
 * 1287. 有序数组中出现次数超过25%的元素
 *
 * 给你一个非递减的 有序 整数数组，已知这个数组中恰好有一个整数，它的出现次数超过数组元素总数的 25%。
 *
 * 请你找到并返回这个整数
 *
 *  
 *
 * 示例：
 *
 * 输入：arr = [1,2,2,6,6,6,6,7,10]
 * 输出：6
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^4
 * 0 <= arr[i] <= 10^5
 *
 * @author gcg
 * @create 2020-03-27 11:13
 **/
public class OneThousandTwoHundredEightySeven {

    /**
     * 还有二分、滑动窗口求解，很几把牛逼
     * @param arr
     * @return
     */
    public int findSpecialInteger(int[] arr) {
        int length = arr.length / 4;

        int count = 1;
        for (int i = 1; i < arr.length; i++) {
            if (arr[i] != arr[i - 1]) count = 1;
            else count++;
            if (count > length) return arr[i];
        }

        return arr[arr.length - 1];
    }

}

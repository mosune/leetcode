package leetcode.easy;

import java.util.Comparator;
import java.util.Iterator;
import java.util.PriorityQueue;

/**
 * 面试题40. 最小的k个数
 *
 * 输入整数数组 arr ，找出其中最小的 k 个数。例如，输入4、5、1、6、2、7、3、8这8个数字，则最小的4个数字是1、2、3、4。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：arr = [3,2,1], k = 2
 * 输出：[1,2] 或者 [2,1]
 * 示例 2：
 *
 * 输入：arr = [0,1,2,1], k = 1
 * 输出：[0]
 *  
 *
 * 限制：
 *
 * 0 <= k <= arr.length <= 10000
 * 0 <= arr[i] <= 10000
 *
 * @author gcg
 * @create 2020-05-27 10:55
 **/
public class InterviewForty {

    public int[] getLeastNumbers(int[] arr, int k) {
        int[] nums = new int[k];
        if (k == 0) return nums;
        PriorityQueue<Integer> queue = new PriorityQueue<>(k, (o1, o2) -> o2 - o1);

        for (int num : arr) {
            if (queue.size() < k) queue.offer(num);
            else {
                if (queue.peek() > num) {
                    queue.poll();
                    queue.offer(num);
                }
            }
        }

        int i = 0;
        Iterator<Integer> it = queue.iterator();
        while (it.hasNext()) {
            nums[i++] = it.next();
        }

        return nums;
    }

}

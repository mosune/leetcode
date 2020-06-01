package leetcode.easy;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Stack;

/**
 * 面试题59 - I. 滑动窗口的最大值
 *
 * 给定一个数组 nums 和滑动窗口的大小 k，请找出所有滑动窗口里的最大值。
 *
 * 示例:
 *
 * 输入: nums = [1,3,-1,-3,5,3,6,7], 和 k = 3
 * 输出: [3,3,5,5,6,7]
 * 解释:
 *
 *   滑动窗口的位置                最大值
 * ---------------               -----
 * [1  3  -1] -3  5  3  6  7       3
 *  1 [3  -1  -3] 5  3  6  7       3
 *  1  3 [-1  -3  5] 3  6  7       5
 *  1  3  -1 [-3  5  3] 6  7       5
 *  1  3  -1  -3 [5  3  6] 7       6
 *  1  3  -1  -3  5 [3  6  7]      7
 *  
 *
 * 提示：
 *
 * 你可以假设 k 总是有效的，在输入数组不为空的情况下，1 ≤ k ≤ 输入数组的大小。
 *
 * 注意：本题与主站 239 题相同：https://leetcode-cn.com/problems/sliding-window-maximum/
 *
 * @author gcg
 * @create 2020-06-01 10:26
 **/
public class InterviewFiftyNineI {

//    public int[] maxSlidingWindow(int[] nums, int k) {
//        if (nums.length == 0) return new int[0];
//        Stack<Integer> push = new Stack<>();
//        Stack<Integer> pop = new Stack<>();
//        int[] result = new int[nums.length - k + 1];
//
//        int max = Integer.MIN_VALUE;
//        for (int i = 0; i < k; i++) {
//            push.push(nums[i]);
//            max = Math.max(max, nums[i]);
//        }
//        result[0] = max;
//
//        for (int i = k; i < nums.length; i++) {
//            max = Integer.MIN_VALUE;
//            while (push.size() != 1) {
//                Integer num = push.pop();
//                max = Math.max(max, num);
//                pop.push(num);
//            }
//            max = Math.max(max, nums[i]);
//            result[i - k + 1] = max;
//            push.pop();
//            while (!pop.isEmpty()) {
//                push.push(pop.pop());
//            }
//            push.push(nums[i]);
//        }
//
//        return result;
//    }

    /**
     * 单调队列，一直保持一个递减的队列
     * @param nums
     * @param k
     * @return
     */
    public int[] maxSlidingWindow(int[] nums, int k) {
        if (nums.length == 0 || k == 0) return new int[0];
        int[] result = new int[nums.length - k + 1];
        Deque<Integer> deque = new LinkedList<>();

        for (int i = 0, j = 1 - k; i < nums.length; i++, j++) {
            if (j > 0 && deque.element() == nums[j - 1]) deque.poll();
            while (!deque.isEmpty() && nums[i] > deque.peekLast()) deque.pollLast();
            deque.offer(nums[i]);
            if (j >= 0) result[j] = deque.element();
        }

        return result;
    }

}

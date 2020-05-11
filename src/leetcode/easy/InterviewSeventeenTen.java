package leetcode.easy;

/**
 * 面试题 17.10. 主要元素
 *
 * 如果数组中多一半的数都是同一个，则称之为主要元素。给定一个整数数组，找到它的主要元素。若没有，返回-1。
 *
 * 示例 1：
 *
 * 输入：[1,2,5,9,5,9,5,5,5]
 * 输出：5
 *  
 *
 * 示例 2：
 *
 * 输入：[3,2]
 * 输出：-1
 *  
 *
 * 示例 3：
 *
 * 输入：[2,2,1,1,1,2,2]
 * 输出：2
 *  
 *
 * 说明：
 * 你有办法在时间复杂度为 O(N)，空间复杂度为 O(1) 内完成吗？
 *
 * @author gcg
 * @create 2020-05-11 10:57
 **/
public class InterviewSeventeenTen {

    /**
     * 摩尔投票
     * @param nums
     * @return
     */
    public int majorityElement(int[] nums) {
        int num = nums[0], count = 1;

        for (int i = 1; i < nums.length; i++) {
            if (num != nums[i]) {
                if (count == 0) {
                    num = nums[i];
                    count = 1;
                } else count--;
            } else count++;
        }

        return num;
    }

}

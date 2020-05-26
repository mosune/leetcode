package leetcode.easy;

/**
 * 面试题39. 数组中出现次数超过一半的数字
 *
 * 数组中有一个数字出现的次数超过数组长度的一半，请找出这个数字。
 *
 *  
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在多数元素。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1, 2, 3, 2, 2, 2, 5, 4, 2]
 * 输出: 2
 *  
 *
 * 限制：
 *
 * 1 <= 数组长度 <= 50000
 *
 *  
 *
 * 注意：本题与主站 169 题相同：https://leetcode-cn.com/problems/majority-element/
 *
 * @author gcg
 * @create 2020-05-26 16:16
 **/
public class InterviewThirtyNine {

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

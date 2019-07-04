package leetcode.easy;

/**
 * 283. 移动零
 *
 * 给定一个数组 nums，编写一个函数将所有 0 移动到数组的末尾，同时保持非零元素的相对顺序。
 *
 * 示例:
 *
 * 输入: [0,1,0,3,12]
 * 输出: [1,3,12,0,0]
 * 说明:
 *
 * 必须在原数组上操作，不能拷贝额外的数组。
 * 尽量减少操作次数。
 *
 * @author gcg
 * @create 2019-07-04 17:15
 **/
public class TwoHundredEightyThree {

    public void moveZeroes(int[] nums) {
        // 双指针解法
        int s = -1, length = nums.length;
        for (int i = 0; i < length; i++) {
            if (nums[i] != 0) {
                if (s != -1) {
                    int num = nums[i];
                    nums[i] = nums[s];
                    nums[s] = num;
                    s++;
                }
            } else {
                if (s == -1) {
                    s = i;
                }
            }
        }
    }

}

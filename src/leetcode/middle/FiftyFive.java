package leetcode.middle;

/**
 * 55. 跳跃游戏
 *
 * 给定一个非负整数数组，你最初位于数组的第一个位置。
 *
 * 数组中的每个元素代表你在该位置可以跳跃的最大长度。
 *
 * 判断你是否能够到达最后一个位置。
 *
 * 示例 1:
 *
 * 输入: [2,3,1,1,4]
 * 输出: true
 * 解释: 我们可以先跳 1 步，从位置 0 到达 位置 1, 然后再从位置 1 跳 3 步到达最后一个位置。
 * 示例 2:
 *
 * 输入: [3,2,1,0,4]
 * 输出: false
 * 解释: 无论怎样，你总会到达索引为 3 的位置。但该位置的最大跳跃长度是 0 ， 所以你永远不可能到达最后一个位置。
 *
 * @author gcg
 * @create 2020-07-14 14:01
 **/
public class FiftyFive {

//    public boolean canJump(int[] nums) {
//        int max = 0, index = 0;
//
//        while (nums[index] != 0) {
//            int now = index;
//            for (int i = now + 1; i <= Math.min(now + nums[now], nums.length - 1); i++) {
//                if (i + nums[i] > max) {
//                    max = i + nums[i];
//                    index = i;
//                }
//            }
//            if (max >= nums.length - 1) return true;
//            max = index;
//        }
//
//        return nums[index] + index >= nums.length - 1;
//    }

    public boolean canJump(int[] nums) {
        int max = 0;
        for (int i = 0; i < nums.length; i++) {
            if (i <= max) {
                max = Math.max(i + nums[i], max);
                if (max >= nums.length - 1) return true;
            }
        }

        return false;
    }

}

package leetcode.easy;

import java.util.HashMap;

/**
 * 169. 求众数
 *
 * 给定一个大小为 n 的数组，找到其中的众数。众数是指在数组中出现次数大于 ⌊ n/2 ⌋ 的元素。
 *
 * 你可以假设数组是非空的，并且给定的数组总是存在众数。
 *
 * 示例 1:
 *
 * 输入: [3,2,3]
 * 输出: 3
 * 示例 2:
 *
 * 输入: [2,2,1,1,1,2,2]
 * 输出: 2
 *
 * @author gcg
 * @create 2019-06-11 18:50
 **/
public class OneHundredSixtyNine {

    public int majorityElement(int[] nums) {
        // 借助HashMap实现
//        HashMap<Integer, Integer> map = new HashMap<>();
//        for (int i = 0; i < nums.length; i++) {
//            Integer count = map.get(nums[i]);
//            if (count == null) {
//                map.put(nums[i], 1);
//            } else {
//                if (count + 1 > nums.length / 2) return nums[i];
//                else map.put(nums[i], count + 1);
//            }
//        }

        // 摩尔投票算法
        int num = nums[0];
        int count = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != num) {
                if (count == 0) {
                    num = nums[i];
                    count = 1;
                } else count--;
            } else count++;
        }

        return num;
    }

}

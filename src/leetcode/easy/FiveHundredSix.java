package leetcode.easy;

import java.util.Arrays;

/**
 * 506. 相对名次
 *
 * 给出 N 名运动员的成绩，找出他们的相对名次并授予前三名对应的奖牌。前三名运动员将会被分别授予 “金牌”，“银牌” 和“ 铜牌”（"Gold Medal", "Silver Medal", "Bronze Medal"）。
 *
 * (注：分数越高的选手，排名越靠前。)
 *
 * 示例 1:
 *
 * 输入: [5, 4, 3, 2, 1]
 * 输出: ["Gold Medal", "Silver Medal", "Bronze Medal", "4", "5"]
 * 解释: 前三名运动员的成绩为前三高的，因此将会分别被授予 “金牌”，“银牌”和“铜牌” ("Gold Medal", "Silver Medal" and "Bronze Medal").
 * 余下的两名运动员，我们只需要通过他们的成绩计算将其相对名次即可。
 * 提示:
 *
 * N 是一个正整数并且不会超过 10000。
 * 所有运动员的成绩都不相同。
 *
 * @author gcg
 * @create 2019-09-12 10:33
 **/
public class FiveHundredSix {

    /**
     * 排序解决，双重循环
     * @param nums
     * @return
     */
//    public String[] findRelativeRanks(int[] nums) {
//        int[] copy = nums.clone();
//        Arrays.sort(copy);
//
//        String[] strings = new String[nums.length];
//        for (int i = 0; i < nums.length; i++) {
//            for (int j = 0; j < nums.length; j++) {
//                if (nums[i] == copy[j]) {
//                    if (j == nums.length - 1) strings[i] = "Gold Medal";
//                    else if (j == nums.length - 2) strings[i] = "Silver Medal";
//                    else if (j == nums.length - 3) strings[i] = "Bronze Medal";
//                    else strings[i] = String.valueOf(nums.length - j);
//                }
//            }
//        }
//
//        return strings;
//    }

    /**
     * dp思想
     * @param nums
     * @return
     */
    public String[] findRelativeRanks(int[] nums) {
        String[] strings = new String[nums.length];
        if (nums.length == 0) return strings;
        int max = nums[0];
        for (int i = 1; i < nums.length; i++) max = Math.max(max, nums[i]);
        // 构建索引是数字，值是坐标的数组
        int[] data = new int[max + 1];
        for (int i = 0; i < nums.length; i++) data[nums[i]] = i + 1;
        // 计算当前位数
        int num = 1;
        for (int i = data.length - 1; i >= 0; i--) {
            if (data[i] > 0) {
                if (num == 1) strings[data[i] - 1] = "Gold Medal";
                else if (num == 2) strings[data[i] - 1] = "Silver Medal";
                else if (num == 3) strings[data[i] - 1] = "Bronze Medal";
                else strings[data[i] - 1] = String.valueOf(num);
                num++;
            }
        }
        return strings;
    }

}

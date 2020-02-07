package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 1010. 总持续时间可被 60 整除的歌曲
 *
 * 在歌曲列表中，第 i 首歌曲的持续时间为 time[i] 秒。
 *
 * 返回其总持续时间（以秒为单位）可被 60 整除的歌曲对的数量。形式上，我们希望索引的数字  i < j 且有 (time[i] + time[j]) % 60 == 0。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[30,20,150,100,40]
 * 输出：3
 * 解释：这三对的总持续时间可被 60 整数：
 * (time[0] = 30, time[2] = 150): 总持续时间 180
 * (time[1] = 20, time[3] = 100): 总持续时间 120
 * (time[1] = 20, time[4] = 40): 总持续时间 60
 * 示例 2：
 *
 * 输入：[60,60,60]
 * 输出：3
 * 解释：所有三对的总持续时间都是 120，可以被 60 整数。
 *  
 *
 * 提示：
 *
 * 1 <= time.length <= 60000
 * 1 <= time[i] <= 500
 *
 * @author gcg
 * @create 2020-02-07 14:13
 **/
public class OneThousandTen {

//    public int numPairsDivisibleBy60(int[] time) {
//        int[] nums = new int[16];
//        for (int i = 0; i < nums.length; i++) nums[i] = (i + 1) * 60;
//        Set<Integer> set = new HashSet<>(time.length);
//        Map<Integer, Integer> map = new HashMap<>(time.length);
//        int sum = 0;
//
//        for (int i = 0; i < time.length; i++) {
//            int num = set.size();
//            int index = time[i] / 60;
//            for (int j = index; j < nums.length; j++) {
//                if (num == 0) break;
//                if (set.contains(nums[j] - time[i])) {
//                    sum += map.get(nums[j] - time[i]);
//                    num--;
//                }
//            }
//            set.add(time[i]);
//            map.merge(time[i], 1, Integer::sum);
//        }
//        return sum;
//    }

    /**
     * 牛逼的解法，先求余数，然后通过余数进行组合
     * @param time
     * @return
     */
    public int numPairsDivisibleBy60(int[] time) {
        int sum = 0;
        int[] nums = new int[60];

        for (int i = 0; i < time.length; i++) time[i] %= 60;

        for (int i : time) nums[i]++;

        for (int i = 1; i < 30; i++) {
            sum += nums[i] * nums[60 - i];
        }
        sum += nums[0] * (nums[0] - 1) / 2;
        sum += nums[30] * (nums[30] - 1) / 2;

        return sum;
    }


}

package leetcode.easy;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 * 575. 分糖果
 *
 * 给定一个偶数长度的数组，其中不同的数字代表着不同种类的糖果，每一个数字代表一个糖果。你需要把这些糖果平均分给一个弟弟和一个妹妹。返回妹妹可以获得的最大糖果的种类数。
 *
 * 示例 1:
 *
 * 输入: candies = [1,1,2,2,3,3]
 * 输出: 3
 * 解析: 一共有三种种类的糖果，每一种都有两个。
 *      最优分配方案：妹妹获得[1,2,3],弟弟也获得[1,2,3]。这样使妹妹获得糖果的种类数最多。
 * 示例 2 :
 *
 * 输入: candies = [1,1,2,3]
 * 输出: 2
 * 解析: 妹妹获得糖果[2,3],弟弟获得糖果[1,1]，妹妹有两种不同的糖果，弟弟只有一种。这样使得妹妹可以获得的糖果种类数最多。
 * 注意:
 *
 * 数组的长度为[2, 10,000]，并且确定为偶数。
 * 数组中数字的大小在范围[-100,000, 100,000]内。
 *
 * @author gcg
 * @create 2019-10-10 13:44
 **/
public class FiveHundredSeventyFive {

    /**
     * 哈希表方法
     * @param candies
     * @return
     */
//    public int distributeCandies(int[] candies) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : candies) {
//            if (map.containsKey(i)) map.put(i, map.get(i) + 1);
//            else map.put(i, 1);
//        }
//        int a = 0, b = 0;
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : set) {
//            if (entry.getValue() == 1) a++;
//            else {
//                a++;
//                b += entry.getValue() - 1;
//            }
//        }
//
//        if (a > b) a = b + (a - b) / 2;
//
//        return a;
//    }

    /**
     * 简易方法
     * @param candies
     * @return
     */
    public int distributeCandies(int[] candies) {
        Set<Integer> set = new HashSet<>();
        // 获得糖果种数
        for (int i : candies) set.add(i);

        // 比较糖果种类是否超过半数，超过需要分给弟弟
        return Math.min(candies.length / 2, set.size());
    }

}

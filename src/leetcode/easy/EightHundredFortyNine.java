package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 849. 到最近的人的最大距离
 *
 * 在一排座位（ seats）中，1 代表有人坐在座位上，0 代表座位上是空的。
 *
 * 至少有一个空座位，且至少有一人坐在座位上。
 *
 * 亚历克斯希望坐在一个能够使他与离他最近的人之间的距离达到最大化的座位上。
 *
 * 返回他到离他最近的人的最大距离。
 *
 * 示例 1：
 *
 * 输入：[1,0,0,0,1,0,1]
 * 输出：2
 * 解释：
 * 如果亚历克斯坐在第二个空位（seats[2]）上，他到离他最近的人的距离为 2 。
 * 如果亚历克斯坐在其它任何一个空位上，他到离他最近的人的距离为 1 。
 * 因此，他到离他最近的人的最大距离是 2 。
 * 示例 2：
 *
 * 输入：[1,0,0,0]
 * 输出：3
 * 解释：
 * 如果亚历克斯坐在最后一个座位上，他离最近的人有 3 个座位远。
 * 这是可能的最大距离，所以答案是 3 。
 * 提示：
 *
 * 1 <= seats.length <= 20000
 * seats 中只含有 0 和 1，至少有一个 0，且至少有一个 1。
 *
 * @author gcg
 * @create 2019-12-24 15:03
 **/
public class EightHundredFortyNine {

    public int maxDistToClosest(int[] seats) {
        int index = -1;
        for (int i = 0; i < seats.length; i++) {
            if (seats[i] == 1) {
                index = i;
                break;
            }
        }
        int max = index;

        for (int i = index + 1; i < seats.length; i++) {
            if (seats[i] == 1) {
                max = Math.max(max, (i - index) / 2);
                index = i;
            }
        }
        return Math.max(seats.length - 1 - index, max);
    }

//    public int maxDistToClosest(int[] seats) {
//        List<Integer> list = new ArrayList<>(seats.length);
//        for (int i = 0; i < seats.length; i++) {
//            if (seats[i] == 1) list.add(i);
//        }
//
//        int max = 0;
//        max = Math.max(list.get(0), max);
//        for (int i = 1; i < list.size(); i++) {
//            max = Math.max((list.get(i) - list.get(i - 1)) / 2, max);
//        }
//        max = Math.max(seats.length - list.get(list.size() - 1) - 1, max);
//
//        return max;
//    }

}

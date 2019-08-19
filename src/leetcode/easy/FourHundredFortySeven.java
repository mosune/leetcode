package leetcode.easy;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

/**
 * 447. 回旋镖的数量
 *
 * 给定平面上 n 对不同的点，“回旋镖” 是由点表示的元组 (i, j, k) ，其中 i 和 j 之间的距离和 i 和 k 之间的距离相等（需要考虑元组的顺序）。
 *
 * 找到所有回旋镖的数量。你可以假设 n 最大为 500，所有点的坐标在闭区间 [-10000, 10000] 中。
 *
 * 示例:
 *
 * 输入:
 * [[0,0],[1,0],[2,0]]
 *
 * 输出:
 * 2
 *
 * 解释:
 * 两个回旋镖为 [[1,0],[0,0],[2,0]] 和 [[1,0],[2,0],[0,0]]
 *
 * @author gcg
 * @create 2019-08-19 13:49
 **/
public class FourHundredFortySeven {

    public int numberOfBoomerangs(int[][] points) {
        HashMap<Double, Integer> map = new HashMap<>(points.length);
        int num = 0;
        for (int i = 0; i < points.length; i++) {
            for (int j = 0; j < points.length; j++) {
                double length = Math.pow(points[i][0] - points[j][0], 2) + Math.pow(points[i][1] - points[j][1], 2);
                Integer nums = map.get(length);
                if (nums == null) map.put(length, 1);
                else map.put(length, nums + 1);
            }
            Set<Map.Entry<Double, Integer>> entrys = map.entrySet();
            for (Map.Entry<Double, Integer> entry : entrys) {
                int value = entry.getValue();
                if (value > 1) num += value * (value - 1);
            }
            map.clear();
        }
        return num;
    }

}

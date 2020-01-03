package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 874. 模拟行走机器人
 *
 * 机器人在一个无限大小的网格上行走，从点 (0, 0) 处开始出发，面向北方。该机器人可以接收以下三种类型的命令：
 *
 * -2：向左转 90 度
 * -1：向右转 90 度
 * 1 <= x <= 9：向前移动 x 个单位长度
 * 在网格上有一些格子被视为障碍物。
 *
 * 第 i 个障碍物位于网格点  (obstacles[i][0], obstacles[i][1])
 *
 * 如果机器人试图走到障碍物上方，那么它将停留在障碍物的前一个网格方块上，但仍然可以继续该路线的其余部分。
 *
 * 返回从原点到机器人的最大欧式距离的平方。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: commands = [4,-1,3], obstacles = []
 * 输出: 25
 * 解释: 机器人将会到达 (3, 4)
 * 示例 2：
 *
 * 输入: commands = [4,-1,4,-2,4], obstacles = [[2,4]]
 * 输出: 65
 * 解释: 机器人在左转走到 (1, 8) 之前将被困在 (1, 4) 处
 *  
 *
 * 提示：
 *
 * 0 <= commands.length <= 10000
 * 0 <= obstacles.length <= 10000
 * -30000 <= obstacle[i][0] <= 30000
 * -30000 <= obstacle[i][1] <= 30000
 * 答案保证小于 2 ^ 31
 *
 * @author gcg
 * @create 2020-01-03 11:24
 **/
public class EightHundredSeventyFour {

    public static int robotSim(int[] commands, int[][] obstacles) {
        // 又臭又长，官方的比较好
        Map<Integer, List<Integer>> xMap = new HashMap<>(obstacles.length, 1);
        Map<Integer, List<Integer>> yMap = new HashMap<>(obstacles.length, 1);

        for (int i = 0; i < obstacles.length; i++) {
            if (yMap.get(obstacles[i][1]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(obstacles[i][0]);
                yMap.put(obstacles[i][1], list);
            } else {
                yMap.get(obstacles[i][1]).add(obstacles[i][0]);
            }
            if (xMap.get(obstacles[i][0]) == null) {
                List<Integer> list = new ArrayList<>();
                list.add(obstacles[i][1]);
                xMap.put(obstacles[i][0], list);
            } else {
                xMap.get(obstacles[i][0]).add(obstacles[i][1]);
            }
        }

        int x = 0, y = 0, r = 0;
        int command = 4;
        for (int i : commands) {
            if (i == -2) {
                if (command == 1) command = 4;
                else command--;
            } else if (i == -1) {
                if (command == 4) command = 1;
                else command++;
            } else {
                if (command == 1) {
                    int min = x + i;
                    List<Integer> list = yMap.get(y);
                    if (list != null) {
                        for (int t : list) {
                            if (t > x && t <= x + i) min = Math.min(t - 1, min);
                        }
                    }
                    x = min;
                } else if (command == 2) {
                    int max = y - i;
                    List<Integer> list = xMap.get(x);
                    if (list != null) {
                        for (int t : list) {
                            if (t < y && t >= y - i) max = Math.max(t + 1, max);
                        }
                    }
                    y = max;
                } else if (command == 3) {
                    int max = x - i;
                    List<Integer> list = yMap.get(y);
                    if (list != null) {
                        for (int t : list) {
                            if (t < x && t >= x - i) max = Math.max(t + 1, max);
                        }
                    }
                    x = max;
                } else {
                    int min = y + i;
                    List<Integer> list = xMap.get(x);
                    if (list != null) {
                        for (int t : list) {
                            if (t > y && t <= y + i) min = Math.min(t - 1, min);
                        }
                    }
                    y = min;
                }
                r = Math.max(r, x * x + y * y);
            }
        }

        return r;
    }

}

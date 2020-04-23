package leetcode.middle;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 994. 腐烂的橘子
 *
 * 在给定的网格中，每个单元格可以有以下三个值之一：
 *
 * 值 0 代表空单元格；
 * 值 1 代表新鲜橘子；
 * 值 2 代表腐烂的橘子。
 * 每分钟，任何与腐烂的橘子（在 4 个正方向上）相邻的新鲜橘子都会腐烂。
 *
 * 返回直到单元格中没有新鲜橘子为止所必须经过的最小分钟数。如果不可能，返回 -1。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：[[2,1,1],[1,1,0],[0,1,1]]
 * 输出：4
 * 示例 2：
 *
 * 输入：[[2,1,1],[0,1,1],[1,0,1]]
 * 输出：-1
 * 解释：左下角的橘子（第 2 行， 第 0 列）永远不会腐烂，因为腐烂只会发生在 4 个正向上。
 * 示例 3：
 *
 * 输入：[[0,2]]
 * 输出：0
 * 解释：因为 0 分钟时已经没有新鲜橘子了，所以答案就是 0 。
 *  
 *
 * 提示：
 *
 * 1 <= grid.length <= 10
 * 1 <= grid[0].length <= 10
 * grid[i][j] 仅为 0、1 或 2
 *
 * @author gcg
 * @create 2020-02-04 16:34
 **/
public class NineHundredNinetyFour {

    public int orangesRotting(int[][] grid) {
        Queue<Integer> xs = new LinkedList<>();
        Queue<Integer> ys = new LinkedList<>();
        int sum = 0, min = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 2) {
                    xs.offer(i);
                    ys.offer(j);
                    sum++;
                }
            }
        }
        int num = sum;
        sum = 0;

        while (!xs.isEmpty()) {
            int x = xs.poll();
            int y = ys.poll();

            if (x > 0 && y < grid[x - 1].length && grid[x - 1][y] == 1) {
                grid[x - 1][y] = 2;
                xs.offer(x - 1);
                ys.offer(y);
                sum++;
            }
            if (x < grid.length - 1 && y < grid[x + 1].length && grid[x + 1][y] == 1) {
                grid[x + 1][y] = 2;
                xs.offer(x + 1);
                ys.offer(y);
                sum++;
            }
            if (y > 0 && grid[x][y - 1] == 1) {
                grid[x][y - 1] = 2;
                xs.offer(x);
                ys.offer(y - 1);
                sum++;
            }
            if (y < grid[x].length - 1 && grid[x][y + 1] == 1) {
                grid[x][y + 1] = 2;
                xs.offer(x);
                ys.offer(y + 1);
                sum++;
            }
            num--;
            if (num == 0 && sum != 0) {
                num = sum;
                sum = 0;
                min++;
            }
        }

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[i].length; j++) {
                if (grid[i][j] == 1) return -1;
            }
        }

        return min;
    }

}

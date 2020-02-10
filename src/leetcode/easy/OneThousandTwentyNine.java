package leetcode.easy;

import java.util.Arrays;

/**
 * 1029. 两地调度
 *
 * 公司计划面试 2N 人。第 i 人飞往 A 市的费用为 costs[i][0]，飞往 B 市的费用为 costs[i][1]。
 *
 * 返回将每个人都飞到某座城市的最低费用，要求每个城市都有 N 人抵达。
 *
 *  
 *
 * 示例：
 *
 * 输入：[[10,20],[30,200],[400,50],[30,20]]
 * 输出：110
 * 解释：
 * 第一个人去 A 市，费用为 10。
 * 第二个人去 A 市，费用为 30。
 * 第三个人去 B 市，费用为 50。
 * 第四个人去 B 市，费用为 20。
 *
 * 最低总费用为 10 + 30 + 50 + 20 = 110，每个城市都有一半的人在面试。
 *  
 *
 * 提示：
 *
 * 1 <= costs.length <= 100
 * costs.length 为偶数
 * 1 <= costs[i][0], costs[i][1] <= 1000
 *
 * @author gcg
 * @create 2020-02-10 12:52
 **/
public class OneThousandTwentyNine {

    public int twoCitySchedCost(int[][] costs) {
        int sum = 0, n = costs.length / 2;
        // 排序或者差值最小的递增数列，贼几把牛逼
        Arrays.sort(costs, (o1, o2) -> o1[0] - o1[1] - o2[0] + o2[1]);

        for (int i = 0; i < n; i++) sum += costs[i][0] + costs[i + n][1];

        return sum;
    }

}

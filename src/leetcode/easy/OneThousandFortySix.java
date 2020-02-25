package leetcode.easy;

import java.util.PriorityQueue;

/**
 * 1046. 最后一块石头的重量
 *
 * 有一堆石头，每块石头的重量都是正整数。
 *
 * 每一回合，从中选出两块最重的石头，然后将它们一起粉碎。假设石头的重量分别为 x 和 y，且 x <= y。那么粉碎的可能结果如下：
 *
 * 如果 x == y，那么两块石头都会被完全粉碎；
 * 如果 x != y，那么重量为 x 的石头将会完全粉碎，而重量为 y 的石头新重量为 y-x。
 * 最后，最多只会剩下一块石头。返回此石头的重量。如果没有石头剩下，就返回 0。
 *
 *  
 *
 * 提示：
 *
 * 1 <= stones.length <= 30
 * 1 <= stones[i] <= 1000
 *
 * @author gcg
 * @create 2020-02-25 10:25
 **/
public class OneThousandFortySix {

    public int lastStoneWeight(int[] stones) {
        // 优先队列
        PriorityQueue<Integer> queue = new PriorityQueue<>(stones.length, (o1, o2) -> o2 - o1);
        for (int i : stones) queue.offer(i);

        while (queue.size() > 1) {
            int a = queue.poll();
            int b = queue.poll();
            if (a == b) continue;
            queue.offer(a - b);
        }

        return queue.isEmpty() ? 0 : queue.poll();
    }

}

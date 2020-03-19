package leetcode.easy;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * 1128. 等价多米诺骨牌对的数量
 *
 * 给你一个由一些多米诺骨牌组成的列表 dominoes。
 *
 * 如果其中某一张多米诺骨牌可以通过旋转 0 度或 180 度得到另一张多米诺骨牌，我们就认为这两张牌是等价的。
 *
 * 形式上，dominoes[i] = [a, b] 和 dominoes[j] = [c, d] 等价的前提是 a==c 且 b==d，或是 a==d 且 b==c。
 *
 * 在 0 <= i < j < dominoes.length 的前提下，找出满足 dominoes[i] 和 dominoes[j] 等价的骨牌对 (i, j) 的数量。
 *
 *
 *
 * 示例：
 *
 * 输入：dominoes = [[1,2],[2,1],[3,4],[5,6]]
 * 输出：1
 *
 *
 * 提示：
 *
 * 1 <= dominoes.length <= 40000
 * 1 <= dominoes[i][j] <= 9
 *
 * @author gcg
 * @create 2020-03-19 14:36
 **/
public class OneHundredTwentyEight {

    public int numEquivDominoPairs(int[][] dominoes) {
        int sum = 0, key;
        Map<Integer, Integer> map = new HashMap<>(dominoes.length);

        for (int[] ints : dominoes) map.merge(ints[0] * 10 + ints[1], 1, Integer::sum);

        Iterator<Map.Entry<Integer, Integer>> it = map.entrySet().iterator();
        while(it.hasNext()){
            Map.Entry<Integer, Integer> entry = it.next();
            key = entry.getKey() % 10 * 10 + entry.getKey() / 10;
            if (key != entry.getKey()) {
                Integer num = map.get(key);
                if (num != null) sum += num * entry.getValue();
            }
            sum += entry.getValue() * (entry.getValue() - 1) / 2;
            it.remove();
        }

        return sum;
    }

}

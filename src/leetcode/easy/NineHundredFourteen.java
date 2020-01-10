package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 914. 卡牌分组
 *
 * 给定一副牌，每张牌上都写着一个整数。
 *
 * 此时，你需要选定一个数字 X，使我们可以将整副牌按下述规则分成 1 组或更多组：
 *
 * 每组都有 X 张牌。
 * 组内所有的牌上都写着相同的整数。
 * 仅当你可选的 X >= 2 时返回 true。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4,4,3,2,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[3,3]，[4,4]
 * 示例 2：
 *
 * 输入：[1,1,1,2,2,2,3,3]
 * 输出：false
 * 解释：没有满足要求的分组。
 * 示例 3：
 *
 * 输入：[1]
 * 输出：false
 * 解释：没有满足要求的分组。
 * 示例 4：
 *
 * 输入：[1,1]
 * 输出：true
 * 解释：可行的分组是 [1,1]
 * 示例 5：
 *
 * 输入：[1,1,2,2,2,2]
 * 输出：true
 * 解释：可行的分组是 [1,1]，[2,2]，[2,2]
 *
 * 提示：
 *
 * 1 <= deck.length <= 10000
 * 0 <= deck[i] < 10000
 *
 * @author gcg
 * @create 2020-01-10 11:04
 **/
public class NineHundredFourteen {

//    public boolean hasGroupsSizeX(int[] deck) {
//        Map<Integer, Integer> map = new HashMap<>();
//        for (int i : deck) map.merge(i, 1, Integer::sum);
//
//        int min = Integer.MAX_VALUE;
//        List<Integer> list = new ArrayList<>();
//        for (Map.Entry<Integer, Integer> entry : map.entrySet()) {
//            list.add(entry.getValue());
//            min = Math.min(min, entry.getValue());
//        }
//
//        if (min < 2) return false;
//
//        for (int i = 2; i <= min; i++) {
//            boolean pass = true;
//            for (int j = 0; j < list.size(); j++) {
//                if (list.get(j) % i != 0) {
//                    pass = false;
//                    break;
//                }
//            }
//            if (pass) return true;
//        }
//
//        return false;
//    }

    public boolean hasGroupsSizeX(int[] deck) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i : deck) map.merge(i, 1, Integer::sum);

        List<Integer> list = new ArrayList<>();
        for (Map.Entry<Integer, Integer> entry : map.entrySet()) list.add(entry.getValue());

        int a = -1;
        for (int j = 0; j < list.size(); j++) {
            if (a == - 1) a = list.get(j);
            else a = gcd(a, list.get(j));
        }

        return a >= 2;
    }

    private int gcd(int a, int b) {
        // 辗转相除法求最大公约数
        return a % b == 0 ? b : gcd(b, a % b);
    }

}

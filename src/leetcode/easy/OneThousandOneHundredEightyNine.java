package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 1189. “气球” 的最大数量
 *
 * 给你一个字符串 text，你需要使用 text 中的字母来拼凑尽可能多的单词 "balloon"（气球）。
 *
 * 字符串 text 中的每个字母最多只能被使用一次。请你返回最多可以拼凑出多少个单词 "balloon"。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：text = "nlaebolko"
 * 输出：1
 * 示例 2：
 *
 * 输入：text = "loonbalxballpoon"
 * 输出：2
 * 示例 3：
 *
 * 输入：text = "leetcode"
 * 输出：0
 *  
 *
 * 提示：
 *
 * 1 <= text.length <= 10^4
 * text 全部由小写英文字母组成
 *
 * @author gcg
 * @create 2020-03-24 14:20
 **/
public class OneThousandOneHundredEightyNine {

    public int maxNumberOfBalloons(String text) {
        Map<Character, Integer> map = new HashMap<>(text.length());
        for (char c : text.toCharArray()) map.merge(c, 1, Integer::sum);

        Integer sum = Integer.MAX_VALUE, num;
        char[] chars = {'b', 'a', 'n'};
        for (char c : chars) {
            num = map.get(c);
            sum = Math.min(sum, num == null ? 0 : num);
            if (sum == 0) return sum;
        }

        chars = new char[]{'l', 'o'};
        for (char c : chars) {
            num = map.get(c) / 2;
            sum = Math.min(sum, num == null ? 0 : num);
            if (sum == 0) return sum;
        }

        return sum;
    }

}

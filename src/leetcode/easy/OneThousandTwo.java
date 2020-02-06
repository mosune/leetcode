package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * 1002. 查找常用字符
 *
 * 给定仅有小写字母组成的字符串数组 A，返回列表中的每个字符串中都显示的全部字符（包括重复字符）组成的列表。例如，如果一个字符在每个字符串中出现 3 次，但不是 4 次，则需要在最终答案中包含该字符 3 次。
 *
 * 你可以按任意顺序返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["bella","label","roller"]
 * 输出：["e","l","l"]
 * 示例 2：
 *
 * 输入：["cool","lock","cook"]
 * 输出：["c","o"]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 100
 * 1 <= A[i].length <= 100
 * A[i][j] 是小写字母
 *
 * @author gcg
 * @create 2020-02-06 12:25
 **/
public class OneThousandTwo {

    public List<String> commonChars(String[] A) {
        Map<Character, Integer> map1 = new HashMap<>();
        Map<Character, Integer> map2 = new HashMap<>();

        for (char c : A[0].toCharArray()) {
            map1.merge(c, 1, Integer::sum);
        }

        char[] chars;
        for (int i = 1; i < A.length; i++) {
            chars = A[i].toCharArray();
            for (char c : chars) {
                Integer a = map1.get(c);
                if (a != null) {
                    Integer num = map2.get(c);
                    if (num == null) map2.put(c, 1);
                    else if (num + 1 <= a) map2.put(c, num + 1);
                }
            }
            map1 = map2;
            if (map2.isEmpty()) return new ArrayList<>(0);
            map2 = new HashMap<>();
        }

        List<String> list = new ArrayList<>();
        for (Map.Entry<Character, Integer> entry : map1.entrySet()) {
            for (int i = 0; i < entry.getValue(); i++) {
                list.add(entry.getKey() + "");
            }
        }

        return list;
    }

}

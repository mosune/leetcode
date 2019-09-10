package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 *
 * 给定一个单词列表，只返回可以使用在键盘同一行的字母打印出来的单词。
 *
 * 示例：
 *
 * 输入: ["Hello", "Alaska", "Dad", "Peace"]
 * 输出: ["Alaska", "Dad"]
 *  
 *
 * 注意：
 *
 * 你可以重复使用键盘上同一字符。
 * 你可以假设输入的字符串将只包含字母。
 *
 * @author gcg
 * @create 2019-09-10 11:55
 **/
public class FiveHundred {

    public String[] findWords(String[] words) {
        Map<Integer, Integer> map = new HashMap<>(26, 1);
        map.put(97, 2);
        map.put(98, 3);
        map.put(99, 3);
        map.put(100, 2);
        map.put(101, 1);
        map.put(102, 2);
        map.put(103, 2);
        map.put(104, 2);
        map.put(105, 1);
        map.put(106, 2);
        map.put(107, 2);
        map.put(108, 2);
        map.put(109, 3);
        map.put(110, 3);
        map.put(111, 1);
        map.put(112, 1);
        map.put(113, 1);
        map.put(114, 1);
        map.put(115, 2);
        map.put(116, 1);
        map.put(117, 1);
        map.put(118, 3);
        map.put(119, 1);
        map.put(120, 3);
        map.put(121, 1);
        map.put(122, 3);

        List<String> list = new ArrayList<>(words.length);
        for (String s : words) {
            char[] chars = s.toCharArray();
            if (s.length() == 0) continue;
            int num;
            if (chars[0] < 97) num = map.get(chars[0] + 32);
            else num = map.get((int) chars[0]);
            boolean isTrue = true;
            for (int i = 1; i < chars.length; i++) {
                int n;
                if (chars[i] < 97) n = map.get(chars[i] + 32);
                else n = map.get((int) chars[i]);
                if (n != num) {
                    isTrue = false;
                    break;
                }
            }
            if (isTrue) list.add(s);
        }
        String[] strings = new String[list.size()];

        return list.toArray(strings);
    }

}

package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 784. 字母大小写全排列
 *
 * 给定一个字符串S，通过将字符串S中的每个字母转变大小写，我们可以获得一个新的字符串。返回所有可能得到的字符串集合。
 *
 * 示例:
 * 输入: S = "a1b2"
 * 输出: ["a1b2", "a1B2", "A1b2", "A1B2"]
 *
 * 输入: S = "3z4"
 * 输出: ["3z4", "3Z4"]
 *
 * 输入: S = "12345"
 * 输出: ["12345"]
 * 注意：
 *
 * S 的长度不超过12。
 * S 仅由数字和字母组成。
 *
 * @author gcg
 * @create 2019-12-09 16:54
 **/
public class SevenHundredEightyFour {

    /**
     * 一般版
     * @param S
     * @return
     */
//    public List<String> letterCasePermutation(String S) {
//        List<String> list = new ArrayList<>();
//        list.add(S);
//        for (int i = 0; i < S.length(); i++) {
//            if (S.charAt(i) >= 65) {
//                char c;
//                if (S.charAt(i) <= 90) c = (char) (S.charAt(i) + 32);
//                else c = (char) (S.charAt(i) - 32);
//                List<String> newStr = new ArrayList<>();
//                for (String s : list) {
//                    StringBuilder stringBuilder = new StringBuilder(s);
//                    stringBuilder.setCharAt(i, c);
//                    newStr.add(stringBuilder.toString());
//                }
//                list.addAll(newStr);
//            }
//        }
//        return list;
//    }

    /**
     * 一般版 too
     * @param S
     * @return
     */
    public List<String> letterCasePermutation(String S) {
        List<StringBuilder> list = new ArrayList<>();
        list.add(new StringBuilder());

        for (char c : S.toCharArray()) {
            int n = list.size();
            if (c >= 65) {
                for (int i = 0; i < n; i++) {
                    list.add(new StringBuilder(list.get(i)));
                    list.get(i).append(c);
                    if (c <= 90) list.get(i + n).append((char) (c + 32));
                    else list.get(i + n).append((char) (c - 32));
                }
            } else {
                for (int i = 0; i < n; i++) list.get(i).append(c);
            }
        }

        List<String> result = new ArrayList<>(list.size());
        for (StringBuilder stringBuilder : list) result.add(stringBuilder.toString());
        return result;
    }

}

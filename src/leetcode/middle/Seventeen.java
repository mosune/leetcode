package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 17. 电话号码的字母组合
 *
 * 给定一个仅包含数字 2-9 的字符串，返回所有它能表示的字母组合。
 *
 * 给出数字到字母的映射如下（与电话按键相同）。注意 1 不对应任何字母。
 *
 *
 *
 * 示例:
 *
 * 输入："23"
 * 输出：["ad", "ae", "af", "bd", "be", "bf", "cd", "ce", "cf"].
 * 说明:
 * 尽管上面的答案是按字典序排列的，但是你可以任意选择答案输出的顺序。
 *
 * @author gcg
 * @create 2020-06-17 13:58
 **/
public class Seventeen {
    String[] strings = {"abc", "def", "ghi", "jkl", "mno", "pqrs", "tuv", "wxyz"};

    List<String> results = new ArrayList<>();

    public List<String> letterCombinations(String digits) {
        if (digits.length() == 0) return results;
        addNum(digits, 0, "");
        return results;
    }

    private void addNum(String str, int index, String result) {
        int i = str.charAt(index) - 50;
        for (int j = 0; j < strings[i].length(); j++) {
            String s = result + strings[i].charAt(j);
            if (index == str.length() - 1) results.add(s);
            else addNum(str, index + 1, s);
        }
    }

}

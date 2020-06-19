package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 22. 括号生成
 *
 * 数字 n 代表生成括号的对数，请你设计一个函数，用于能够生成所有可能的并且 有效的 括号组合。
 *
 *  
 *
 * 示例：
 *
 * 输入：n = 3
 * 输出：[
 *        "((()))",
 *        "(()())",
 *        "(())()",
 *        "()(())",
 *        "()()()"
 *      ]
 *
 * @author gcg
 * @create 2020-06-19 13:34
 **/
public class TwentyTwo {

    List<String> list = new ArrayList<>();

    public List<String> generateParenthesis(int n) {
        getString("", n, n);
        return list;
    }

    private void getString(String s, int i, int j) {
        if (i == 0 && j == 0) {
            list.add(s);
            return;
        }
        if (i != 0) {
            getString(s += "(", i - 1, j);
            s = s.substring(0, s.length() - 1);
        }
        if (j != 0 && j > i) getString(s += ")", i, j - 1);
    }

}

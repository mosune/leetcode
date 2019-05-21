package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * 有效的括号
 * Category	Difficulty	Likes	Dislikes
 * algorithms	Easy (37.60%)	776	-
 * Tags
 * Companies
 * 给定一个只包括 '('，')'，'{'，'}'，'['，']' 的字符串，判断字符串是否有效。
 *
 * 有效字符串需满足：
 *
 * 左括号必须用相同类型的右括号闭合。
 * 左括号必须以正确的顺序闭合。
 * 注意空字符串可被认为是有效字符串。
 *
 * 示例 1:
 *
 * 输入: "()"
 * 输出: true
 * 示例 2:
 *
 * 输入: "()[]{}"
 * 输出: true
 * 示例 3:
 *
 * 输入: "(]"
 * 输出: false
 * 示例 4:
 *
 * 输入: "([)]"
 * 输出: false
 * 示例 5:
 *
 * 输入: "{[]}"
 * 输出: true
 *
 * @author gcg
 * @create 2019-04-29 20:22
 **/
public class Twenty {

    public boolean isValid(String s) {
        if (s == null || s == "") return true;
        char[] chars = s.toCharArray();
        Stacks stack = new Stacks();
        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];
            if (c == '(' || c == '{' || c == '[') {
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                char pre = stack.pop();
                if (pre == '\0') return false;
                if (pre == '(' && c != ')') return false;
                if (pre == '{' && c != '}') return false;
                if (pre == '[' && c != ']') return false;
            }
        }
        if (stack.index != 0) return false;
        return true;
    }

}

class Stacks {

    List list;

    int index;

    Stacks() {
        list = new ArrayList();
    }

    public void push(char t) {
        list.add(t);
        index++;
    }

    public char pop() {
        if (index == 0) return '\0';
        return (char) list.remove(--index);
    }

}

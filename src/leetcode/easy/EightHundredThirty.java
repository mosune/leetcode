package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 830. 较大分组的位置
 *
 * 在一个由小写字母构成的字符串 S 中，包含由一些连续的相同字符所构成的分组。
 *
 * 例如，在字符串 S = "abbxxxxzyy" 中，就含有 "a", "bb", "xxxx", "z" 和 "yy" 这样的一些分组。
 *
 * 我们称所有包含大于或等于三个连续字符的分组为较大分组。找到每一个较大分组的起始和终止位置。
 *
 * 最终结果按照字典顺序输出。
 *
 * 示例 1:
 *
 * 输入: "abbxxxxzzy"
 * 输出: [[3,6]]
 * 解释: "xxxx" 是一个起始于 3 且终止于 6 的较大分组。
 * 示例 2:
 *
 * 输入: "abc"
 * 输出: []
 * 解释: "a","b" 和 "c" 均不是符合要求的较大分组。
 * 示例 3:
 *
 * 输入: "abcdddeeeeaabbbcd"
 * 输出: [[3,5],[6,9],[12,14]]
 * 说明:  1 <= S.length <= 1000
 *
 * @author gcg
 * @create 2019-12-18 11:30
 **/
public class EightHundredThirty {

    public List<List<Integer>> largeGroupPositions(String S) {
        List<List<Integer>> result = new ArrayList<>();
        char[] chars = S.toCharArray();
        int pre = 0;
        for (int i = 1; i <= chars.length; i++) {
            if (i == chars.length || chars[i] != chars[pre]) {
                if (i - pre >= 3) {
                    List<Integer> list = new ArrayList<>(3);
                    list.add(pre);
                    list.add(i - 1);
                    result.add(list);
                }
                pre = i;
            }
        }

        return result;
    }

}

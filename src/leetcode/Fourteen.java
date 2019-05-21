package leetcode;

import java.util.List;

/**
 *
 * 最长公共前缀
 * Category	Difficulty	Likes	Dislikes
 * algorithms	Easy (32.94%)	525	-
 * Tags
 * Companies
 * 编写一个函数来查找字符串数组中的最长公共前缀。
 *
 * 如果不存在公共前缀，返回空字符串 ""。
 *
 * 示例 1:
 *
 * 输入: ["flower","flow","flight"]
 * 输出: "fl"
 * 示例 2:
 *
 * 输入: ["dog","racecar","car"]
 * 输出: ""
 * 解释: 输入不存在公共前缀。
 * 说明:
 *
 * 所有输入只包含小写字母 a-z 。
 *
 * @author gcg
 * @create 2019-04-27 09:10
 **/
public class Fourteen {

    public String longestCommonPrefix(String[] strs) {
        if (strs.length == 0) return "";
        String pre = strs[0];
        for (int i = 1; i < strs.length; i++) {
            while (strs[i].indexOf(pre) != 0) {
                if (pre == "") return "";
                pre = pre.substring(0, pre.length() - 1);
            }
        }
        return pre;
    }


}

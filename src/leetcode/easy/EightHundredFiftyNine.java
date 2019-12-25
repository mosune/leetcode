package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 859. 亲密字符串
 *
 * 给定两个由小写字母构成的字符串 A 和 B ，只要我们可以通过交换 A 中的两个字母得到与 B 相等的结果，就返回 true ；否则返回 false 。
 *
 *  
 *
 * 示例 1：
 *
 * 输入： A = "ab", B = "ba"
 * 输出： true
 * 示例 2：
 *
 * 输入： A = "ab", B = "ab"
 * 输出： false
 * 示例 3:
 *
 * 输入： A = "aa", B = "aa"
 * 输出： true
 * 示例 4：
 *
 * 输入： A = "aaaaaaabc", B = "aaaaaaacb"
 * 输出： true
 * 示例 5：
 *
 * 输入： A = "", B = "aa"
 * 输出： false
 *  
 *
 * 提示：
 *
 * 0 <= A.length <= 20000
 * 0 <= B.length <= 20000
 * A 和 B 仅由小写字母构成。
 *
 * @author gcg
 * @create 2019-12-25 11:18
 **/
public class EightHundredFiftyNine {

    public boolean buddyStrings(String A, String B) {
        if (A.length() != B.length()) return false;

        int pre = -1;
        for (int i = 0; i < A.length(); i++) {
            if (A.charAt(i) != B.charAt(i)) {
                if (pre == -1) pre = i;
                else if (pre == -2) return false;
                else {
                    if (A.charAt(pre) != B.charAt(i) || A.charAt(i) != B.charAt(pre)) return false;
                    pre = -2;
                }
            }
        }

        if (pre == -1) {
            Set<Character> set = new HashSet<>(A.length());
            for (int i = 0; i < A.length(); i++) {
                if (!set.contains(A.charAt(i))) set.add(A.charAt(i));
                else return true;
            }
            if (set.size() == A.length()) return false;
        }

        return true;
    }

}

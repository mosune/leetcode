package leetcode.easy;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

/**
 *
 * 你将得到一个字符串数组 A。
 *
 * 如果经过任意次数的移动，S == T，那么两个字符串 S 和 T 是特殊等价的。
 *
 * 一次移动包括选择两个索引 i 和 j，且 i ％ 2 == j ％ 2，交换 S[j] 和 S [i]。
 *
 * 现在规定，A 中的特殊等价字符串组是 A 的非空子集 S，这样不在 S 中的任何字符串与 S 中的任何字符串都不是特殊等价的。
 *
 * 返回 A 中特殊等价字符串组的数量。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：["a","b","c","a","c","c"]
 * 输出：3
 * 解释：3 组 ["a","a"]，["b"]，["c","c","c"]
 * 示例 2：
 *
 * 输入：["aa","bb","ab","ba"]
 * 输出：4
 * 解释：4 组 ["aa"]，["bb"]，["ab"]，["ba"]
 * 示例 3：
 *
 * 输入：["abc","acb","bac","bca","cab","cba"]
 * 输出：3
 * 解释：3 组 ["abc","cba"]，["acb","bca"]，["bac","cab"]
 * 示例 4：
 *
 * 输入：["abcd","cdab","adcb","cbad"]
 * 输出：1
 * 解释：1 组 ["abcd","cdab","adcb","cbad"]
 *  
 *
 * 提示：
 *
 * 1 <= A.length <= 1000
 * 1 <= A[i].length <= 20
 * 所有 A[i] 都具有相同的长度。
 * 所有 A[i] 都只由小写字母组成。
 *
 * @author gcg
 * @create 2020-01-07 13:49
 **/
public class EightHundredNinetyThree {

//    public int numSpecialEquivGroups(String[] A) {
//        Set<String> set = new HashSet<>();
//        char[] a;
//        char[] b = new char[A[0].length() / 2];
//        if (A[0].length() % 2 == 1) a = new char[A[0].length() / 2 + 1];
//        else a = new char[A[0].length() / 2];
//
//        for (String s : A) {
//            char[] chars = s.toCharArray();
//            for (int i = 0; i < chars.length; i++) {
//                if (i % 2 == 0) a[i / 2] = chars[i];
//                else b[i / 2] = chars[i];
//            }
//            Arrays.sort(a);
//            Arrays.sort(b);
//            set.add(new String(a) + new String(b));
//        }
//
//        return set.size();
//    }

    /**
     * 官方巨tm牛逼的解法
     * @param A
     * @return
     */
    public int numSpecialEquivGroups(String[] A) {
        Set<String> seen = new HashSet();
        for (String S : A) {
            int[] count = new int[52];
            for (int i = 0; i < S.length(); ++i)
                // 设置字母的索引和奇偶来确定整个字符串
                count[S.charAt(i) - 'a' + 26 * (i % 2)]++;
            seen.add(Arrays.toString(count));
        }
        return seen.size();
    }

}

package leetcode.easy;

/**
 * 383. 赎金信
 *
 * 给定一个赎金信 (ransom) 字符串和一个杂志(magazine)字符串，判断第一个字符串ransom能不能由第二个字符串magazines里面的字符构成。如果可以构成，返回 true ；否则返回 false。
 *
 * (题目说明：为了不暴露赎金信字迹，要从杂志上搜索各个需要的字母，组成单词来表达意思。)
 *
 * 注意：
 *
 * 你可以假设两个字符串均只含有小写字母。
 *
 * canConstruct("a", "b") -> false
 * canConstruct("aa", "ab") -> false
 * canConstruct("aa", "aab") -> true
 *
 * @author gcg
 * @create 2019-07-18 10:44
 **/
public class ThreeHundredEightyThree {

    // 哈希表解法
    public boolean canConstruct(String ransomNote, String magazine) {
        if (ransomNote.length() == 0) return true;
        if (ransomNote.length() > magazine.length()) return false;

        int[] results = new int[26];
        int count = ransomNote.length();

        char[] ransomNotes = ransomNote.toCharArray();
        char[] magazines = magazine.toCharArray();

        for (int i = 0; i < ransomNotes.length; i++) {
            results[ransomNotes[i] - 97] += 1;
        }

        int index;
        for (int i = 0; i < magazines.length; i++) {
            index = magazines[i] - 97;
            if (results[index] > 0) {
                results[index] -= 1;
                count--;
                if (count == 0) return true;
            }
        }

        return false;
    }

}

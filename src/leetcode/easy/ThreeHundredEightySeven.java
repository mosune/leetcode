package leetcode.easy;

/**
 * 387. 字符串中的第一个唯一字符
 *
 * 给定一个字符串，找到它的第一个不重复的字符，并返回它的索引。如果不存在，则返回 -1。
 *
 * 案例:
 *
 * s = "leetcode"
 * 返回 0.
 *
 * s = "loveleetcode",
 * 返回 2.
 *  
 *
 * 注意事项：您可以假定该字符串只包含小写字母。
 *
 * @author gcg
 * @create 2019-07-18 11:00
 **/
public class ThreeHundredEightySeven {

    public int firstUniqChar(String s) {
        char[] chars = s.toCharArray();
        int[] nums = new int[26];
        for (int i = 0; i < chars.length; i++) {
            nums[chars[i] - 97] += 1;
        }
        for (int i = 0; i< chars.length; i++) {
            if (nums[chars[i] - 97] == 1) return i;
        }
        return -1;
    }

}

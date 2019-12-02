package leetcode.easy;

/**
 * 744. 寻找比目标字母大的最小字母
 *
 * 给定一个只包含小写字母的有序数组letters 和一个目标字母 target，寻找有序数组里面比目标字母大的最小字母。
 *
 * 数组里字母的顺序是循环的。举个例子，如果目标字母target = 'z' 并且有序数组为 letters = ['a', 'b']，则答案返回 'a'。
 *
 * 示例:
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "a"
 * 输出: "c"
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "c"
 * 输出: "f"
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "d"
 * 输出: "f"
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "g"
 * 输出: "j"
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "j"
 * 输出: "c"
 *
 * 输入:
 * letters = ["c", "f", "j"]
 * target = "k"
 * 输出: "c"
 * 注:
 *
 * letters长度范围在[2, 10000]区间内。
 * letters 仅由小写字母组成，最少包含两个不同的字母。
 * 目标字母target 是一个小写字母。
 *
 * @author gcg
 * @create 2019-12-02 16:16
 **/
public class SevenHundredFortyFour {

//    public char nextGreatestLetter(char[] letters, char target) {
//        int start = 0, end = letters.length - 1;
//        while (start < end) {
//            int mid = (end - start) / 2 + start;
//            if (letters[mid] < target) {
//                if (mid + 1 < letters.length) {
//                    if (letters[mid + 1] <= target) start = mid + 1;
//                    else return letters[mid + 1];
//                } else break;
//            } else if (letters[mid] == target) {
//                if (mid == letters.length - 1) break;
//                else if (letters[mid + 1] != letters[mid]) return letters[mid + 1];
//                start = mid + 1;
//            } else {
//                if (mid - 1 >= 0) {
//                    if (letters[mid - 1] <= target) return letters[mid];
//                    else end = mid - 1;
//                } else break;
//            }
//        }
//        return letters[0];
//    }

    public char nextGreatestLetter(char[] letters, char target) {
        int start = 0, end = letters.length;
        while (start < end) {
            int mid = (end - start) / 2 + start;
            if (letters[mid] <= target) start = mid + 1;
            else end = mid;
        }
        // 如果插入的是最后一个，取模就是第一个
        return letters[start % letters.length];
    }

}

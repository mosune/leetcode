package leetcode.easy;

/**
 * 面试题 10.05. 稀疏数组搜索
 *
 * 稀疏数组搜索。有个排好序的字符串数组，其中散布着一些空字符串，编写一种方法，找出给定字符串的位置。
 *
 * 示例1:
 *
 *  输入: words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ta"
 *  输出：-1
 *  说明: 不存在返回-1。
 * 示例2:
 *
 *  输入：words = ["at", "", "", "", "ball", "", "", "car", "", "","dad", "", ""], s = "ball"
 *  输出：4
 * 提示:
 *
 * words的长度在[1, 1000000]之间
 *
 * @author gcg
 * @create 2020-05-06 11:41
 **/
public class InterviewTenFive {

    public int findString(String[] words, String s) {
        return findString(words, s, 0, words.length - 1);
    }

    private int findString(String[] words, String s, int start, int end) {
        if (start > end) return -1;
        int middle = start + (end - start) / 2;
        int result = -1;
        if (words[middle].equals("")) {
            result = Math.max(findString(words, s, start, middle - 1), result);
            if (result != -1) return result;
            result = Math.max(findString(words, s, middle + 1, end), result);
            if (result != -1) return result;
        } else {
            if (words[middle].equals(s)) return middle;
            if (words[middle].compareTo(s) < 0) {
                result = Math.max(findString(words, s, middle + 1, end), result);
                if (result != -1) return result;
            } else {
                result = Math.max(findString(words, s, start, middle - 1), result);
                if (result != -1) return result;
            }
        }
        return result;
    }

}

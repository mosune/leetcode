package leetcode.easy;

/**
 * 520. 检测大写字母
 *
 * 给定一个单词，你需要判断单词的大写使用是否正确。
 *
 * 我们定义，在以下情况时，单词的大写用法是正确的：
 *
 * 全部字母都是大写，比如"USA"。
 * 单词中所有字母都不是大写，比如"leetcode"。
 * 如果单词不只含有一个字母，只有首字母大写， 比如 "Google"。
 * 否则，我们定义这个单词没有正确使用大写字母。
 *
 * 示例 1:
 *
 * 输入: "USA"
 * 输出: True
 * 示例 2:
 *
 * 输入: "FlaG"
 * 输出: False
 * 注意: 输入是由大写和小写拉丁字母组成的非空单词。
 *
 * @author gcg
 * @create 2019-09-17 10:50
 **/
public class FiveHundredTwenty {

    public boolean detectCapitalUse(String word) {
        if (word.length() == 0) return false;
        char[] chars = word.toCharArray();
        if (chars[0] < 97) {
            if (chars.length> 1) {
                if (chars[1] < 97) {
                    for (int i = 2; i < chars.length; i++) {
                        if (chars[i] >= 97) return false;
                    }
                } else {
                    for (int i = 2; i < chars.length; i++) {
                        if (chars[i] < 97) return false;
                    }
                }
            }
        } else {
            for (int i = 1; i < chars.length; i++) {
                if (chars[i] < 97) return false;
            }
        }
        return true;
    }

}

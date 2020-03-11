package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1078. Bigram 分词
 *
 * 给出第一个词 first 和第二个词 second，考虑在某些文本 text 中可能以 "first second third" 形式出现的情况，其中 second 紧随 first 出现，third 紧随 second 出现。
 *
 * 对于每种这样的情况，将第三个词 "third" 添加到答案中，并返回答案。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：text = "alice is a good girl she is a good student", first = "a", second = "good"
 * 输出：["girl","student"]
 * 示例 2：
 *
 * 输入：text = "we will we will rock you", first = "we", second = "will"
 * 输出：["we","rock"]
 *  
 *
 * 提示：
 *
 * 1 <= text.length <= 1000
 * text 由一些用空格分隔的单词组成，每个单词都由小写英文字母组成
 * 1 <= first.length, second.length <= 10
 * first 和 second 由小写英文字母组成
 *
 * @author gcg
 * @create 2020-03-11 11:12
 **/
public class OneThousandSeventyEight {

    public String[] findOcurrences(String text, String first, String second) {
        List<String> list = new ArrayList<>();

        String[] strings = text.split(" ");
        for (int i = 0; i < strings.length - 2; i++) {
            if (strings[i].equals(first) && strings[i + 1].equals(second)) {
                list.add(strings[i + 2]);
            }
        }

        return list.toArray(new String[]{});
    }

}

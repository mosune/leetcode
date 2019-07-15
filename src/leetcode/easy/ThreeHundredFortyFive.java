package leetcode.easy;

/**
 * 345. 反转字符串中的元音字母
 *
 * 编写一个函数，以字符串作为输入，反转该字符串中的元音字母。
 *
 * 示例 1:
 *
 * 输入: "hello"
 * 输出: "holle"
 * 示例 2:
 *
 * 输入: "leetcode"
 * 输出: "leotcede"
 * 说明:
 * 元音字母不包含字母"y"。
 *
 * @author gcg
 * @create 2019-07-15 19:24
 **/
public class ThreeHundredFortyFive {

    public String reverseVowels(String s) {
        char[] chars = s.toCharArray();
        int i = 0, j = chars.length - 1;
        char c;
        while (i < j) {
            if (chars[i] == 'a' || chars[i] == 'e' || chars[i] == 'i' || chars[i] == 'o' || chars[i] == 'u') {
                while (i < j) {
                    if (chars[j] == 'a' || chars[j] == 'e' || chars[j] == 'i' || chars[j] == 'o' || chars[j] == 'u') {
                        if (chars[i] != chars[j]) {
                            c = chars[i];
                            chars[i] = chars[j];
                            chars[j] = c;
                        }
                        i++;
                        j--;
                        break;
                    } else j--;
                }
            } else i++;
        }
        return String.valueOf(chars);
    }

}

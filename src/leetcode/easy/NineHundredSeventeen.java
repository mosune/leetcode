package leetcode.easy;

/**
 * 917. 仅仅反转字母
 *
 * 给定一个字符串 S，返回 “反转后的” 字符串，其中不是字母的字符都保留在原地，而所有字母的位置发生反转。
 *
 *  
 *
 * 示例 1：
 *
 * 输入："ab-cd"
 * 输出："dc-ba"
 * 示例 2：
 *
 * 输入："a-bC-dEf-ghIj"
 * 输出："j-Ih-gfE-dCba"
 * 示例 3：
 *
 * 输入："Test1ng-Leet=code-Q!"
 * 输出："Qedo1ct-eeLg=ntse-T!"
 *  
 *
 * 提示：
 *
 * S.length <= 100
 * 33 <= S[i].ASCIIcode <= 122 
 * S 中不包含 \ or "
 *
 * @author gcg
 * @create 2020-01-10 14:07
 **/
public class NineHundredSeventeen {

    public String reverseOnlyLetters(String S) {
        char[] chars = S.toCharArray();
        int head = 0, last = chars.length - 1;

        while (head < last) {
            if (checkChar(chars[head])) {
                while (head < last) {
                    if (checkChar(chars[last])) {
                        char c = chars[last];
                        chars[last] = chars[head];
                        chars[head] = c;
                        last--;
                        break;
                    }
                    last--;
                }
            }
            head++;
        }

        return new String(chars);
    }

    private boolean checkChar(char c) {
        return (c >= 65 && c <= 90) || c >= 97;
    }

}

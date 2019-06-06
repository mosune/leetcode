package leetcode.easy;

/**
 *
 * 给定两个二进制字符串，返回他们的和（用二进制表示）。
 *
 * 输入为非空字符串且只包含数字 1 和 0。
 *
 * 示例 1:
 *
 * 输入: a = "11", b = "1"
 * 输出: "100"
 * 示例 2:
 *
 * 输入: a = "1010", b = "1011"
 * 输出: "10101"
 *
 * @author gcg
 * @create 2019-05-23 16:58
 **/
public class SixtySeven {

    public String addBinary(String a, String b) {
        char[] charsA = a.toCharArray();
        char[] charsB = b.toCharArray();
        if (charsA.length == 0 && charsB.length == 0) return "";
        if (charsA.length > charsB.length) return compare(charsA, charsB);
        else return compare(charsB, charsA);
    }

    private String compare(char[] charsA, char[] charsB) {
        int lengthA = charsA.length;
        int lengthB = charsB.length;
        boolean pre = false;
        int aIndex = lengthA - 1;
        int bIndex = lengthB - 1;
        while (aIndex >= 0 || bIndex >= 0) {
            char charA = charsA[aIndex];
            char charB;
            if (bIndex < 0) charB = '0';
            else charB = charsB[bIndex];
            if (charA == charB) {
                if (charA == '1') {
                    if (pre) {
                        charsA[aIndex] = '1';
                    } else {
                        charsA[aIndex] = '0';
                    }
                    pre = true;
                } else {
                    if (pre) {
                        charsA[aIndex] = '1';
                    } else {
                        charsA[aIndex] = '0';
                    }
                    pre = false;
                }
            } else {
                if (pre) {
                    pre = true;
                    charsA[aIndex] = '0';
                } else {
                    pre = false;
                    charsA[aIndex] = '1';
                }
            }
            aIndex--;
            bIndex--;
        }
        if (pre) {
            StringBuilder stringBuilder = new StringBuilder(String.valueOf(charsA));
            stringBuilder.insert(0, '1');
            return stringBuilder.toString();
        }
        return String.valueOf(charsA);
    }

}

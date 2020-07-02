package leetcode.middle;

/**
 * 43. 字符串相乘
 *
 * 给定两个以字符串形式表示的非负整数 num1 和 num2，返回 num1 和 num2 的乘积，它们的乘积也表示为字符串形式。
 *
 * 示例 1:
 *
 * 输入: num1 = "2", num2 = "3"
 * 输出: "6"
 * 示例 2:
 *
 * 输入: num1 = "123", num2 = "456"
 * 输出: "56088"
 * 说明：
 *
 * num1 和 num2 的长度小于110。
 * num1 和 num2 只包含数字 0-9。
 * num1 和 num2 均不以零开头，除非是数字 0 本身。
 * 不能使用任何标准库的大数类型（比如 BigInteger）或直接将输入转换为整数来处理。
 *
 * @author gcg
 * @create 2020-07-02 11:09
 **/
public class FortyThree {

//    public String multiply(String num1, String num2) {
//        if (num1.equals("0") || num2.equals("0")) return "0";
//        if (num1.equals("1")) return num2;
//        if (num2.equals("1")) return num1;
//
//        int[] result = new int[num1.length() + num2.length()];
//
//        for (int i = num1.length() - 1; i >= 0; i--) {
//            int index = 0;
//            for (int j = num2.length() - 1; j >= 0; j--) {
//                int num = (num1.charAt(i) - 48) * (num2.charAt(j)  - 48), newIndex = index;
//                int index2 = result.length - num1.length() + i;
//                while (num != 0) {
//                    int now = index2 - newIndex++;
//                    int a = result[now] + num % 10;
//                    if (a > 9) result[now - 1]++;
//                    result[now] = a % 10;
//                    num /= 10;
//                }
//                while (index2 - newIndex >= 0 && result[index2 - newIndex] >= 10) {
//                    int now = index2 - newIndex++;
//                    if (result[now] > 9) result[now - 1]++;
//                    result[now] %= 10;
//                }
//                index++;
//            }
//        }
//
//        int i = 0;
//        for (; i < result.length; i++) {
//            if (result[i] != 0) break;
//        }
//
//        StringBuilder sb = new StringBuilder();
//        for (; i < result.length; i++) sb.append(result[i]);
//
//        return sb.toString();
//    }

    public String multiply(String num1, String num2) {
        if (num1.equals("0") || num2.equals("0")) return "0";
        if (num1.equals("1")) return num2;
        if (num2.equals("1")) return num1;

        int[] result = new int[num1.length() + num2.length()];

        for (int i = num1.length() - 1; i >= 0; i--) {
            for (int j = num2.length() - 1; j >= 0; j--) {
                result[i + 1 + j] += (num1.charAt(i) - 48) * (num2.charAt(j)  - 48);
            }
        }

        for (int i = result.length - 1; i >= 1; i--) {
            result[i - 1] += result[i] / 10;
            result[i] %= 10;
        }

        int i = 0;
        for (; i < result.length; i++) {
            if (result[i] != 0) break;
        }

        StringBuilder sb = new StringBuilder();
        for (; i < result.length; i++) sb.append(result[i]);

        return sb.toString();
    }

}

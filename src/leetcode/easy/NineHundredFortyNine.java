package leetcode.easy;

/**
 * 949. 给定数字能组成的最大时间
 *
 * 给定一个由 4 位数字组成的数组，返回可以设置的符合 24 小时制的最大时间。
 *
 * 最小的 24 小时制时间是 00:00，而最大的是 23:59。从 00:00 （午夜）开始算起，过得越久，时间越大。
 *
 * 以长度为 5 的字符串返回答案。如果不能确定有效时间，则返回空字符串。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,2,3,4]
 * 输出："23:41"
 * 示例 2：
 *
 * 输入：[5,5,5,5]
 * 输出：""
 *  
 *
 * 提示：
 *
 * A.length == 4
 * 0 <= A[i] <= 9
 *
 * @author gcg
 * @create 2020-01-17 11:06
 **/
public class NineHundredFortyNine {

    /**
     * 复杂代码
     * @param A
     * @return
     */
//    public String largestTimeFromDigits(int[] A) {
//        String result = null;
//
//        for (int i = 0; i < A.length; i++) {
//            for (int j = 0; j < A.length; j++) {
//                if (i == j) continue;
//                int hour = A[i] * 10 + A[j];
//                if (hour > 23) continue;
//
//                for (int k = 0; k < A.length; k++) {
//                    if (k == i || k == j) continue;
//
//                    for (int t = 0; t < A.length; t++) {
//                        if (t == k || t == i || t == j) continue;
//                        int minutes = A[k] * 10 + A[t];
//                        if (minutes > 59) continue;
//                        StringBuilder stringBuilder = new StringBuilder();
//                        stringBuilder.append(A[i] + "" + A[j] + ":" + A[k] + "" + A[t]);
//                        if (result == null) result = stringBuilder.toString();
//                        else {
//                            if (hour > Integer.valueOf(result.substring(0, 2))) {
//                                result = stringBuilder.toString();
//                            } else if (hour == Integer.valueOf(result.substring(0, 2))) {
//                                if (minutes > Integer.valueOf(result.substring(3))) {
//                                    result = stringBuilder.toString();
//                                }
//                            }
//                        }
//                    }
//                }
//            }
//        }
//
//        return result == null ? "" : result;
//    }

    /**
     * 简洁
     * @param A
     * @return
     */
    public String largestTimeFromDigits(int[] A) {
        int max = -1;

        for (int i = 0; i < A.length; i++) {
            for (int j = 0; j < A.length; j++) {
                if (i == j) continue;
                int hour = A[i] * 10 + A[j];
                if (hour > 23) continue;

                for (int k = 0; k < A.length; k++) {
                    if (k == i || k == j) continue;

                    // 最后一个索引
                    int t = 6 - i - j - k;

                    int minutes = A[k] * 10 + A[t];
                    if (minutes > 59) continue;

                    max = Math.max(max, hour * 60 + minutes);
                }
            }
        }
        // 直接计算结果
        return max == -1 ? "" : String.format("%02d:%02d", max / 60, max % 60);
    }

}

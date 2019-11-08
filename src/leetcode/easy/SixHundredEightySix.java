package leetcode.easy;

/**
 * 686. 重复叠加字符串匹配
 *
 * 给定两个字符串 A 和 B, 寻找重复叠加字符串A的最小次数，使得字符串B成为叠加后的字符串A的子串，如果不存在则返回 -1。
 *
 * 举个例子，A = "abcd"，B = "cdabcdab"。
 *
 * 答案为 3， 因为 A 重复叠加三遍后为 “abcdabcdabcd”，此时 B 是其子串；A 重复叠加两遍后为"abcdabcd"，B 并不是其子串。
 *
 * 注意:
 *
 *  A 与 B 字符串的长度在1和10000区间范围内。
 *
 * @author gcg
 * @create 2019-11-08 16:41
 **/
public class SixHundredEightySix {

    /**
     * 计算到A的长度最多到大于B的长度加上自身2倍的长度，超过这个范围就没有数据了
     * @param A
     * @param B
     * @return
     */
//    public int repeatedStringMatch(String A, String B) {
//        String a = A;
//        int sum = B.length() % A.length() == 0 ? B.length() / A.length() : B.length() / A.length() + 1;
//        for (int i = 0; i < sum - 1; i++) A += a;
//        int index = 0;
//        do {
//            if (A.contains(B)) return sum;
//            index++;
//            A += a;
//        } while (index < 2);
//        return -1;
//    }

    /**
     * 较为简单的写法
     * @param A
     * @param B
     * @return
     */
    public int repeatedStringMatch(String A, String B) {
        if (B == null || B.length() == 0) return 0;
        String a = A;
        int end = A.length() * 2 + B.length();
        for (int sum = 1; A.length() <= end; sum++, A += a) {
            if (A.contains(B)) return sum;
        }
        return -1;
    }

}

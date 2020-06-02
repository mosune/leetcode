package leetcode.easy;

/**
 * 面试题62. 圆圈中最后剩下的数字
 *
 * 0,1,,n-1这n个数字排成一个圆圈，从数字0开始，每次从这个圆圈里删除第m个数字。求出这个圆圈里剩下的最后一个数字。
 *
 * 例如，0、1、2、3、4这5个数字组成一个圆圈，从数字0开始每次删除第3个数字，则删除的前4个数字依次是2、0、4、1，因此最后剩下的数字是3。
 *
 *  
 *
 * 示例 1：
 *
 * 输入: n = 5, m = 3
 * 输出: 3
 * 示例 2：
 *
 * 输入: n = 10, m = 17
 * 输出: 2
 *  
 *
 * 限制：
 *
 * 1 <= n <= 10^5
 * 1 <= m <= 10^6
 *
 * @author gcg
 * @create 2020-06-02 14:20
 **/
public class InterviewSixtyTwo {

    /**
     * 会超时
     * @param n
     * @param m
     * @return
     */
//    public int lastRemaining(int n, int m) {
//        CicelyListNode head = new CicelyListNode(0);
//        CicelyListNode index = head;
//        for (int i = 1; i < n; i++) {
//            index.next = new CicelyListNode(i);
//            index = index.next;
//        }
//        index.next = head;
//
//        CicelyListNode pre = index;
//        index = head;
//        int size = 0, length = n;
//        while (length != 1) {
//            size++;
//            if (size % m == 0) {
//                pre.next = index.next;
//                index = pre.next;
//                length--;
//            } else {
//                index = pre.next.next;
//                pre = pre.next;
//            }
//        }
//
//        return index.val;
//    }
//
//    class CicelyListNode {
//
//        int val;
//
//        CicelyListNode next;
//
//        CicelyListNode(int val) {
//            this.val = val;
//        }
//    }

    public int lastRemaining(int n, int m) {
        if (n == 1) return 0;
        int x = lastRemaining(n - 1, m);
        // 最几把牛逼
        return (m + x) % n;
    }

}



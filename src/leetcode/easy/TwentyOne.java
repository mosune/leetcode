package leetcode.easy;

/**
 *
 * 将两个有序链表合并为一个新的有序链表并返回。新链表是通过拼接给定的两个链表的所有节点组成的。
 *
 * 示例：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 *
 * @author gcg
 * @create 2019-05-07 12:05
 **/
public class TwentyOne {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
//        ListNode newNode = new ListNode(0);
//        ListNode index = newNode;
//        while (l1 != null || l2 != null) {
//            ListNode node;
//            if (l1 == null) {
//                node = new ListNode(l2.val);
//                l2 = l2.next;
//            } else if (l2 == null) {
//                node = new ListNode(l1.val);
//                l1 = l1.next;
//            } else {
//                if (l1.val > l2.val) {
//                    node = new ListNode(l2.val);
//                    l2 = l2.next;
//                } else {
//                    node = new ListNode(l1.val);
//                    l1 = l1.next;
//                }
//            }
//            index.next = node;
//            index = node;
//        }
//        return newNode.next;
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        if (l1.val < l2.val) {
            l1.next = mergeTwoLists(l1.next, l2);
            return l1;
        } else {
            l2.next = mergeTwoLists(l1, l2.next);
            return l2;
        }
    }

}

class ListNode {
    int val;

    ListNode next;

    ListNode(int x) {
        val = x;
    }
}

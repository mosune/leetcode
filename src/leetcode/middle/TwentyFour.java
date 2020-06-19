package leetcode.middle;

import leetcode.commom.ListNode;

/**
 * 24. 两两交换链表中的节点
 *
 * 给定一个链表，两两交换其中相邻的节点，并返回交换后的链表。
 *
 * 你不能只是单纯的改变节点内部的值，而是需要实际的进行节点交换。
 *
 *  
 *
 * 示例:
 *
 * 给定 1->2->3->4, 你应该返回 2->1->4->3.
 *
 * @author gcg
 * @create 2020-06-19 14:33
 **/
public class TwentyFour {

//    public ListNode swapPairs(ListNode head) {
//        ListNode start = new ListNode(0);
//        start.next = head;
//
//        ListNode slow = start, fast = start;
//
//        while (slow.next != null && slow.next.next != null) {
//            fast = fast.next;
//            slow.next = fast.next;
//            fast.next = fast.next.next;
//            slow.next.next = fast;
//            slow = slow.next.next;
//        }
//
//        return start.next;
//    }

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) return head;

        ListNode two = head.next;

        head.next = swapPairs(two.next);
        two.next = head;

        return two;
    }

}

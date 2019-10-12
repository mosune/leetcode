package leetcode.easy;

import leetcode.commom.ListNode;

/**
 * 206. 反转链表
 *
 * 反转一个单链表。
 *
 * 示例:
 *
 * 输入: 1->2->3->4->5->NULL
 * 输出: 5->4->3->2->1->NULL
 * 进阶:
 * 你可以迭代或递归地反转链表。你能否用两种方法解决这道题？
 *
 * @author gcg
 * @create 2019-06-24 14:54
 **/
public class TwoHundredSix {

    // 迭代写法
//    public ListNode reverseList(ListNode head) {
//        ListNode index = head;
//        ListNode next = null;
//
//        while (index != null) {
//            ListNode node = index.next;
//            index.next = next;
//            next = index;
//            index = node;
//        }
//
//        return next;
//    }

    // 递归写法
    public ListNode reverseList(ListNode head) {
        if (head == null || head.next == null) return head;
        // 取到最后的节点
        ListNode index = reverseList(head.next);
        // 当前节点会一直在倒数的第二位
        // 把当前节点放在下一个节点的next
        head.next.next = head;
        // 当前节点的next置为null
        head.next = null;
        // 返回最后一个节点
        return index;
    }

}

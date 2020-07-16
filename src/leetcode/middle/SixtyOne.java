package leetcode.middle;

import leetcode.commom.ListNode;

/**
 * 61. 旋转链表
 *
 * 给定一个链表，旋转链表，将链表每个节点向右移动 k 个位置，其中 k 是非负数。
 *
 * 示例 1:
 *
 * 输入: 1->2->3->4->5->NULL, k = 2
 * 输出: 4->5->1->2->3->NULL
 * 解释:
 * 向右旋转 1 步: 5->1->2->3->4->NULL
 * 向右旋转 2 步: 4->5->1->2->3->NULL
 * 示例 2:
 *
 * 输入: 0->1->2->NULL, k = 4
 * 输出: 2->0->1->NULL
 * 解释:
 * 向右旋转 1 步: 2->0->1->NULL
 * 向右旋转 2 步: 1->2->0->NULL
 * 向右旋转 3 步: 0->1->2->NULL
 * 向右旋转 4 步: 2->0->1->NULL
 *
 * @author gcg
 * @create 2020-07-16 10:27
 **/
public class SixtyOne {

    public ListNode rotateRight(ListNode head, int k) {
        if (k == 0) return head;
        int length = 0;
        ListNode node = head;
        while (node != null) {
            length++;
            node = node.next;
        }
        if (length == 0 || length == 1) return head;

        k %= length;
        if (k == 0) return head;

        ListNode zero = new ListNode(0);
        zero.next = head;

        ListNode fast = zero;
        for (int i = 1; i <= length - k; i++) {
            fast = fast.next;
        }
        zero.next = fast.next;
        fast.next = null;

        node = zero;

        while (node.next != null) {
            node = node.next;
        }
        node.next = head;

        return zero.next;
    }

}

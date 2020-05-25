package leetcode.easy;

import leetcode.commom.ListNode;

/**
 * 面试题25. 合并两个排序的链表
 *
 * 输入两个递增排序的链表，合并这两个链表并使新链表中的节点仍然是递增排序的。
 *
 * 示例1：
 *
 * 输入：1->2->4, 1->3->4
 * 输出：1->1->2->3->4->4
 * 限制：
 *
 * 0 <= 链表长度 <= 1000
 *
 * 注意：本题与主站 21 题相同：https://leetcode-cn.com/problems/merge-two-sorted-lists/
 *
 * @author gcg
 * @create 2020-05-25 10:55
 **/
public class InterviewTwentyFive {

    public ListNode mergeTwoLists(ListNode l1, ListNode l2) {
        ListNode root = new ListNode(0);
        ListNode index = root;

        while (l1 != null && l2 != null) {
            if (l1.val < l2.val) {
                index.next = l1;
                l1 = l1.next;
            } else {
                index.next = l2;
                l2 = l2.next;
            }
            index = index.next;
        }

        index.next = l1 == null ? l2 : l1;

        return root.next;
    }

}

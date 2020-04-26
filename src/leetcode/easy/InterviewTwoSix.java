package leetcode.easy;

import leetcode.commom.ListNode;

import java.util.Stack;

/**
 * 面试题 02.06. 回文链表
 *
 * 编写一个函数，检查输入的链表是否是回文的。
 *
 *  
 *
 * 示例 1：
 *
 * 输入： 1->2
 * 输出： false
 * 示例 2：
 *
 * 输入： 1->2->2->1
 * 输出： true
 *  
 *
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * @author gcg
 * @create 2020-04-26 11:28
 **/
public class InterviewTwoSix {

    /**
     * 栈方法
     * @param head
     * @return
     */
//    public boolean isPalindrome(ListNode head) {
//        ListNode node = head;
//        int length = 0;
//        while (node != null) {
//            node = node.next;
//            length++;
//        }
//
//        Stack<Integer> stack = new Stack<>();
//        for (int i = 0; i < length / 2; i++) {
//            stack.push(head.val);
//            head = head.next;
//        }
//
//        if (length % 2 == 1) head = head.next;
//        for (int i = 0; i < length / 2; i++) {
//            if (head.val == stack.peek()) stack.pop();
//            else return false;
//            head = head.next;
//        }
//
//        return true;
//    }

    /**
     * 双指针+反转链表
     * @param head
     * @return
     */
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head, fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode pre = slow.next, newHead = pre;
        ListNode now = pre.next;
        while (now != null) {
            ListNode next = now.next;
            pre.next = now.next;
            now.next = newHead;
            newHead = now;
            now = next;
        }

        while (newHead != null) {
            if (head.val != newHead.val) return false;
            head = head.next;
            newHead = newHead.next;
        }

        return true;
    }

}

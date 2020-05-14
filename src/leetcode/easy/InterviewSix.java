package leetcode.easy;

import leetcode.commom.ListNode;

/**
 * 面试题06. 从尾到头打印链表
 *
 * 输入一个链表的头节点，从尾到头反过来返回每个节点的值（用数组返回）。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：head = [1,3,2]
 * 输出：[2,3,1]
 *  
 *
 * 限制：
 *
 * 0 <= 链表长度 <= 10000
 *
 * @author gcg
 * @create 2020-05-14 16:59
 **/
public class InterviewSix {

    public int[] reversePrint(ListNode head) {
        int length = 0;
        ListNode root = head;
        while (root != null) {
            length++;
            root = root.next;
        }
        int[] nums = new int[length];

        for (int i = length - 1; i >= 0; i--) {
            nums[i] = head.val;
            head = head.next;
        }

        return nums;
    }

}

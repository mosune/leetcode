package leetcode.easy;

import leetcode.commom.ListNode;

import java.util.HashSet;
import java.util.Set;

/**
 * 面试题 02.01. 移除重复节点
 *
 * 编写代码，移除未排序链表中的重复节点。保留最开始出现的节点。
 *
 * 示例1:
 *
 *  输入：[1, 2, 3, 3, 2, 1]
 *  输出：[1, 2, 3]
 * 示例2:
 *
 *  输入：[1, 1, 1, 1, 2]
 *  输出：[1, 2]
 * 提示：
 *
 * 链表长度在[0, 20000]范围内。
 * 链表元素在[0, 20000]范围内。
 * 进阶：
 *
 * 如果不得使用临时缓冲区，该怎么解决？
 *
 * @author gcg
 * @create 2020-04-24 11:39
 **/
public class InterviewTwoOne {

    public ListNode removeDuplicateNodes(ListNode head) {
        if (head == null) return head;
        Set<Integer> set = new HashSet<>();

        set.add(head.val);
        ListNode node = head;
        while (node.next != null) {
            if (set.contains(node.next.val)) node.next = node.next.next;
            else {
                set.add(node.next.val);
                node = node.next;
            }
        }

        return head;
    }

}

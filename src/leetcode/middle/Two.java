package leetcode.middle;

import leetcode.commom.ListNode;

/**
 * 2. 两数相加
 *
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储 一位 数字。
 *
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 *
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 *
 * 示例：
 *
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807
 *
 * @author gcg
 * @create 2020-06-04 09:47
 **/
public class Two {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        if (l1 == null) return l2;
        if (l2 == null) return l1;
        ListNode head = l1, pre = l1;
        boolean isAddOne = false;
        while (l1 != null || l2 != null) {
            if (l1 != null && l2 != null) {
                int num = l1.val + l2.val;
                if (isAddOne) num++;
                l1.val = num % 10;
                if (num > 9) isAddOne = true;
                else isAddOne = false;
            }
            if (l1 == null) {
                pre.next = l2;
                while (isAddOne && l2 != null) {
                    int num = l2.val + 1;
                    l2.val = num % 10;
                    if (num > 9) {
                        isAddOne = true;
                        pre = l2;
                        l2 = l2.next;
                    } else isAddOne = false;
                }
                break;
            }
            if (l2 == null) {
                while (isAddOne && l1 != null) {
                    int num = l1.val + 1;
                    l1.val = num % 10;
                    if (num > 9) {
                        isAddOne = true;
                        pre = l1;
                        l1 = l1.next;
                    } else isAddOne = false;
                }
                break;
            }
            pre = l1;
            l1 = l1.next;
            l2 = l2.next;
        }
        if (isAddOne) pre.next = new ListNode(1);
        return head;
    }

}

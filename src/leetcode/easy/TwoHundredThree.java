package leetcode.easy;

/**
 * 203. 移除链表元素
 *
 * 删除链表中等于给定值 val 的所有节点。
 *
 * 示例:
 *
 * 输入: 1->2->6->3->4->5->6, val = 6
 * 输出: 1->2->3->4->5
 *
 * @author gcg
 * @create 2019-06-17 15:03
 **/
public class TwoHundredThree {

    // 双指针法，刚开始的循环可以使用哨兵节点解决
//    public ListNode removeElements(ListNode head, int val) {
//        if (head == null) return null;
//        while (head.val == val) {
//            head = head.next;
//        }
//        if (head == null) return null;
//        ListNode pre = head;
//        ListNode index = head.next;
//        while (index != null) {
//            if (index.val == val) {
//                pre.next = index.next;
//            } else {
//                pre = index;
//            }
//            index = index.next;
//        }
//
//        return head;
//    }

    // 递归解法
    public ListNode removeElements(ListNode head, int val) {
        if (head == null) return null;

        head.next = removeElements(head.next, val);

        return head.val == val ? head.next : head;
    }

}

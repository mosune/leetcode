package leetcode.easy;

/**
 * 234. 回文链表
 *
 * 请判断一个链表是否为回文链表。
 *
 * 示例 1:
 *
 * 输入: 1->2
 * 输出: false
 * 示例 2:
 *
 * 输入: 1->2->2->1
 * 输出: true
 * 进阶：
 * 你能否用 O(n) 时间复杂度和 O(1) 空间复杂度解决此题？
 *
 * @author gcg
 * @create 2019-06-28 10:14
 **/
public class TwoHundredThirtyFour {

    // 新建反转链表进行对比
//    public boolean isPalindrome(ListNode head) {
//        if (head == null) return false;
//        ListNode newHead = new ListNode(head.val);
//        ListNode next = head.next;
//        while (next != null) {
//            int num = next.val;
//            next = next.next;
//            ListNode nextNode = new ListNode(num);
//            nextNode.next = newHead;
//            newHead = nextNode;
//        }
//
//        while (head != null) {
//            if (head.val != newHead.val) return false;
//            head = head.next;
//            newHead = newHead.next;
//        }
//
//        return true;
//    }

    // 快慢指针找中间节点，后半部翻转进行比较
    public boolean isPalindrome(ListNode head) {
        ListNode slow = head;
        ListNode fast = head;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }

        ListNode lastHead = slow.next;
        ListNode next = lastHead.next;
        lastHead.next = null;
        while (next != null) {
            ListNode node = next.next;
            next.next = lastHead;
            lastHead = next;
            next = node;
        }

        while (lastHead != null) {
            if (head.val != lastHead.val) return false;
            head = head.next;
            lastHead = lastHead.next;
        }

        return true;
    }

}

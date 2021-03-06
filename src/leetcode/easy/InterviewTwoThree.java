package leetcode.easy;

import leetcode.commom.ListNode;

/**
 * 面试题 02.03. 删除中间节点
 *
 * 实现一种算法，删除单向链表中间的某个节点（除了第一个和最后一个节点，不一定是中间节点），假定你只能访问该节点。
 *
 *  
 *
 * 示例：
 *
 * 输入：单向链表a->b->c->d->e->f中的节点c
 * 结果：不返回任何数据，但该链表变为a->b->d->e->f
 *
 * @author gcg
 * @create 2020-04-26 10:56
 **/
public class InterviewTwoThree {

//    public void deleteNode(ListNode node) {
//        ListNode pre = node;
//        while (node.next != null) {
//            pre = node;
//            node.val = node.next.val;
//            node = node.next;
//        }
//        pre.next = null;
//    }

    public void deleteNode(ListNode node) {
        node.val = node.next.val;
        node.next = node.next.next;
    }

}

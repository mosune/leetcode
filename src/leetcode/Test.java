package leetcode;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        EightyThree eightyThree = new EightyThree();

        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(1);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(3);
        listNode.next.next.next.next = new ListNode(3);

        System.out.println(eightyThree.deleteDuplicates(listNode));
        System.out.println(1);
    }

}

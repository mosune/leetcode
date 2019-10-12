package leetcode.easy;

/**
 * 155. 最小栈
 *
 * 设计一个支持 push，pop，top 操作，并能在常数时间内检索到最小元素的栈。
 *
 * push(x) -- 将元素 x 推入栈中。
 * pop() -- 删除栈顶的元素。
 * top() -- 获取栈顶元素。
 * getMin() -- 检索栈中的最小元素。
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.getMin();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.getMin();   --> 返回 -2.
 *
 * @author gcg
 * @create 2019-06-08 17:09
 **/
public class OneHundredFiftyFive {

    /**
     * 头节点
     */
    private Node head;

    /**
     * 最小值头节点
     */
    private Node minHead;

    public OneHundredFiftyFive() {}

    public void push(int x) {
        if (minHead == null) minHead = new Node(x);
        else {
            if (x <= minHead.val) {
                Node node = new Node(x);
                node.next = minHead;
                minHead = node;
            }
        }
        Node node = new Node(x);
        node.next = head;
        head = node;
    }

    public void pop() {
        int val = head.val;
        head = head.next;
        if (val == minHead.val) {
            minHead = minHead.next;
        }
    }

    public int top() {
        return head.val;
    }

    public int getMin() {
        return minHead.val;
    }

    /**
     * 节点
     */
    class Node {

        int val;

        Node next;

        public Node(int val) {
            this.val = val;
        }

    }

}

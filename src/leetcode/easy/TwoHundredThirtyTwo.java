package leetcode.easy;

import java.util.Stack;

/**
 * 232. 用栈实现队列
 *
 * 使用栈实现队列的下列操作：
 *
 * push(x) -- 将一个元素放入队列的尾部。
 * pop() -- 从队列首部移除元素。
 * peek() -- 返回队列首部的元素。
 * empty() -- 返回队列是否为空。
 * 示例:
 *
 * MyQueue queue = new MyQueue();
 *
 * queue.push(1);
 * queue.push(2);
 * queue.peek();  // 返回 1
 * queue.pop();   // 返回 1
 * queue.empty(); // 返回 false
 * 说明:
 *
 * 你只能使用标准的栈操作 -- 也就是只有 push to top, peek/pop from top, size, 和 is empty 操作是合法的。
 * 你所使用的语言也许不支持栈。你可以使用 list 或者 deque（双端队列）来模拟一个栈，只要是标准的栈操作即可。
 * 假设所有操作都是有效的 （例如，一个空的队列不会调用 pop 或者 peek 操作）。
 *
 * @author gcg
 * @create 2019-06-27 10:57
 **/
public class TwoHundredThirtyTwo {

    public static void main(String[] args) {
        MyQueue obj = new MyQueue();
        obj.push(1);
        obj.push(2);
        obj.push(3);
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.pop());
        System.out.println(obj.peek());
        System.out.println(obj.empty());
        System.out.println(obj.pop());
        System.out.println(obj.empty());
    }


}

/**
 * 一个队列，同出同进
 */
//class MyQueue {
//
//    private Stack<Integer> stack;
//
//    int top;
//
//    /** Initialize your data structure here. */
//    public MyQueue() {
//        stack = new Stack<>();
//    }
//
//    /** Push element x to the back of queue. */
//    public void push(int x) {
//        stack.push(x);
//        if (stack.size() == 1) {
//            top = x;
//        }
//    }
//
//    /** Removes the element from in front of queue and returns that element. */
//    public int pop() {
//        Stack<Integer> newStack = new Stack();
//        int size = stack.size();
//        for (int i = 0; i < size - 1; i++) {
//            newStack.push(stack.pop());
//        }
//        int num = stack.pop();
//        for (int i = 0; i < size - 1; i++) {
//            int n = newStack.pop();
//            if (i == 0) top = n;
//            stack.push(n);
//        }
//        return num;
//    }
//
//    /** Get the front element. */
//    public int peek() {
//        return top;
//    }
//
//    /** Returns whether the queue is empty. */
//    public boolean empty() {
//        return stack.empty();
//    }
//}

class MyQueue {

    private Stack<Integer> push;

    private Stack<Integer> take;

    int top;

    /** Initialize your data structure here. */
    public MyQueue() {
        push = new Stack<>();
        take = new Stack<>();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        push.push(x);
        if (push.size() == 1) top = x;
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if (take.empty()) {
            int size = push.size();
            for (int i = 0; i < size - 1; i++) take.push(push.pop());
            return push.pop();
        }
        return take.pop();
    }

    /** Get the front element. */
    public int peek() {
        if (take.size() != 0) return take.peek();
        return top;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return push.empty() && take.empty();
    }
}

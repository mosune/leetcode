package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 225. 用队列实现栈
 *
 * 使用队列实现栈的下列操作：
 *
 * push(x) -- 元素 x 入栈
 * pop() -- 移除栈顶元素
 * top() -- 获取栈顶元素
 * empty() -- 返回栈是否为空
 * 注意:
 *
 * 你只能使用队列的基本操作-- 也就是 push to back, peek/pop from front, size, 和 is empty 这些操作是合法的。
 * 你所使用的语言也许不支持队列。 你可以使用 list 或者 deque（双端队列）来模拟一个队列 , 只要是标准的队列操作即可。
 * 你可以假设所有操作都是有效的（例如, 对一个空的栈不会调用 pop 或者 top 操作）。
 *
 * @author gcg
 * @create 2019-06-26 10:49
 **/
public class TwoHundredTwentyFive {

    Queue<Integer> queue;

    int top;

    /** Initialize your data structure here. */
    public TwoHundredTwentyFive() {
        queue = new LinkedList<>();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        queue.offer(x);
        top = x;
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        int size = queue.size();

        for (int i = 1; i < size; i++) {
            int n = queue.poll();
            queue.offer(n);
            if (i == size - 1) {
                top = n;
            }
        }

        return queue.poll();
    }

    /** Get the top element. */
    public int top() {
        return top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return queue.isEmpty();
    }

}

/**
 * 俩个队列实现
 */
//class TwoHundredTwentyFive {
//
//    Queue<Integer> index;
//
//    int count;
//
//    int top;
//
//    /** Initialize your data structure here. */
//    public TwoHundredTwentyFive() {
//        index = new LinkedList();
//        count = 0;
//    }
//
//    /** Push element x onto stack. */
//    public void push(int x) {
//        count++;
//        top = x;
//        index.offer(x);
//    }
//
//    /** Removes the element on top of the stack and returns that element. */
//    public int pop() {
//        count--;
//        Queue<Integer> other = new LinkedList<>();
//        for (int i = 1; i <= count; i++) {
//            int n = index.poll();
//            other.offer(n);
//            if (i == count) {
//                top = n;
//            }
//        }
//        int num = index.poll();
//        index = other;
//        return num;
//    }
//
//    /** Get the top element. */
//    public int top() {
//        return top;
//    }
//
//    /** Returns whether the stack is empty. */
//    public boolean empty() {
//        return count == 0;
//    }
//}
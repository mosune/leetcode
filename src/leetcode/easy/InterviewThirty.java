package leetcode.easy;

import java.util.Iterator;
import java.util.Stack;

/**
 * 面试题30. 包含min函数的栈
 *
 * 定义栈的数据结构，请在该类型中实现一个能够得到栈的最小元素的 min 函数在该栈中，调用 min、push 及 pop 的时间复杂度都是 O(1)。
 *
 *  
 *
 * 示例:
 *
 * MinStack minStack = new MinStack();
 * minStack.push(-2);
 * minStack.push(0);
 * minStack.push(-3);
 * minStack.min();   --> 返回 -3.
 * minStack.pop();
 * minStack.top();      --> 返回 0.
 * minStack.min();   --> 返回 -2.
 *  
 *
 * 提示：
 *
 * 各函数的调用总次数不超过 20000 次
 *  
 *
 * 注意：本题与主站 155 题相同：https://leetcode-cn.com/problems/min-stack/
 *
 * @author gcg
 * @create 2020-05-26 11:10
 **/
public class InterviewThirty {

//    Stack<Integer> stack1;
//
//    Stack<Integer> stack2;
//
//    public InterviewThirty() {
//        stack1 = new Stack<>();
//        stack2 = new Stack<>();
//    }
//
//    public void push(int x) {
//        while (!stack2.isEmpty()) stack1.push(stack2.pop());
//        stack1.push(x);
//    }
//
//    public void pop() {
//        while (!stack2.isEmpty()) stack1.push(stack2.pop());
//        stack1.pop();
//    }
//
//    public int top() {
//        while (!stack2.isEmpty()) stack1.push(stack2.pop());
//        return stack1.peek();
//    }
//
//    public int min() {
//        int min = Integer.MAX_VALUE;
//        Iterator<Integer> it = stack1.iterator();
//        while (it.hasNext()) min = Math.min(it.next(), min);
//        while (!stack2.isEmpty()) {
//            int num = stack2.pop();
//            min = Math.min(num, min);
//            stack1.push(num);
//        }
//        return min;
//    }

    Stack<Integer> stack1;

    Stack<Integer> stack2;

    public InterviewThirty() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void push(int x) {
        stack1.push(x);
        if (stack2.isEmpty() || x <= stack2.peek()) stack2.push(x);
    }

    public void pop() {
        if (stack1.pop().equals(stack2.peek())) stack2.pop();
    }

    public int top() {
        return stack1.peek();
    }

    public int min() {
        return stack2.peek();
    }

}

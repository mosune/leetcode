package leetcode.easy;

import java.util.Stack;

/**
 * 面试题09. 用两个栈实现队列
 *
 * 用两个栈实现一个队列。队列的声明如下，请实现它的两个函数 appendTail 和 deleteHead ，分别完成在队列尾部插入整数和在队列头部删除整数的功能。(若队列中没有元素，deleteHead 操作返回 -1 )
 *
 *  
 *
 * 示例 1：
 *
 * 输入：
 * ["CQueue","appendTail","deleteHead","deleteHead"]
 * [[],[3],[],[]]
 * 输出：[null,null,3,-1]
 * 示例 2：
 *
 * 输入：
 * ["CQueue","deleteHead","appendTail","appendTail","deleteHead","deleteHead"]
 * [[],[],[5],[2],[],[]]
 * 输出：[null,-1,null,null,5,2]
 * 提示：
 *
 * 1 <= values <= 10000
 * 最多会对 appendTail、deleteHead 进行 10000 次调用
 *
 * @author gcg
 * @create 2020-05-15 10:48
 **/
public class InterviewNine {

    Stack<Integer> head;

    Stack<Integer> tail;

    public InterviewNine() {
        head = new Stack<>();
        tail = new Stack<>();
    }

    public void appendTail(int value) {
        if (!tail.empty()) {
            while (!tail.empty()) head.push(tail.pop());
        }
        head.push(value);
    }

    public int deleteHead() {
        if (!head.empty()) {
            while (!head.empty()) tail.push(head.pop());
        }
        if (tail.empty()) return -1;
        return tail.pop();
    }

}

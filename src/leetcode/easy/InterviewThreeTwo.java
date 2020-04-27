package leetcode.easy;

import java.util.ArrayList;
import java.util.Collections;
import java.util.LinkedList;
import java.util.List;

/**
 * 面试题 03.02. 栈的最小值
 *
 * 请设计一个栈，除了常规栈支持的pop与push函数以外，还支持min函数，该函数返回栈元素中的最小值。执行push、pop和min操作的时间复杂度必须为O(1)。
 *
 *
 * 示例：
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
 * @create 2020-04-27 12:12
 **/
public class InterviewThreeTwo {

//    List<Integer> list = new LinkedList<>();
//
//    List<Integer> minList = new ArrayList<>();
//
//    int min = Integer.MAX_VALUE;
//
//    public InterviewThreeTwo() {
//    }
//
//    public void push(int x) {
//        list.add(x);
//        min = Math.min(min, x);
//        minList.add(x);
//    }
//
//    public void pop() {
//        if (list.size() == 0) return;
//        Integer num = list.get(list.size() - 1);
//        list.remove(list.size() - 1);
//        minList.remove(num);
//        if (list.size() == 0) min = Integer.MAX_VALUE;
//        else if (num == min) {
//            Collections.sort(minList);
//            min = minList.get(0);
//        }
//    }
//
//    public int top() {
//        return list.get(list.size() - 1);
//    }
//
//    public int getMin() {
//        if (list.size() == 0) return -1;
//        return min;
//    }

    List<Node> list = new LinkedList<>();

    public InterviewThreeTwo() {
    }

    public void push(int x) {
        int min = x;
        if (list.size() != 0) min = Math.min(x, list.get(list.size() - 1).min);
        list.add(new Node(x, min));
    }

    public void pop() {
        if (list.size() != 0 ) list.remove(list.size() - 1);
    }

    public int top() {
        if (list.size() == 0) return -1;
        return list.get(list.size() - 1).val;
    }

    public int getMin() {
        if (list.size() == 0) return -1;
        return list.get(list.size() - 1).min;
    }

    class Node {

        Node(int val, int min) {
            this.val = val;
            this.min = min;
        }

        int val;

        int min;
    }

}

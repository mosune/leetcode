package leetcode.easy;

/**
 * 面试题 03.01. 三合一
 *
 * 三合一。描述如何只用一个数组来实现三个栈。
 *
 * 你应该实现push(stackNum, value)、pop(stackNum)、isEmpty(stackNum)、peek(stackNum)方法。stackNum表示栈下标，value表示压入的值。
 *
 * 构造函数会传入一个stackSize参数，代表每个栈的大小。
 *
 * 示例1:
 *
 *  输入：
 * ["TripleInOne", "push", "push", "pop", "pop", "pop", "isEmpty"]
 * [[1], [0, 1], [0, 2], [0], [0], [0], [0]]
 *  输出：
 * [null, null, null, 1, -1, -1, true]
 * 说明：当栈为空时`pop, peek`返回-1，当栈满时`push`不压入元素。
 * 示例2:
 *
 *  输入：
 * ["TripleInOne", "push", "push", "push", "pop", "pop", "pop", "peek"]
 * [[2], [0, 1], [0, 2], [0, 3], [0], [0], [0], [0]]
 *  输出：
 * [null, null, null, null, 2, 1, -1, -1]
 *
 * @author gcg
 * @create 2020-04-27 11:33
 **/
public class InterviewThreeOne {

    int[] nums;

    int size;

    int one = -1;

    int two;

    int three;

    public InterviewThreeOne(int stackSize) {
        nums = new int[stackSize * 3];
        size = stackSize;
        two = stackSize - 1;
        three = stackSize * 2 - 1;
    }

    public void push(int stackNum, int value) {
        if (stackNum > 2) return;
        if (stackNum == 0 && one != size - 1) nums[++one] = value;
        else if (stackNum == 1 && two != size * 2 - 1) nums[++two] = value;
        else if (stackNum == 2 && three != size * 3 - 1) nums[++three] = value;
    }

    public int pop(int stackNum) {
        if (stackNum > 2) return -1;
        if (stackNum == 0 && one != -1) return nums[one--];
        else if (stackNum == 1 && two != size - 1) return nums[two--];
        else if (stackNum == 2 && three != size * 2 - 1) return nums[three--];
        return -1;
    }

    public int peek(int stackNum) {
        if (stackNum > 2) return -1;
        if (stackNum == 0 && one != -1) return nums[one];
        else if (stackNum == 1 && two != size - 1) return nums[two];
        else if (stackNum == 2 && three != size * 2 - 1) return nums[three];
        return -1;
    }

    public boolean isEmpty(int stackNum) {
        if (stackNum > 2) return false;
        if (stackNum == 0) return one == -1;
        else if (stackNum == 1) return two == size - 1;
        return three == size * 2 - 1;
    }

}

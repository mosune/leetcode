package leetcode.easy;

import java.util.PriorityQueue;

/**
 * 703. 数据流中的第K大元素
 *
 * 设计一个找到数据流中第K大元素的类（class）。注意是排序后的第K大元素，不是第K个不同的元素。
 *
 * 你的 KthLargest 类需要一个同时接收整数 k 和整数数组nums 的构造器，它包含数据流中的初始元素。每次调用 KthLargest.add，返回当前数据流中第K大的元素。
 *
 * 示例:
 *
 * int k = 3;
 * int[] arr = [4,5,8,2];
 * KthLargest kthLargest = new KthLargest(3, arr);
 * kthLargest.add(3);   // returns 4
 * kthLargest.add(5);   // returns 5
 * kthLargest.add(10);  // returns 5
 * kthLargest.add(9);   // returns 8
 * kthLargest.add(4);   // returns 8
 * 说明:
 * 你可以假设 nums 的长度≥ k-1 且k ≥ 1。
 *
 * @author gcg
 * @create 2019-11-14 13:40
 **/
public class SevenHundredThree {

    /**
     * 借助优先队列
     *
     */
//    PriorityQueue<Integer> queue;
//
//    int k;
//
//    public SevenHundredThree(int k, int[] nums) {
//        queue = new PriorityQueue(k);
//        for (int i : nums) {
//            if (queue.size() < k) queue.offer(i);
//            else {
//                if (queue.peek() < i) {
//                    queue.poll();
//                    queue.offer(i);
//                }
//            }
//        }
//        this.k = k;
//    }
//
//    public int add(int val) {
//        if (queue.size() < k) queue.offer(val);
//        else {
//            if (queue.peek() < val) {
//                queue.poll();
//                queue.offer(val);
//            }
//        }
//        return queue.peek();
//    }

    /**
     * 自制小堆顶
     */
    private int[] data;

    private int index;

    private int k;

    public SevenHundredThree(int k, int[] nums) {
        data = new int[k];
        for (int i : nums) {
            if (index < k) addNum(i);
            else {
                if (i > data[0]) {
                    removeHead();
                    addNum(i);
                }
            }
        }
        this.k = k;
    }

    public int add(int val) {
        if (index < k) addNum(val);
        else {
            if (val > data[0]) {
                removeHead();
                addNum(val);
            }
        }
        return data[0];
    }

    private void addNum(int num) {
        data[index] = num;
        int t = index;
        while (true) {
            int father = (t - 1) / 2;
            if (data[father] > data[t]) {
                swap(father, t);
                t = father;
            } else break;
        }
        index++;
    }

    private void removeHead() {
        data[0] = data[data.length - 1];
        int t = 0;
        while (true) {
            int before = t;
            int left = t * 2 + 1;
            int right = t * 2 + 2;
            if (left < data.length && data[left] < data[t]) {
                t = left;
            }
            if (right < data.length && data[right] < data[t]) {
                t = right;
            }
            if (t == before) break;
            swap(t, before);
        }
        index--;
    }

    private void swap(int i, int j) {
        int num = data[i];
        data[i] = data[j];
        data[j] = num;
    }

}

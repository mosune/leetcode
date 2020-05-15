package leetcode.easy;

/**
 * 面试题11. 旋转数组的最小数字
 *
 * 把一个数组最开始的若干个元素搬到数组的末尾，我们称之为数组的旋转。输入一个递增排序的数组的一个旋转，输出旋转数组的最小元素。例如，数组 [3,4,5,1,2] 为 [1,2,3,4,5] 的一个旋转，该数组的最小值为1。  
 *
 * 示例 1：
 *
 * 输入：[3,4,5,1,2]
 * 输出：1
 * 示例 2：
 *
 * 输入：[2,2,2,0,1]
 * 输出：0
 * 注意：本题与主站 154 题相同：https://leetcode-cn.com/problems/find-minimum-in-rotated-sorted-array-ii/
 *
 * @author gcg
 * @create 2020-05-15 11:17
 **/
public class InterviewEleven {

//    public int minArray(int[] numbers) {
//        int index = findNum(numbers, 0, numbers.length - 1);
//        return index == -1 ? numbers[0] : numbers[index];
//    }
//
//    private int findNum(int[] numbers, int start, int last) {
//        if (start > last) return -1;
//        int middle = start + (last - start) / 2;
//        if (middle - 1 >= 0 && numbers[middle] < numbers[middle - 1]) return middle;
//        int left = findNum(numbers, middle + 1, last);
//        if (left != -1) return left;
//        int right = findNum(numbers, start, middle - 1);
//        if (right != -1) return right;
//        return -1;
//    }

    public int minArray(int[] numbers) {
        int start = 0, end = numbers.length - 1;

        while (start <= end) {
            int middle = (end + start) / 2;
            // 如果小于说明在左边
            if (numbers[middle] < numbers[end]) end = middle;
            // 大于说明在右边
            else if (numbers[middle] > numbers[end]) start = middle;
            // 如果相等就舍弃一个末尾值
            else end--;
        }

        return numbers[start];
    }

}

package leetcode.easy;

import java.util.HashMap;
import java.util.Map;

/**
 * 167. 两数之和 II - 输入有序数组
 *
 * 给定一个已按照升序排列 的有序数组，找到两个数使得它们相加之和等于目标数。
 *
 * 函数应该返回这两个下标值 index1 和 index2，其中 index1 必须小于 index2。
 *
 * 说明:
 *
 * 返回的下标值（index1 和 index2）不是从零开始的。
 * 你可以假设每个输入只对应唯一的答案，而且你不可以重复使用相同的元素。
 * 示例:
 *
 * 输入: numbers = [2, 7, 11, 15], target = 9
 * 输出: [1,2]
 * 解释: 2 与 7 之和等于目标数 9 。因此 index1 = 1, index2 = 2 。
 *
 * @author gcg
 * @create 2019-06-10 17:21
 **/
public class OneHundredSixtySeven {

    public int[] twoSum(int[] numbers, int target) {
        // 暴力破解
//        int half = numbers.length;
//
//        int end = numbers.length - 1;
//
//        for (int i = end; i > 0; i--) {
//            int num = numbers[i];
//            for (int j = i - 1; j >= 0; j--) {
//                if (numbers[j] + num == target) {
//                    result[0] = j + 1;
//                    result[1] = i + 1;
//                    return result;
//                } else if (numbers[j] + num < target) {
//                    break;
//                }
//            }
//        }

        // Hash表解法
//        int[] result = new int[2];
//        Map<Integer, Integer> map = new HashMap();
//        for (int i = 0; i < numbers.length; i++) {
//            Integer num = map.get(target - numbers[i]);
//            if (num != null) {
//                result[0] = num;
//                result[1] = i + 1;
//                return result;
//            }
//            map.put(numbers[i], i + 1);
//        }

        // 双指针
        int[] result = new int[2];
        int i = 0, j = numbers.length - 1;
        while (i < j) {
            if (numbers[i] + numbers[j] == target) {
                result[0] = i + 1;
                result[1] = j + 1;
                return result;
            }
            if (target - numbers[i] > numbers[j]) i++;
            else j--;
        }

        return result;
    }

}

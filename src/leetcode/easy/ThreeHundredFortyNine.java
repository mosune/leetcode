package leetcode.easy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 349. 两个数组的交集
 *
 * 给定两个数组，编写一个函数来计算它们的交集。
 *
 * 示例 1:
 *
 * 输入: nums1 = [1,2,2,1], nums2 = [2,2]
 * 输出: [2]
 * 示例 2:
 *
 * 输入: nums1 = [4,9,5], nums2 = [9,4,9,8,4]
 * 输出: [9,4]
 * 说明:
 *
 * 输出结果中的每个元素一定是唯一的。
 * 我们可以不考虑输出结果的顺序。
 *
 * @author gcg
 * @create 2019-07-16 10:10
 **/
public class ThreeHundredFortyNine {

    // 排序加双指针
    public int[] intersection(int[] nums1, int[] nums2) {
        Arrays.sort(nums1);
        Arrays.sort(nums2);
        int i = 0, j = 0;
        int index = nums1[i];
        List<Integer> list = new ArrayList<>();

        while (i != nums1.length) {
            if (index > nums2[j]) {
                j++;
                continue;
            }
            if (index == nums2[j]) list.add(index);
            while (i != nums1.length) {
                if (index != nums1[i]) {
                    index = nums1[i];
                    break;
                }
                i++;
            }
        }
        int[] result = new int[list.size()];
        for (int k = 0; k < result.length; k++) result[k] = list.get(k);

        return result;
    }

}

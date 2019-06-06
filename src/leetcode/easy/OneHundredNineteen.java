package leetcode.easy;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 给定一个非负索引 k，其中 k ≤ 33，返回杨辉三角的第 k 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 3
 * 输出: [1,3,3,1]
 * 进阶：
 *
 * 你可以优化你的算法到 O(k) 空间复杂度吗？
 *
 * @author gcg
 * @create 2019-06-05 16:25
 **/
public class OneHundredNineteen {

    public List<Integer> getRow(int rowIndex) {
        Integer[] nums = new Integer[rowIndex + 1];
        nums[0] = 1;
        for (int i = 1; i < nums.length; i++) {
            nums[i] = 1;
            int pre = 1;
            for (int j = 1; j < i; j++) {
                int index = nums[j];
                nums[j] += pre;
                pre = index;
            }
        }
        return new ArrayList<>(Arrays.asList(nums));
    }

}

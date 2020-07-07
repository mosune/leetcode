package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * 46. 全排列
 *
 * 给定一个 没有重复 数字的序列，返回其所有可能的全排列。
 *
 * 示例:
 *
 * 输入: [1,2,3]
 * 输出:
 * [
 *   [1,2,3],
 *   [1,3,2],
 *   [2,1,3],
 *   [2,3,1],
 *   [3,1,2],
 *   [3,2,1]
 * ]
 *
 * @author gcg
 * @create 2020-07-06 16:18
 **/
public class FortySix {

    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permute(int[] nums) {
        addNum(nums, new ArrayList<>(), 0);
        return results;
    }

    private void addNum(int[] nums, List<Integer> list, int index) {
        if (index >= nums.length) results.add(new ArrayList<>(list));
        else {
            for (int i = index; i < nums.length; i++) {
                list.add(nums[i]);
                int[] arrays = Arrays.copyOf(nums, nums.length);
                int num = arrays[i];
                arrays[i] = arrays[index];
                arrays[index] = num;
                addNum(arrays, list, index + 1);
                list.remove(list.size() - 1);
            }
        }
    }

}

package leetcode.middle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

/**
 * 47. 全排列 II
 *
 * 给定一个可包含重复数字的序列，返回所有不重复的全排列。
 *
 * 示例:
 *
 * 输入: [1,1,2]
 * 输出:
 * [
 *   [1,1,2],
 *   [1,2,1],
 *   [2,1,1]
 * ]
 *
 * @author gcg
 * @create 2020-07-07 11:04
 **/
public class FortySeven {

    private List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> permuteUnique(int[] nums) {
        addNum(nums, new ArrayList<>(), 0);
        return results;
    }

    private void addNum(int[] nums, List<Integer> list, int index) {
        if (index >= nums.length) results.add(new ArrayList<>(list));
        else {
            Set<Integer> set = new HashSet<>();
            for (int i = index; i < nums.length; i++) {
                if (set.contains(nums[i])) continue;
                list.add(nums[i]);
                int[] arrays = Arrays.copyOf(nums, nums.length);
                int num = arrays[i];
                arrays[i] = arrays[index];
                arrays[index] = num;
                addNum(arrays, list, index + 1);
                list.remove(list.size() - 1);
                set.add(nums[i]);
            }
        }
    }

}

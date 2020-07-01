package leetcode.middle;

import java.util.ArrayList;
import java.util.List;

/**
 * 39. 组合总和
 *
 * 给定一个无重复元素的数组 candidates 和一个目标数 target ，找出 candidates 中所有可以使数字和为 target 的组合。
 *
 * candidates 中的数字可以无限制重复被选取。
 *
 * 说明：
 *
 * 所有数字（包括 target）都是正整数。
 * 解集不能包含重复的组合。 
 * 示例 1:
 *
 * 输入: candidates = [2,3,6,7], target = 7,
 * 所求解集为:
 * [
 *   [7],
 *   [2,2,3]
 * ]
 * 示例 2:
 *
 * 输入: candidates = [2,3,5], target = 8,
 * 所求解集为:
 * [
 *   [2,2,2,2],
 *   [2,3,3],
 *   [3,5]
 * ]
 *
 * @author gcg
 * @create 2020-07-01 14:04
 **/
public class ThirtyNine {

    List<List<Integer>> results = new ArrayList<>();

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        com(candidates, new ArrayList<>(), target, 0);
        return results;
    }

    private void com(int[] candidates, List<Integer> list, int target, int index) {
        if (target == 0) results.add(new ArrayList<>(list));
        else if (target > 0) {
            for (int i = index; i < candidates.length; i++) {
                list.add(candidates[i]);
                com(candidates, list, target - candidates[i], i);
                list.remove(list.size() - 1);
            }
        }
    }

}

package leetcode;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 *
 * 给定一个非负整数 numRows，生成杨辉三角的前 numRows 行。
 *
 * 在杨辉三角中，每个数是它左上方和右上方的数的和。
 *
 * 示例:
 *
 * 输入: 5
 * 输出:
 * [
 *      [1],
 *     [1,1],
 *    [1,2,1],
 *   [1,3,3,1],
 *  [1,4,6,4,1]
 * ]
 *
 * @author gcg
 * @create 2019-06-05 10:41
 **/
public class OneHundredEighteen {

    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> lists = new ArrayList<>(numRows * 2);
        for (int i = 1; i <= numRows; i++) {
            Integer[] arrays = new Integer[i];
            arrays[0] = 1;
            arrays[i - 1] = 1;
            if (i > 2) {
                List<Integer> list = lists.get(i - 2);
                for (int j = 1; j < i - 1; j++) {
                    arrays[j] = list.get(j) + list.get(j - 1);
                }
            }
            lists.add(Arrays.asList(arrays));
        }
        return lists;
    }

}

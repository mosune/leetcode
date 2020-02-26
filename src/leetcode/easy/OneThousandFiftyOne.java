package leetcode.easy;

import com.sun.org.apache.bcel.internal.generic.NEW;

import java.util.Arrays;

/**
 * 1051. 高度检查器
 *
 * 学校在拍年度纪念照时，一般要求学生按照 非递减 的高度顺序排列。
 *
 * 请你返回能让所有学生以 非递减 高度排列的最小必要移动人数。
 *
 *  
 *
 * 示例：
 *
 * 输入：heights = [1,1,4,2,1,3]
 * 输出：3
 *  
 *
 * 提示：
 *
 * 1 <= heights.length <= 100
 * 1 <= heights[i] <= 100
 *
 * @author gcg
 * @create 2020-02-26 10:07
 **/
public class OneThousandFiftyOne {

    public int heightChecker(int[] heights) {
        int[] newArray = heights.clone();
        Arrays.sort(newArray);

        int sum = 0;
        for (int i = 0; i < heights.length; i++) {
            if (newArray[i] != heights[i]) sum++;
        }

        return sum;
    }

}

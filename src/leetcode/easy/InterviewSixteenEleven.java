package leetcode.easy;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Set;

/**
 * 面试题 16.11. 跳水板
 *
 * 你正在使用一堆木板建造跳水板。有两种类型的木板，其中长度较短的木板长度为shorter，长度较长的木板长度为longer。你必须正好使用k块木板。编写一个方法，生成跳水板所有可能的长度。
 *
 * 返回的长度需要从小到大排列。
 *
 * 示例：
 *
 * 输入：
 * shorter = 1
 * longer = 2
 * k = 3
 * 输出： {3,4,5,6}
 * 提示：
 *
 * 0 < shorter <= longer
 * 0 <= k <= 100000
 *
 * @author gcg
 * @create 2020-05-07 12:57
 **/
public class InterviewSixteenEleven {

//    List<Integer> list = new ArrayList();
//
//    Set<Integer> set = new HashSet();
//
//    public int[] divingBoard(int shorter, int longer, int k) {
//        if (k == 0) return new int[0];
//        addNum(shorter, longer, k, k);
//        Collections.sort(list);
//        int[] result = new int[list.size()];
//        for (int i = 0; i < result.length; i++) result[i] = list.get(i);
//        return result;
//    }
//
//    private void addNum(int shorter, int longer, int k, int n) {
//        if (n == -1) return;
//        int num = shorter * n + longer * (k - n);
//        if (!set.contains(num)) {
//            list.add(num);
//            set.add(num);
//        }
//        addNum(shorter, longer, k, n - 1);
//    }

    public int[] divingBoard(int shorter, int longer, int k) {
        if (k == 0) return new int[0];
        if (shorter == longer) {
            return new int[]{k * shorter};
        }

        int[] results = new int[k + 1];
        for (int i = 0; i < k + 1; i++) {
            results[i] = shorter * (k - i) + longer * i;
        }
        return results;
    }

}

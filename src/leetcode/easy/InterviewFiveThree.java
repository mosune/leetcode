package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题 05.03. 翻转数位
 *
 * 给定一个32位整数 num，你可以将一个数位从0变为1。请编写一个程序，找出你能够获得的最长的一串1的长度。
 *
 * 示例 1：
 *
 * 输入: num = 1775(110111011112)
 * 输出: 8
 * 示例 2：
 *
 * 输入: num = 7(01112)
 * 输出: 4
 *
 * @author gcg
 * @create 2020-04-29 10:15
 **/
public class InterviewFiveThree {

    public int reverseBits(int num) {
        List<Integer> list = new ArrayList<>();

        int sum = 0;
        while (num != 0) {
            if ((num & 1) == 1) sum++;
            else {
                list.add(sum);
                sum = 0;
            }
            num >>= 1;
        }
        list.add(sum);

        int max = list.get(0) + 1;
        for (int i = 0; i < list.size() - 1; i++) {
            max = Math.max(list.get(i) + list.get(i + 1) + 1, max);
        }

        return max;
    }

}

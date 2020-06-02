package leetcode.easy;

/**
 * 面试题61. 扑克牌中的顺子
 *
 * 从扑克牌中随机抽5张牌，判断是不是一个顺子，即这5张牌是不是连续的。2～10为数字本身，A为1，J为11，Q为12，K为13，而大、小王为 0 ，可以看成任意数字。A 不能视为 14。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: [1,2,3,4,5]
 * 输出: True
 *  
 *
 * 示例 2:
 *
 * 输入: [0,0,1,2,5]
 * 输出: True
 *  
 *
 * 限制：
 *
 * 数组长度为 5 
 *
 * 数组的数取值为 [0, 13] .
 *
 * @author gcg
 * @create 2020-06-02 14:03
 **/
public class InterviewSixtyOne {

    public boolean isStraight(int[] nums) {
        int[] set = new int[14];
        int max = Integer.MIN_VALUE, min = Integer.MAX_VALUE;

        for (int i : nums) {
            max = Math.max(max, i);
            if (i != 0) min = Math.min(min, i);
            set[i]++;
            if (set[i] > 1 && i != 0) return false;
        }

        return max - min < 5;
    }

}

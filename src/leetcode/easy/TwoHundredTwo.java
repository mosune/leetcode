package leetcode.easy;

import java.util.HashSet;
import java.util.Set;

/**
 * 202. 快乐数
 *
 * 编写一个算法来判断一个数是不是“快乐数”。
 *
 * 一个“快乐数”定义为：对于一个正整数，每一次将该数替换为它每个位置上的数字的平方和，然后重复这个过程直到这个数变为 1，也可能是无限循环但始终变不到 1。如果可以变为 1，那么这个数就是快乐数。
 *
 * 示例: 
 *
 * 输入: 19
 * 输出: true
 * 解释:
 * 12 + 92 = 82
 * 82 + 22 = 68
 * 62 + 82 = 100
 * 12 + 02 + 02 = 1
 *
 * @author gcg
 * @create 2019-06-17 09:53
 **/
public class TwoHundredTwo {

    public boolean isHappy(int n) {
        // 存储已经执行过的数，还有一种解法是所有的不快乐数会陷入4-16-37-58-89-145-42-20-4这个循环，可以提前加入set中进行规避
        Set<Integer> set = new HashSet<>();
        while (true) {
            int num = 0;
            while (n != 0) {
                int m = (int) Math.pow(n % 10, 2);
                num += m;
                n /= 10;
            }
            if (num == 1) return true;
            else {
                if (set.contains(num)) return false;
                n = num;
                set.add(num);
            }
        }
    }

}

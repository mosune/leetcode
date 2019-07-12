package leetcode.easy;

/**
 * 342. 4的幂
 *
 * 给定一个整数 (32 位有符号整数)，请编写一个函数来判断它是否是 4 的幂次方。
 *
 * 示例 1:
 *
 * 输入: 16
 * 输出: true
 * 示例 2:
 *
 * 输入: 5
 * 输出: false
 * 进阶：
 * 你能不使用循环或者递归来完成本题吗？
 *
 * @author gcg
 * @create 2019-07-12 10:30
 **/
public class ThreeHundredFortyTwo {

    // 常规循环操作
//    public boolean isPowerOfFour(int num) {
//        if (num <= 0) return false;
//        while (num != 1) {
//            if (num % 4 != 0) return false;
//            num /= 4;
//        }
//        return true;
//    }

    // 位运算
    public boolean isPowerOfFour(int num) {
        if (num <= 0) return false;
        // 判断是不是第一位是1，后面都是0
        int result = num & (num - 1);
        if (result != 0) return false;
        // 判断0是不是在奇数位
        result = 0xaaaaaaaa & num;
        if (result != 0) return false;
        return true;
    }

}

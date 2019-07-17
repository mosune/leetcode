package leetcode.easy;

/**
 * 374. 猜数字大小
 *
 * 我们正在玩一个猜数字游戏。 游戏规则如下：
 * 我从 1 到 n 选择一个数字。 你需要猜我选择了哪个数字。
 * 每次你猜错了，我会告诉你这个数字是大了还是小了。
 * 你调用一个预先定义好的接口 guess(int num)，它会返回 3 个可能的结果（-1，1 或 0）：
 *
 * -1 : 我的数字比较小
 *  1 : 我的数字比较大
 *  0 : 恭喜！你猜对了！
 * 示例 :
 *
 * 输入: n = 10, pick = 6
 * 输出: 6
 *
 * @author gcg
 * @create 2019-07-17 11:41
 **/
public class ThreeHundredSeventyFour extends GuessGame {

    // 二分法
    public int guessNumber(int n) {
        int start = 0, end = n, middle = n / 2, result;
        while (true) {
            result = guess(middle);
            if (result == 0) {
                return middle;
            } else if (result == -1) {
                end = middle - 1;
            } else {
                start = middle + 1;
            }
            middle = (end - start) / 2 + start;
        }
    }

}

class GuessGame {

    int guess(int num) {
        return -1;
    }

}

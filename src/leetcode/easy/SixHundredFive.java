package leetcode.easy;

/**
 * 605. 种花问题
 *
 * 假设你有一个很长的花坛，一部分地块种植了花，另一部分却没有。可是，花卉不能种植在相邻的地块上，它们会争夺水源，两者都会死去。
 *
 * 给定一个花坛（表示为一个数组包含0和1，其中0表示没种植花，1表示种植了花），和一个数 n 。能否在不打破种植规则的情况下种入 n 朵花？能则返回True，不能则返回False。
 *
 * 示例 1:
 *
 * 输入: flowerbed = [1,0,0,0,1], n = 1
 * 输出: True
 * 示例 2:
 *
 * 输入: flowerbed = [1,0,0,0,1], n = 2
 * 输出: False
 * 注意:
 *
 * 数组内已种好的花不会违反种植规则。
 * 输入的数组长度范围为 [1, 20000]。
 * n 是非负整数，且不会超过输入数组的大小。
 *
 * @author gcg
 * @create 2019-10-21 18:47
 **/
public class SixHundredFive {

    /**
     * 强行解题
     * @param flowerbed
     * @param n
     * @return
     */
//    public boolean canPlaceFlowers(int[] flowerbed, int n) {
//        if (n == 0) return true;
//        if (flowerbed.length == 1) {
//            if (flowerbed[0] == 0 && n == 1) return true;
//            else return false;
//        }
//        int index = 0;
//        while (index < flowerbed.length) {
//            if (n == 0) return true;
//            if (flowerbed[index] == 1) {
//                index += 2;
//            } else {
//                if ((index == 0 && flowerbed[index + 1] == 0) || (index == flowerbed.length - 1 && flowerbed[index - 1] == 0) || (flowerbed[index + 1] == 0 && flowerbed[index - 1] == 0)) {
//                    flowerbed[index] = 1;
//                    index += 2;
//                    n--;
//                } else {
//                    index++;
//                }
//            }
//        }
//        return n <= 0;
//    }

    /**
     * 前后设置哨兵节点方法
     * @param flowerbed
     * @param n
     * @return
     */
    public boolean canPlaceFlowers(int[] flowerbed, int n) {
        int[] data = new int[flowerbed.length + 2];
        data[0] = 0;
        data[data.length - 1] = 0;
        for (int i = 0; i < flowerbed.length; i++) data[i + 1] = flowerbed[i];

        for (int i = 1; i < data.length - 1; i++) {
            if (n == 0) return true;
            if (data[i] == 0 && data[i - 1] == 0 && data[i + 1] == 0) {
                n--;
                data[i] = 1;
                i++;
            }
        }

        return n <= 0;
    }

}

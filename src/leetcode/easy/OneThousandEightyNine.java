package leetcode.easy;

import java.util.ArrayList;
import java.util.List;

/**
 * 1089. 复写零
 *
 * 给你一个长度固定的整数数组 arr，请你将该数组中出现的每个零都复写一遍，并将其余的元素向右平移。
 *
 * 注意：请不要在超过该数组长度的位置写入元素。
 *
 * 要求：请对输入的数组 就地 进行上述修改，不要从函数返回任何东西。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：[1,0,2,3,0,4,5,0]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,0,0,2,3,0,0,4]
 * 示例 2：
 *
 * 输入：[1,2,3]
 * 输出：null
 * 解释：调用函数后，输入的数组将被修改为：[1,2,3]
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10000
 * 0 <= arr[i] <= 9
 *
 * @author gcg
 * @create 2020-03-11 11:29
 **/
public class OneThousandEightyNine {

//    public void duplicateZeros(int[] arr) {
//        List<Integer> list = new ArrayList<>(arr.length);
//        for (int i : arr) {
//            list.add(i);
//            if (i == 0) list.add(0);
//        }
//        for (int i = 0; i < arr.length; i++) arr[i] = list.get(i);
//    }

    public void duplicateZeros(int[] arr) {
        int num = 0;
        int length = arr.length - 1;
        for (int i = 0; i <= length - num; i++) {
            if (arr[i] == 0) {
                // 处理边界0的问题，最后一个数字设置为0
                if (i == length - num) {
                    arr[length--] = 0;
                    break;
                }
                num++;
            }
        }

        for (int i = length - num; i >= 0; i--) {
            arr[i + num] = arr[i];
            if (arr[i] == 0) {
                num--;
                arr[i + num] = 0;
            }
        }
    }

}

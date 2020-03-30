package leetcode.easy;

/**
 * 1299. 将每个元素替换为右侧最大元素
 *
 * 给你一个数组 arr ，请你将每个元素用它右边最大的元素替换，如果是最后一个元素，用 -1 替换。
 *
 * 完成所有替换操作后，请你返回这个数组。
 *
 *  
 *
 * 示例：
 *
 * 输入：arr = [17,18,5,4,6,1]
 * 输出：[18,6,6,6,1,-1]
 *  
 *
 * 提示：
 *
 * 1 <= arr.length <= 10^4
 * 1 <= arr[i] <= 10^5
 *
 * @author gcg
 * @create 2020-03-30 11:33
 **/
public class OneThousandTwoHundredNinetyNine {

//    public int[] replaceElements(int[] arr) {
//        int max = arr[0], index = 0;
//
//        for (int i = 0; i < arr.length - 1; i++) {
//            if (i == index) {
//                max = arr[i + 1];
//                index = i + 1;
//                for (int j = i + 2; j < arr.length; j++) {
//                    if (max < arr[j]) {
//                        max = arr[j];
//                        index = j;
//                    }
//                }
//            }
//            arr[i] = max;
//        }
//        arr[arr.length - 1] = -1;
//
//        return arr;
//    }

    /**
     * 倒序递推结果
     * @param arr
     * @return
     */
    public int[] replaceElements(int[] arr) {
        int max = arr[arr.length - 1], num;

        arr[arr.length - 1] = -1;
        for (int i = arr.length - 2; i >= 0; i--) {
            num = arr[i];
            arr[i] = max;
            max = Math.max(max, num);
        }
        return arr;
    }

}

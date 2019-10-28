package leetcode.easy;

/**
 * 645. 错误的集合
 *
 * 集合 S 包含从1到 n 的整数。不幸的是，因为数据错误，导致集合里面某一个元素复制了成了集合里面的另外一个元素的值，导致集合丢失了一个整数并且有一个元素重复。
 *
 * 给定一个数组 nums 代表了集合 S 发生错误后的结果。你的任务是首先寻找到重复出现的整数，再找到丢失的整数，将它们以数组的形式返回。
 *
 * 示例 1:
 *
 * 输入: nums = [1,2,2,4]
 * 输出: [2,3]
 * 注意:
 *
 * 给定数组的长度范围是 [2, 10000]。
 * 给定的数组是无序的。
 *
 * @author gcg
 * @create 2019-10-28 11:07
 **/
public class SixHundredFortyFive {

    /**
     * 哈希表解决
     * @param nums
     * @return
     */
//    public int[] findErrorNums(int[] nums) {
//        int[] results = new int[nums.length + 1];
//        int[] data = new int[2];
//
//        for (int i = 0; i < nums.length; i++) {
//            if (results[nums[i]] == 1) data[0] = nums[i];
//            else results[nums[i]]++;
//        }
//
//        for (int i = 1; i < results.length; i++) {
//            if (results[i] == 0) {
//                data[1] = i;
//                break;
//            }
//        }
//
//        return data;
//    }

    /**
     * 不使用额外空间，使用正负号解决
     * @param nums
     * @return
     */
    public int[] findErrorNums(int[] nums) {
        int[] data = new int[2];
        int sum = 0, num;
        for (int i = 0; i < nums.length; i++) {
            num = Math.abs(nums[i]);
            if (nums[num - 1] > 0) nums[num - 1] *= -1;
            else data[0] = nums[i];
            sum += i + 1 - num;
        }
        data[1] = sum;

        return data;
    }

}

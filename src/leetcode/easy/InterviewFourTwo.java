package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.Arrays;

/**
 * 面试题 04.02. 最小高度树
 *
 * 给定一个有序整数数组，元素各不相同且按升序排列，编写一个算法，创建一棵高度最小的二叉搜索树。
 *
 * 示例:
 * 给定有序数组: [-10,-3,0,5,9],
 *
 * 一个可能的答案是：[0,-3,9,-10,null,5]，它可以表示下面这个高度平衡二叉搜索树：
 *
 *           0
 *          / \
 *        -3   9
 *        /   /
 *      -10  5
 *
 * @author gcg
 * @create 2020-04-28 10:31
 **/
public class InterviewFourTwo {

//    public TreeNode sortedArrayToBST(int[] nums) {
//        if (nums.length == 0) return null;
//        TreeNode node = new TreeNode(nums[nums.length / 2]);
//        addNode(nums, 0, nums.length / 2 - 1, true, node);
//        addNode(nums, nums.length / 2 + 1, nums.length - 1, false, node);
//        return node;
//    }
//
//    private void addNode(int[] nums, int left, int right, boolean isLeft, TreeNode node) {
//        if (left > right) return;
//        int mid = left + (right - left) / 2;
//        TreeNode newNode = new TreeNode(nums[mid]);
//        if (isLeft) node.left = newNode;
//        else node.right = newNode;
//        addNode(nums, left, mid - 1, true, newNode);
//        addNode(nums, mid + 1, right, false, newNode);
//    }

    public TreeNode sortedArrayToBST(int[] nums) {
        if (nums.length == 0) return null;
        TreeNode node = new TreeNode(nums[nums.length / 2]);
        node.left = sortedArrayToBST(Arrays.copyOfRange(nums, 0, nums.length / 2));
        node.right = sortedArrayToBST(Arrays.copyOfRange(nums, nums.length / 2 + 1, nums.length));
        return node;
    }

}

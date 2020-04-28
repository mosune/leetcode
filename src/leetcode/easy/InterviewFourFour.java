package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 面试题 04.04. 检查平衡性
 *
 * 实现一个函数，检查二叉树是否平衡。在这个问题中，平衡树的定义如下：任意一个节点，其两棵子树的高度差不超过 1。
 *
 *
 * 示例 1:
 * 给定二叉树 [3,9,20,null,null,15,7]
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 * 示例 2:
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *       1
 *      / \
 *     2   2
 *    / \
 *   3   3
 *  / \
 * 4   4
 * 返回 false 。
 *
 * @author gcg
 * @create 2020-04-28 11:27
 **/
public class InterviewFourFour {

    public boolean isBalanced(TreeNode root) {
        return checkHeight(root) == -1;
    }

    /**
     * 自下而上递归
     * @param node
     * @return
     */
    private int checkHeight(TreeNode node) {
        if (node == null) return 0;
        int left = checkHeight(node.left);
        if (left == -1) return -1;
        int right = checkHeight(node.right);
        if (right == -1) return -1;
        return Math.abs(left - right) < 2 ? Math.max(left, right) + 1 : -1;
    }

}

package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 面试题55 - II. 平衡二叉树
 *
 * 输入一棵二叉树的根节点，判断该树是不是平衡二叉树。如果某二叉树中任意节点的左右子树的深度相差不超过1，那么它就是一棵平衡二叉树。
 *
 *  
 *
 * 示例 1:
 *
 * 给定二叉树 [3,9,20,null,null,15,7]
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回 true 。
 *
 * 示例 2:
 *
 * 给定二叉树 [1,2,2,3,3,null,null,4,4]
 *
 *        1
 *       / \
 *      2   2
 *     / \
 *    3   3
 *   / \
 *  4   4
 * 返回 false 。
 *
 *  
 *
 * 限制：
 *
 * 1 <= 树的结点个数 <= 10000
 * 注意：本题与主站 110 题相同：https://leetcode-cn.com/problems/balanced-binary-tree/
 *
 * @author gcg
 * @create 2020-05-29 10:00
 **/
public class InterviewFiftyFiveII {

    public boolean isBalanced(TreeNode root) {
        return getDepth(root) != -1;
    }

    /**
     * 自下而上进行递归，-1结果用来剪枝
     * @param node
     * @return
     */
    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        int left = getDepth(node.left);
        if (left == -1) return -1;
        int right = getDepth(node.right);
        if (right == -1) return -1;
        return Math.abs(left - right) > 1 ? -1 : Math.max(left, right) + 1;
    }

}

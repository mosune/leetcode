package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 给定一个二叉树，判断它是否是高度平衡的二叉树。
 *
 * 本题中，一棵高度平衡二叉树定义为：
 *
 * 一个二叉树每个节点 的左右两个子树的高度差的绝对值不超过1。
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
 * 返回 false 。
 *
 * @author gcg
 * @create 2019-06-03 12:24
 **/
public class OneHundredTen {

    public boolean isBalanced(TreeNode root) {
        Queue<TreeNode> queue = new LinkedList();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode treeNode = queue.poll();
            if (treeNode == null) continue;
            queue.offer(treeNode.left);
            queue.offer(treeNode.right);
            int left = getDepth(treeNode.left);
            int right = getDepth(treeNode.right);
            int s = left - right;
            if (s > 1 || s < -1) return false;
        }
        return true;
    }

    private int getDepth(TreeNode node) {
        if (node == null) return 0;
        int left = getDepth(node.left) + 1;
        int right = getDepth(node.right) + 1;
        return left > right ? left :right;
    }

}

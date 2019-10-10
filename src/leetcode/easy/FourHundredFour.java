package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.Map;
import java.util.Queue;

/**
 * 404. 左叶子之和
 *
 * 计算给定二叉树的所有左叶子之和。
 *
 * 示例：
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 *
 * 在这个二叉树中，有两个左叶子，分别是 9 和 15，所以返回 24
 *
 * @author gcg
 * @create 2019-07-22 17:23
 **/
public class FourHundredFour {

    // 循环
//    public int sumOfLeftLeaves(TreeNode root) {
//        if (root == null) return 0;
//        int sum = 0;
//        Queue<TreeNode> queue = new LinkedList<>();
//        Map<TreeNode, Boolean> map = new HashMap<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            if (root.left == null && root.right == null && map.get(node)) {
//                sum += node.val;
//                continue;
//            }
//            if (root.left != null) {
//                map.put(node.left, true);
//                queue.offer(node.left);
//            }
//            if (root.right != null) {
//                map.put(node.right, false);
//                queue.offer(node.right);
//            }
//        }
//
//
//        return sum;
//    }

    // 递归
    public int sumOfLeftLeaves(TreeNode root) {
        if (root == null) return 0;
        int sum = 0;
        if (root.left != null && root.left.left == null && root.left.right == null) {
            sum = root.left.val;
        }
        sum += sumOfLeftLeaves(root.left);
        sum += sumOfLeftLeaves(root.right);

        return sum;
    }

}

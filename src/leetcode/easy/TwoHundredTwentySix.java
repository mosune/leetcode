package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 226. 翻转二叉树
 *
 * 翻转一棵二叉树。
 *
 * 示例：
 *
 * 输入：
 *
 *      4
 *    /   \
 *   2     7
 *  / \   / \
 * 1   3 6   9
 * 输出：
 *
 *      4
 *    /   \
 *   7     2
 *  / \   / \
 * 9   6 3   1
 * 备注:
 * 这个问题是受到 Max Howell 的 原问题 启发的 ：
 *
 * 谷歌：我们90％的工程师使用您编写的软件(Homebrew)，但是您却无法在面试时在白板上写出翻转二叉树这道题，这太糟糕了。
 *
 * @author gcg
 * @create 2019-06-26 14:18
 **/
public class TwoHundredTwentySix {

    // 递归写法
    public TreeNode invertTree(TreeNode root) {
        if (root == null) return null;

        // 递归执行
        TreeNode left = invertTree(root.left);
        TreeNode right = invertTree(root.right);

        // 左右互换
        root.left = right;
        root.right = left;
        return root;
    }

    // 循环使用队列辅助
//    public TreeNode invertTree(TreeNode root) {
//        if (root == null) return null;
//        Queue<TreeNode> queue = new LinkedList<>();
//        queue.offer(root);
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            if (node == null) continue;
//            TreeNode n = node.left;
//            node.left = node.right;
//            node.right = n;
//            queue.offer(node.left);
//            queue.offer(node.right);
//        }
//
//        return root;
//    }

}

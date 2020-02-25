package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.Stack;

/**
 * 538. 把二叉搜索树转换为累加树
 *
 * 给定一个二叉搜索树（Binary Search Tree），把它转换成为累加树（Greater Tree)，使得每个节点的值是原来的节点值加上所有大于它的节点值之和。
 *
 * 例如：
 *
 * 输入: 二叉搜索树:
 *               5
 *             /   \
 *            2     13
 *
 * 输出: 转换为累加树:
 *              18
 *             /   \
 *           20     13
 *
 * @author gcg
 * @create 2019-09-20 15:33
 **/
public class FiveHundredThirtyEight {

      /**
       * 中序遍历，借助栈
       */
//    public TreeNode convertBST(TreeNode root) {
//        Stack<TreeNode> nodes = new Stack<>();
//        addNode(nodes, root);
//        TreeNode pre = null;
//        while (!nodes.isEmpty()) {
//            TreeNode node = nodes.pop();
//            if (pre != null) node.val += pre.val;
//            pre = node;
//        }
//        return root;
//    }
//
//    private void addNode(Stack<TreeNode> queue, TreeNode node) {
//        if (node == null) return;
//        addNode(queue, node.left);
//        queue.add(node);
//        addNode(queue, node.right);
//    }

    /**
     * 逆中序遍历
     */
    private TreeNode pre;

    public TreeNode convertBST(TreeNode root) {
        if (root == null) return root;
        convertBST(root.right);

        if (pre != null) root.val += pre.val;
        pre = root;

        convertBST(root.left);
        return root;
    }

}

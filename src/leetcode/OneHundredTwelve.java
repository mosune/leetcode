package leetcode;

import java.util.LinkedList;
import java.util.Queue;

/**
 *
 * 给定一个二叉树和一个目标和，判断该树中是否存在根节点到叶子节点的路径，这条路径上所有节点值相加等于目标和。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 * 给定如下二叉树，以及目标和 sum = 22，
 *
 *               5
 *              / \
 *             4   8
 *            /   / \
 *           11  13  4
 *          /  \      \
 *         7    2      1
 * 返回 true, 因为存在目标和为 22 的根节点到叶子节点的路径 5->4->11->2。
 *
 * @author gcg
 * @create 2019-06-04 16:42
 **/
public class OneHundredTwelve {

    public boolean hasPathSum(TreeNode root, int sum) {
        if (root == null) return false;
        Queue<Node> queue = new LinkedList();
        queue.offer(new Node(root, root.val));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (node.node.left == null && node.node.right == null) {
                if (node.sum == sum) return true;
                else continue;
            }
            if (node.node.left != null)
                queue.add(new Node(node.node.left, node.node.left.val + node.sum));
            if (node.node.right != null)
                queue.add(new Node(node.node.right, node.node.right.val + node.sum));
        }
        return false;
    }

}

class Node {

    TreeNode node;

    int sum;

    public Node(TreeNode treeNode, int sum) {
        this.node = treeNode;
        this.sum = sum;
    }

}

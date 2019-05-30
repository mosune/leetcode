package leetcode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 *
 * 给定一个二叉树，返回其节点值自底向上的层次遍历。 （即按从叶子节点所在层到根节点所在的层，逐层从左向右遍历）
 *
 * 例如：
 * 给定二叉树 [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其自底向上的层次遍历为：
 *
 * [
 *   [15,7],
 *   [9,20],
 *   [3]
 * ]
 *
 * @author gcg
 * @create 2019-05-30 18:44
 **/
public class OneHundredSeven {

    public List<List<Integer>> levelOrderBottom(TreeNode root) {
        List<List<Integer>> sum = new ArrayList<>();
        if (root == null) return sum;
        Queue<Node> queue = new LinkedList();
        queue.offer(new Node(0, root));
        while (!queue.isEmpty()) {
            Node node = queue.poll();
            if (sum.size() <= node.level || sum.get(node.level) == null) {
                sum.add(0, new ArrayList<>());
            }
            sum.get(0).add(node.treeNode.val);
            if (node.treeNode.left != null) queue.offer(new Node(node.level + 1, node.treeNode.left));
            if (node.treeNode.right != null) queue.offer(new Node(node.level + 1, node.treeNode.right));
        }
        return sum;
    }

}

class Node {

    int level;

    TreeNode treeNode;

    public Node(int level, TreeNode treeNode) {
        this.level = level;
        this.treeNode = treeNode;
    }

}

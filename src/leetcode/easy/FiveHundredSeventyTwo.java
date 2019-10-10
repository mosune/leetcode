package leetcode.easy;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 572. 另一个树的子树
 *
 * 给定两个非空二叉树 s 和 t，检验 s 中是否包含和 t 具有相同结构和节点值的子树。s 的一个子树包括 s 的一个节点和这个节点的所有子孙。s 也可以看做它自身的一棵子树。
 *
 * 示例 1:
 * 给定的树 s:
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 true，因为 t 与 s 的一个子树拥有相同的结构和节点值。
 *
 * 示例 2:
 * 给定的树 s：
 *
 *      3
 *     / \
 *    4   5
 *   / \
 *  1   2
 *     /
 *    0
 * 给定的树 t：
 *
 *    4
 *   / \
 *  1   2
 * 返回 false。
 *
 * @author gcg
 * @create 2019-10-10 10:19
 **/
public class FiveHundredSeventyTwo {

    public boolean isSubtree(TreeNode s, TreeNode t) {
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(s);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            if (node.val == t.val) {
                if (compareNode(node, t)) return true;
            }
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return false;
    }

    private boolean compareNode(TreeNode node, TreeNode t) {
        if (node == null || t == null) {
            if (node == null && t == null) return true;
            else return false;
        }
        return node.val == t.val && compareNode(node.left, t.left) && compareNode(node.right, t.right);
    }

}

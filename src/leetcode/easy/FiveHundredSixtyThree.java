package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.LinkedList;
import java.util.Queue;

/**
 * 563. 二叉树的坡度
 *
 * 给定一个二叉树，计算整个树的坡度。
 *
 * 一个树的节点的坡度定义即为，该节点左子树的结点之和和右子树结点之和的差的绝对值。空结点的的坡度是0。
 *
 * 整个树的坡度就是其所有节点的坡度之和。
 *
 * 示例:
 *
 * 输入:
 *          1
 *        /   \
 *       2     3
 * 输出: 1
 * 解释:
 * 结点的坡度 2 : 0
 * 结点的坡度 3 : 0
 * 结点的坡度 1 : |2-3| = 1
 * 树的坡度 : 0 + 0 + 1 = 1
 * 注意:
 *
 * 任何子树的结点的和不会超过32位整数的范围。
 * 坡度的值不会超过32位整数的范围。
 *
 * @author gcg
 * @create 2019-10-08 16:15
 **/
public class FiveHundredSixtyThree {

    public int findTilt(TreeNode root) {
        int num = 0;
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        while (!queue.isEmpty()) {
            TreeNode node = queue.poll();
            num += Math.abs(getNum(node.left) - getNum(node.right));
            if (node.left != null) queue.add(node.left);
            if (node.right != null) queue.add(node.right);
        }
        return num;
    }

    private int getNum(TreeNode node) {
        if (node == null) return 0;
        return node.val + getNum(node.left) + getNum(node.right);
    }

}

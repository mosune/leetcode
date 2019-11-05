package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 671. 二叉树中第二小的节点
 *
 * 给定一个非空特殊的二叉树，每个节点都是正数，并且每个节点的子节点数量只能为 2 或 0。如果一个节点有两个子节点的话，那么这个节点的值不大于它的子节点的值。 
 *
 * 给出这样的一个二叉树，你需要输出所有节点中的第二小的值。如果第二小的值不存在的话，输出 -1 。
 *
 * 示例 1:
 *
 * 输入:
 *     2
 *    / \
 *   2   5
 *      / \
 *     5   7
 *
 * 输出: 5
 * 说明: 最小的值是 2 ，第二小的值是 5 。
 * 示例 2:
 *
 * 输入:
 *     2
 *    / \
 *   2   2
 *
 * 输出: -1
 * 说明: 最小的值是 2, 但是不存在第二小的值。
 *
 * @author gcg
 * @create 2019-11-05 15:36
 **/
public class SixHundredSeventyOne {

    private Integer min = null;

    private Integer minSecond = null;

    public int findSecondMinimumValue(TreeNode root) {
        if (root == null) return -1;
        if (minSecond != null && root.val >= minSecond) return -1;
        if (min == null) min = root.val;
        else {
            if (min != root.val) minSecond = root.val;
        }
        findSecondMinimumValue(root.left);
        findSecondMinimumValue(root.right);

        return minSecond == null ? -1 : minSecond;
    }

}

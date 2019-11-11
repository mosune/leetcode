package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 687. 最长同值路径
 *
 * 给定一个二叉树，找到最长的路径，这个路径中的每个节点具有相同值。 这条路径可以经过也可以不经过根节点。
 *
 * 注意：两个节点之间的路径长度由它们之间的边数表示。
 *
 * 示例 1:
 *
 * 输入:
 *
 *               5
 *              / \
 *             4   5
 *            / \   \
 *           1   1   5
 * 输出:
 *
 * 2
 * 示例 2:
 *
 * 输入:
 *
 *               1
 *              / \
 *             4   5
 *            / \   \
 *           4   4   5
 * 输出:
 *
 * 2
 * 注意: 给定的二叉树不超过10000个结点。 树的高度不超过1000。
 *
 * @author gcg
 * @create 2019-11-11 13:46
 **/
public class SixHundredEightySeven {

    private int max;

    /**
     * 从上往下方法，速度较慢，最坏n2
     * @param root
     * @return
     */
//    public int longestUnivaluePath(TreeNode root) {
//        if (root == null) return 0;
//        max = Math.max(max, caculateLenght(root.left, root.val, 0) + caculateLenght(root.right, root.val, 0) + 1);
//        longestUnivaluePath(root.left);
//        longestUnivaluePath(root.right);
//        return max - 1;
//    }
//
//    private int caculateLenght(TreeNode node, int val, int length) {
//        if (node == null) return length;
//        if (node.val == val) {
//            length++;
//            return Math.max(caculateLenght(node.left, val, length), caculateLenght(node.right, val, length));
//        }
//        return length;
//    }

    public int longestUnivaluePath(TreeNode root) {
        caculateLenght(root);
        return max;
    }

    /**
     * 从下往上的方法，速度较快，最坏n
     * @param node
     * @return
     */
    private int caculateLenght(TreeNode node) {
        if (node == null) return 0;
        // 获取左树的最大路径
        int left = caculateLenght(node.left);
        // 获取右树的最大路径
        int right = caculateLenght(node.right);
        // 当前节点可获取的最大路径
        int nowLeft = 0, nowRight = 0;
        // 左边相等时相加获取路径
        if (node.left != null && node.left.val == node.val) {
            nowLeft += left + 1;
        }
        // 右边相等时相加获取路径
        if (node.right != null && node.right.val == node.val) {
            nowRight += right + 1;
        }
        // 左右路径相加是否为最大路径
        max = Math.max(max, nowLeft + nowRight);
        // 返回当前节点的最大路径
        return Math.max(nowLeft, nowRight);
    }

}

package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 669. 修剪二叉搜索树
 *
 * 给定一个二叉搜索树，同时给定最小边界L 和最大边界 R。通过修剪二叉搜索树，使得所有节点的值在[L, R]中 (R>=L) 。你可能需要改变树的根节点，所以结果应当返回修剪好的二叉搜索树的新的根节点。
 *
 * 示例 1:
 *
 * 输入:
 *     1
 *    / \
 *   0   2
 *
 *   L = 1
 *   R = 2
 *
 * 输出:
 *     1
 *       \
 *        2
 * 示例 2:
 *
 * 输入:
 *     3
 *    / \
 *   0   4
 *    \
 *     2
 *    /
 *   1
 *
 *   L = 1
 *   R = 3
 *
 * 输出:
 *       3
 *      /
 *    2
 *   /
 *  1
 *
 * @author gcg
 * @create 2019-11-05 10:24
 **/
public class SixHundredSixtyNine {

    /**
     * 复杂写法
     * @param root
     * @param L
     * @param R
     * @return
     */
//    public TreeNode trimBST(TreeNode root, int L, int R) {
//        if (root == null) return root;
//        root = removeNode(root, null, L, R);
//        return root;
//    }
//
//    private TreeNode removeNode(TreeNode root, TreeNode pre, int L, int R) {
//        if (root == null) return root;
//        if (root.val < L) {
//            if (pre != null) {
//                if (root.val < pre.val) pre.left = root.right;
//                else pre.right = root.right;
//            }
//            root = root.right;
//        } else if (root.val > R) {
//            if (pre != null) {
//                if (root.val > pre.val) pre.right = root.left;
//                else pre.left = root.left;
//            }
//            root = root.left;
//        }
//        if (root != null) {
//            if (pre == null) {
//                if (root.val < L || root.val > R) root = removeNode(root, null, L, R);
//            } else {
//                if (root.val < L || root.val > R) removeNode(root, pre, L, R);
//            }
//            removeNode(root.left, root, L, R);
//            removeNode(root.right, root, L, R);
//        }
//        return root;
//    }

    /**
     * 超简洁写法
     * @param root
     * @param L
     * @param R
     * @return
     */
    public TreeNode trimBST(TreeNode root, int L, int R) {
        if (root == null) return root;
        if (root.val > R) return trimBST(root.left, L, R);
        if (root.val < L) return trimBST(root.right, L, R);

        root.left = trimBST(root.left, L, R);
        root.right = trimBST(root.right, L, R);
        return root;
    }

}

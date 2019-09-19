package leetcode.easy;

/**
 * 530. 二叉搜索树的最小绝对差
 *
 * 给定一个所有节点为非负值的二叉搜索树，求树中任意两节点的差的绝对值的最小值。
 *
 * 示例 :
 *
 * 输入:
 *
 *    1
 *     \
 *      3
 *     /
 *    2
 *
 * 输出:
 * 1
 *
 * 解释:
 * 最小绝对差为1，其中 2 和 1 的差的绝对值为 1（或者 2 和 3）。
 * 注意: 树中至少有2个节点。
 *
 * @author gcg
 * @create 2019-09-19 15:21
 **/
public class FiveHundredThrity {

    // 最几把简单的做法
//    public int getMinimumDifference(TreeNode root) {
//        int min = getMin(root, root.val);
//        if (root.left != null) min = Math.min(getMinimumDifference(root.left), min);
//        if (root.right != null) min = Math.min(getMinimumDifference(root.right), min);
//        return min;
//    }
//
//    private int getMin(TreeNode root, int val) {
//        int left = Integer.MAX_VALUE;
//        int right = Integer.MAX_VALUE;
//        if (root.left != null) left = Math.min(Math.abs(val - root.left.val), getMin(root.left, val));
//        if (root.right != null) right = Math.min(Math.abs(val - root.right.val), getMin(root.right, val));
//        return Math.min(left, right);
//    }

    /**
     * 中序遍历做法
     */

    TreeNode pre;

    int min = Integer.MAX_VALUE;

    public int getMinimumDifference(TreeNode root) {
        getMin(root);
        return min;
    }

    private void getMin(TreeNode root) {
        if (root == null) return;
        getMin(root.left);
        // 中序遍历，按照顺序比较最小值
        if (pre != null) min = Math.min((root.val - pre.val), min);
        // 记录当前的上一个节点
        pre = root;
        getMin(root.right);
    }

}

package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 938. 二叉搜索树的范围和
 *
 * 给定二叉搜索树的根结点 root，返回 L 和 R（含）之间的所有结点的值的和。
 *
 * 二叉搜索树保证具有唯一的值。
 *
 *  
 *
 * 示例 1：
 *
 * 输入：root = [10,5,15,3,7,null,18], L = 7, R = 15
 * 输出：32
 * 示例 2：
 *
 * 输入：root = [10,5,15,3,7,13,18,1,null,6], L = 6, R = 10
 * 输出：23
 *  
 *
 * 提示：
 *
 * 树中的结点数量最多为 10000 个。
 * 最终的答案保证小于 2^31。
 *
 * @author gcg
 * @create 2020-01-15 18:56
 **/
public class NineHundredThrityEight {

    int sum = 0;

    public int rangeSumBST(TreeNode root, int L, int R) {
        getNum(root, L, R);
        return sum;
    }

    private void getNum(TreeNode root, int l, int r) {
        if (root == null) return;
        if (root.val >= l) getNum(root.left, l , r);
        if (root.val >= l && root.val <= r) sum += root.val;
        if (root.val <= r) getNum(root.right, l , r);
    }

}
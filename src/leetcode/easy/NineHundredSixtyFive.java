package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 965. 单值二叉树
 *
 * 如果二叉树每个节点都具有相同的值，那么该二叉树就是单值二叉树。
 *
 * 只有给定的树是单值二叉树时，才返回 true；否则返回 false。
 *
 *  
 *
 * 示例 1：
 *
 *
 *
 * 输入：[1,1,1,1,1,null,1]
 * 输出：true
 * 示例 2：
 *
 *
 *
 * 输入：[2,2,2,5,2]
 * 输出：false
 *  
 *
 * 提示：
 *
 * 给定树的节点数范围是 [1, 100]。
 * 每个节点的值都是整数，范围为 [0, 99] 。
 *
 * @author gcg
 * @create 2020-01-20 10:44
 **/
public class NineHundredSixtyFive {

    int val;

    public boolean isUnivalTree(TreeNode root) {
        val = root.val;
        return checkNum(root);
    }

    private boolean checkNum(TreeNode root) {
        if (root == null) return true;
        if (root.val != val) return false;
        return checkNum(root.left) && checkNum(root.right);
    }

}

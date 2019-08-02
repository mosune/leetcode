package leetcode.easy;

/**
 * 437. 路径总和 III
 *
 * 给定一个二叉树，它的每个结点都存放着一个整数值。
 *
 * 找出路径和等于给定数值的路径总数。
 *
 * 路径不需要从根节点开始，也不需要在叶子节点结束，但是路径方向必须是向下的（只能从父节点到子节点）。
 *
 * 二叉树不超过1000个节点，且节点数值范围是 [-1000000,1000000] 的整数。
 *
 * 示例：
 *
 * root = [10,5,-3,3,2,null,11,3,-2,null,1], sum = 8
 *
 *       10
 *      /  \
 *     5   -3
 *    / \    \
 *   3   2   11
 *  / \   \
 * 3  -2   1
 *
 * 返回 3。和等于 8 的路径有:
 *
 * 1.  5 -> 3
 * 2.  5 -> 2 -> 1
 * 3.  -3 -> 11
 *
 * @author gcg
 * @create 2019-08-02 14:14
 **/
public class FourHundredThirtySeven {

    public int pathSum(TreeNode root, int sum) {
        if (root == null) return 0;
        // 双递归
        return pathSum(root, sum) + innerPathSum(root.left, sum) + innerPathSum(root.right, sum);
    }

    private int innerPathSum(TreeNode root, int sum) {
        int num = 0;
        if (sum == root.val) num++;
        if (root.left != null) {
            num += innerPathSum(root.left, sum - root.val);
        }
        if (root.right != null) {
            num += innerPathSum(root.right, sum - root.val);
        }
        return num;
    }

}

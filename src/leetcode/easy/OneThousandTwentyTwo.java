package leetcode.easy;

import leetcode.commom.TreeNode;

/**
 * 1022. 从根到叶的二进制数之和
 *
 * 给出一棵二叉树，其上每个结点的值都是 0 或 1 。每一条从根到叶的路径都代表一个从最高有效位开始的二进制数。例如，如果路径为 0 -> 1 -> 1 -> 0 -> 1，那么它表示二进制数 01101，也就是 13 。
 *
 * 对树上的每一片叶子，我们都要找出从根到该叶子的路径所表示的数字。
 *
 * 以 10^9 + 7 为模，返回这些数字之和。
 *
 *  
 *
 * 示例：
 *
 *
 *
 * 输入：[1,0,1,0,1,0,1]
 * 输出：22
 * 解释：(100) + (101) + (110) + (111) = 4 + 5 + 6 + 7 = 22
 *  
 *
 * 提示：
 *
 * 树中的结点数介于 1 和 1000 之间。
 * node.val 为 0 或 1 。
 *
 * @author gcg
 * @create 2020-02-09 13:22
 **/
public class OneThousandTwentyTwo {

    int sum;

    public int sumRootToLeaf(TreeNode root) {
        getNum(root, 0);
        return sum;
    }

    private void getNum(TreeNode root, int val) {
        if (root == null) return;
        int num = (val << 1) | root.val;
        if (root.left != null) getNum(root.left, num);
        if (root.right != null) getNum(root.right, num);
        if (root.left == null && root.right == null) sum += num;
    }

}

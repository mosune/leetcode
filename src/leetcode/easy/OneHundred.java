package leetcode;

/**
 *
 * 给定两个二叉树，编写一个函数来检验它们是否相同。
 *
 * 如果两个树在结构上相同，并且节点具有相同的值，则认为它们是相同的。
 *
 * 示例 1:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   3     2   3
 *
 *         [1,2,3],   [1,2,3]
 *
 * 输出: true
 * 示例 2:
 *
 * 输入:      1          1
 *           /           \
 *          2             2
 *
 *         [1,2],     [1,null,2]
 *
 * 输出: false
 * 示例 3:
 *
 * 输入:       1         1
 *           / \       / \
 *          2   1     1   2
 *
 *         [1,2,1],   [1,1,2]
 *
 * 输出: false
 *
 * @author gcg
 * @create 2019-05-26 12:42
 **/
public class OneHundred {

    public boolean isSameTree(TreeNode p, TreeNode q) {
        return foreach(p, q);
    }

    private boolean foreach(TreeNode a, TreeNode b) {
        if (a == null && b != null) return false;
        if (b == null && a != null) return false;
        if (a == null && b == null) return true;
        if (a.val != b.val) {
            return false;
        }
        if (!foreach(a.left, b.left)) return false;
        if (!foreach(a.right, b.right)) return false;
        return true;
    }

}

class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode(int x) { val = x; }
}
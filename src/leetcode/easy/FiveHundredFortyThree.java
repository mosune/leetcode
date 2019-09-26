package leetcode.easy;

/**
 * 543. 二叉树的直径
 *
 * 给定一棵二叉树，你需要计算它的直径长度。一棵二叉树的直径长度是任意两个结点路径长度中的最大值。这条路径可能穿过根结点。
 *
 * 示例 :
 * 给定二叉树
 *
 *           1
 *          / \
 *         2   3
 *        / \
 *       4   5
 * 返回 3, 它的长度是路径 [4,2,1,3] 或者 [5,2,1,3]。
 *
 * 注意：两结点之间的路径长度是以它们之间边的数目表示。
 *
 * @author gcg
 * @create 2019-09-26 10:54
 **/
public class FiveHundredFortyThree {

    private static int max;

    /**
     * 复杂做法
     * @param root
     * @return
     */
//    public int diameterOfBinaryTree(TreeNode root) {
//        if (root == null) return 0;
//        max = Math.max(getLength(root.left, 1) + getLength(root.right, 1), max);
//        max = Math.max(diameterOfBinaryTree(root.left), max);
//        max = Math.max(diameterOfBinaryTree(root.right), max);
//        return max;
//    }
//
//    private int getLength(TreeNode node, int length) {
//        if (node == null) return length - 1;
//        int left = length, right = length;
//        if (node.left != null) left = getLength(node.left, length + 1);
//        if (node.right != null) right = getLength(node.right, length + 1);
//        return Math.max(left, right);
//    }

    /**
     * 简单做法
     * @param root
     * @return
     */
    public int diameterOfBinaryTree(TreeNode root) {
        getLength(root);
        return max;
    }

    public int getLength(TreeNode node) {
        if (node == null) return 0;
        int left = getLength(node.left);
        int right = getLength(node.right);
        // 比较左右相加和max的大小
        max = Math.max(left + right, max);
        // 算上自己的一个节点边
        return Math.max(left, right) + 1;
    }

}

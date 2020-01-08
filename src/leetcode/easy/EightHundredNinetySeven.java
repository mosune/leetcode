package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 897. 递增顺序查找树
 *
 * 给定一个树，按中序遍历重新排列树，使树中最左边的结点现在是树的根，并且每个结点没有左子结点，只有一个右子结点。
 *
 *  
 *
 * 示例 ：
 *
 * 输入：[5,3,6,2,4,null,8,1,null,null,null,7,9]
 *
 *        5
 *       / \
 *     3    6
 *    / \    \
 *   2   4    8
 *  /        / \
 * 1        7   9
 *
 * 输出：[1,null,2,null,3,null,4,null,5,null,6,null,7,null,8,null,9]
 *
 *  1
 *   \
 *    2
 *     \
 *      3
 *       \
 *        4
 *         \
 *          5
 *           \
 *            6
 *             \
 *              7
 *               \
 *                8
 *                 \
 *                  9
 *  
 *
 * 提示：
 *
 * 给定树中的结点数介于 1 和 100 之间。
 * 每个结点都有一个从 0 到 1000 范围内的唯一整数值。
 *
 * @author gcg
 * @create 2020-01-08 18:44
 **/
public class EightHundredNinetySeven {

    /**
     * 拿出所有的节点进行拼装
     */
//    List<Integer> list = new ArrayList<>();
//
//    TreeNode treeNode;
//
//    public TreeNode increasingBST(TreeNode root) {
//        getList(root);
//        treeNode = new TreeNode(list.get(0));
//        TreeNode index = treeNode;
//        for (int i = 1; i < list.size(); i++) {
//            index.right = new TreeNode(list.get(i));
//            index = index.right;
//        }
//        return treeNode;
//    }
//
//    private void getList(TreeNode node) {
//        if (node == null) return;
//        getList(node.left);
//        list.add(node.val);
//        getList(node.right);
//    }

    /**
     * 边遍历边拼装
     */
    TreeNode index = new TreeNode(-1);

    public TreeNode increasingBST(TreeNode root) {
        TreeNode node = index;
        getList(root);
        return node.right;
    }

    private void getList(TreeNode node) {
        if (node == null) return;
        getList(node.left);
        node.left = null;
        index.right = node;
        index = node;
        getList(node.right);
    }

}

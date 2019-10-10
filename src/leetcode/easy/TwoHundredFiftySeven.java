package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 257. 二叉树的所有路径
 *
 * 给定一个二叉树，返回所有从根节点到叶子节点的路径。
 *
 * 说明: 叶子节点是指没有子节点的节点。
 *
 * 示例:
 *
 * 输入:
 *
 *    1
 *  /   \
 * 2     3
 *  \
 *   5
 *
 * 输出: ["1->2->5", "1->3"]
 *
 * 解释: 所有根节点到叶子节点的路径为: 1->2->5, 1->3
 *
 * @author gcg
 * @create 2019-07-01 10:57
 **/
public class TwoHundredFiftySeven {

    // 迭代的写法
//    public List<String> binaryTreePaths(TreeNode root) {
//        List<String> list = new ArrayList<>();
//        if (root == null) return list;
//        Queue<TreeNode> queue = new LinkedList<>();
//        HashMap<TreeNode, String> map = new HashMap<>();
//        queue.offer(root);
//        map.put(root, root.val + "");
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            String str = map.get(node);
//            if (node.left != null) {
//                queue.offer(node.left);
//                map.put(node.left, str + "->" + node.left.val);
//            }
//            if (node.right != null) {
//                queue.offer(node.right);
//                map.put(node.right, str + "->" + node.right.val);
//            }
//            if (node.left == null && node.right == null) {
//                list.add(map.get(node));
//            }
//        }
//
//        return list;
//    }

    // 递归写法
    public List<String> binaryTreePaths(TreeNode root) {
        List<String> list = new ArrayList<>();
        if (root == null) return list;
        addPath(list, root.val + "", root);
        return list;
    }

    private void addPath(List<String> list, String path, TreeNode node) {
        if (node.left != null) addPath(list, path + "->" + node.left.val, node.left);
        if (node.right != null) addPath(list, path + "->" + node.right.val, node.right);
        if (node.left == null && node.right == null) list.add(path);
    }

}

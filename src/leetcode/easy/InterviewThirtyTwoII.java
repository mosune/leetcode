package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 面试题32 - II. 从上到下打印二叉树 II
 *
 * 从上到下按层打印二叉树，同一层的节点按从左到右的顺序打印，每一层打印到一行。
 *
 *  
 *
 * 例如:
 * 给定二叉树: [3,9,20,null,null,15,7],
 *
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 返回其层次遍历结果：
 *
 * [
 *   [3],
 *   [9,20],
 *   [15,7]
 * ]
 *  
 *
 * 提示：
 *
 * 节点总数 <= 1000
 * 注意：本题与主站 102 题相同：https://leetcode-cn.com/problems/binary-tree-level-order-traversal/
 *
 * @author gcg
 * @create 2020-05-26 13:41
 **/
public class InterviewThirtyTwoII {

    public List<List<Integer>> levelOrder(TreeNode root) {
        if (root == null) return new ArrayList<>();
        List<List<Integer>> results = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.offer(root);

        while (!queue.isEmpty()) {
            List<Integer> list = new ArrayList<>();
            int size = queue.size();
            for (int i = 0; i < size; i++) {
                TreeNode node = queue.poll();
                list.add(node.val);
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            results.add(list);
        }

        return results;
    }

}

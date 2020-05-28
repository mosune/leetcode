package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 面试题54. 二叉搜索树的第k大节点
 *
 * 给定一棵二叉搜索树，请找出其中第k大的节点。
 *
 *  
 *
 * 示例 1:
 *
 * 输入: root = [3,1,4,null,2], k = 1
 *    3
 *   / \
 *  1   4
 *   \
 *    2
 * 输出: 4
 * 示例 2:
 *
 * 输入: root = [5,3,6,2,4,null,null,1], k = 3
 *        5
 *       / \
 *      3   6
 *     / \
 *    2   4
 *   /
 *  1
 * 输出: 4
 *  
 *
 * 限制：
 *
 * 1 ≤ k ≤ 二叉搜索树元素个数
 *
 * @author gcg
 * @create 2020-05-28 11:00
 **/
public class InterviewFiftyFour {

//    List<Integer> list = new ArrayList<>();
//
//    public int kthLargest(TreeNode root, int k) {
//        addNum(root);
//        return list.get(list.size() - k);
//    }
//
//    private void addNum(TreeNode node) {
//        if (node == null) return;
//        addNum(node.left);
//        list.add(node.val);
//        addNum(node.right);
//    }

    TreeNode node;

    int k;

    public int kthLargest(TreeNode root, int k) {
        this.k = k;
        addNum(root);
        return node.val;
    }

    private void addNum(TreeNode node) {
        if (node == null) return;
        addNum(node.right);
        if (k == 0) return;
        if (--k == 0) this.node = node;
        addNum(node.left);
    }

}

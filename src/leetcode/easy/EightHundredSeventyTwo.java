package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 872. 叶子相似的树
 *
 * 请考虑一颗二叉树上所有的叶子，这些叶子的值按从左到右的顺序排列形成一个 叶值序列 。
 *
 *
 *
 * 举个例子，如上图所示，给定一颗叶值序列为 (6, 7, 4, 9, 8) 的树。
 *
 * 如果有两颗二叉树的叶值序列是相同，那么我们就认为它们是 叶相似 的。
 *
 * 如果给定的两个头结点分别为 root1 和 root2 的树是叶相似的，则返回 true；否则返回 false 。
 *
 *  
 *
 * 提示：
 *
 * 给定的两颗树可能会有 1 到 100 个结点。
 *
 * @author gcg
 * @create 2020-01-02 15:02
 **/
public class EightHundredSeventyTwo {

    public boolean leafSimilar(TreeNode root1, TreeNode root2) {
        List<Integer> list1 = new ArrayList<>();
        getList(root1, list1);
        List<Integer> list2 = new ArrayList<>();
        getList(root2, list2);
        if (list1.size() != list2.size()) return false;
        for (int i = 0; i < list1.size(); i++) {
            if (list1.get(i) != list2.get(i)) return false;
        }
        return true;
    }

    private void getList(TreeNode root, List<Integer> list) {
        if (root == null) return;
        getList(root.left, list);
        if (root.left == null && root.right == null) list.add(root.val);
        getList(root.right, list);
    }

}

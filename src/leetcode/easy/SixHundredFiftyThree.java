package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.List;

/**
 * 653. 两数之和 IV - 输入 BST
 *
 * 给定一个二叉搜索树和一个目标结果，如果 BST 中存在两个元素且它们的和等于给定的目标结果，则返回 true。
 *
 * 案例 1:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 9
 *
 * 输出: True
 *  
 *
 * 案例 2:
 *
 * 输入:
 *     5
 *    / \
 *   3   6
 *  / \   \
 * 2   4   7
 *
 * Target = 28
 *
 * 输出: False
 *
 * @author gcg
 * @create 2019-11-01 11:20
 **/
public class SixHundredFiftyThree {

    private List<Integer> list = new ArrayList<>();

    public boolean findTarget(TreeNode root, int k) {
        getValue(root);
        // 双循环
//        for (int i = 0; i < list.size(); i++) {
//            int num = list.get(i);
//            for (int j = i + 1; j < list.size(); j++) {
//                if (list.get(j) + num == k) return true;
//                else if (list.get(j) + num > k) break;
//            }
//        }
        // 双指针
        int pre = 0;
        int last = list.size() - 1;
        while (pre != last) {
            if (list.get(pre) + list.get(last) == k) return true;
            else if (list.get(pre) + list.get(last) > k) last--;
            else pre++;
        }

        return false;
    }

    private void getValue(TreeNode root) {
        if (root == null) return;
        getValue(root.left);
        list.add(root.val);
        getValue(root.right);
    }

}

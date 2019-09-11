package leetcode.easy;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

/**
 * 501. 二叉搜索树中的众数
 *
 * 给定一个有相同值的二叉搜索树（BST），找出 BST 中的所有众数（出现频率最高的元素）。
 *
 * 假定 BST 有如下定义：
 *
 * 结点左子树中所含结点的值小于等于当前结点的值
 * 结点右子树中所含结点的值大于等于当前结点的值
 * 左子树和右子树都是二叉搜索树
 * 例如：
 * 给定 BST [1,null,2,2],
 *
 *    1
 *     \
 *      2
 *     /
 *    2
 * 返回[2].
 *
 * 提示：如果众数超过1个，不需考虑输出顺序
 *
 * 进阶：你可以不使用额外的空间吗？（假设由递归产生的隐式调用栈的开销不被计算在内）
 *
 * @author gcg
 * @create 2019-09-11 14:59
 **/
public class FiveHundredOne {

    /**
     * 哈希表做法
     * @param root
     * @return
     */
//    public static int[] findMode(TreeNode root) {
//        Map<Integer, Integer> map = new HashMap<>();
//        List<Integer> list = new ArrayList<>();
//        int[] array;
//        if (root == null) {
//            array = new int[list.size()];
//            return array;
//        }
//        int max = findNum(root, map, 0);
//        Set<Map.Entry<Integer, Integer>> set = map.entrySet();
//        for (Map.Entry<Integer, Integer> entry : set) {
//            if (entry.getValue() == max) list.add(entry.getKey());
//        }
//
//        array = new int[list.size()];
//        for (int i = 0; i < list.size(); i++) array[i] = list.get(i);
//        return array;
//    }
//
//    private static int findNum(TreeNode node, Map<Integer, Integer> map, int max) {
//        if (node == null) return max;
//        Integer num = map.get(node.val) == null ? 1 : map.get(node.val) + 1;
//        map.put(node.val, num);
//        max = Math.max(max, num);
//        return Math.max(num, Math.max(findNum(node.left, map, max), findNum(node.right, map, max)));
//    }

    // -------------------------------------------中序遍历--------------------------------------

    /**
     * 上个节点
      */
    private TreeNode pre;

    /**
     * 当前个数
     */
    private int cur = 1;

    /**
     * 最大个数
     */
    private int max = 1;

    /**
     * 最大数量存储list
     */
    private List<Integer> list = new ArrayList<>();

    public int[] findMode(TreeNode root) {
        List<Integer> list = new ArrayList<>();
        if (root == null) {
            return new int[list.size()];
        }
        findNum(root);
        int[] array = new int[list.size()];
        for (int i = 0; i < list.size(); i++) array[i] = list.get(i);
        return array;
    }

    private void findNum(TreeNode node) {
        if (node == null) return;
        // 中序遍历
        findNum(node.left);
        if (pre != null) {
            // 数量加1
            if (pre.val == node.val) cur++;
            // 否则重置为1
            else cur = 1;
        }
        // 达到最大加入list
        if (cur == max) list.add(node.val);
        else if (cur > max) {
            // 最大超越就清空集合，重新添加，并且获取新的最大值
            list.clear();
            list.add(node.val);
            max = cur;
        }
        pre = node;
        findNum(node.right);
    }

}

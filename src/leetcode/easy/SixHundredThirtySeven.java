package leetcode.easy;

import leetcode.commom.TreeNode;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

/**
 * 637. 二叉树的层平均值
 *
 * 给定一个非空二叉树, 返回一个由每层节点平均值组成的数组.
 *
 * 示例 1:
 *
 * 输入:
 *     3
 *    / \
 *   9  20
 *     /  \
 *    15   7
 * 输出: [3, 14.5, 11]
 * 解释:
 * 第0层的平均值是 3,  第1层是 14.5, 第2层是 11. 因此返回 [3, 14.5, 11].
 * 注意：
 *
 * 节点值的范围在32位有符号整数范围内。
 *
 * @author gcg
 * @create 2019-10-25 15:14
 **/
public class SixHundredThirtySeven {

//    public List<Double> averageOfLevels(TreeNode root) {
//        List<Double> list = new ArrayList<>();
//        Queue<TreeNode> queue = new LinkedList<>();
//        Map<TreeNode, Integer> map = new HashMap<>();
//        queue.add(root);
//        map.put(root, 1);
//        double sum = 0;
//        int num = 0;
//        int index = 1;
//
//        while (!queue.isEmpty()) {
//            TreeNode node = queue.poll();
//            sum += node.val;
//            num++;
//            if (node.left != null) {
//                queue.offer(node.left);
//                map.put(node.left, index + 1);
//            }
//            if (node.right != null) {
//                queue.offer(node.right);
//                map.put(node.right, index + 1);
//            }
//            if (!queue.isEmpty() && map.get(queue.element()) != index) {
//                list.add(sum / num);
//                sum = 0;
//                num = 0;
//                index++;
//            }
//        }
//
//        return list;
//    }

    /**
     * 减少参数
     * @param root
     * @return
     */
    public List<Double> averageOfLevels(TreeNode root) {
        List<Double> list = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        queue.add(root);
        int size = 1;
        double sum = 0d;
        int num = size;

        while (!queue.isEmpty()) {
            while (size > 0) {
                size--;
                TreeNode node = queue.poll();
                sum += node.val;
                if (node.left != null) queue.offer(node.left);
                if (node.right != null) queue.offer(node.right);
            }
            list.add(sum / num);
            size = queue.size();
            num = size;
            sum = 0d;
        }
        return list;
    }

}

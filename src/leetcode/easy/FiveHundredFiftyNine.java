package leetcode.easy;

import leetcode.commom.Node;

import java.util.List;

/**
 * 559. N叉树的最大深度
 *
 * 给定一个 N 叉树，找到其最大深度。
 *
 * 最大深度是指从根节点到最远叶子节点的最长路径上的节点总数。
 *
 * 例如，给定一个 3叉树 :
 *
 * 我们应返回其最大深度，3。
 *
 * 说明:
 *
 * 树的深度不会超过 1000。
 * 树的节点总不会超过 5000。
 *
 * @author gcg
 * @create 2019-09-27 15:42
 **/
public class FiveHundredFiftyNine {

    /**
     * 复杂写法
     */
//    private int max;
//
//    public int maxDepth(Node root) {
//        getMax(root, 0);
//        return max;
//    }
//
//    private void getMax(Node node, int depth) {
//        if (node == null) return;
//        List<Node> childs = node.children;
//        for (Node n : childs) {
//            getMax(n, depth + 1);
//        }
//        max = Math.max(depth + 1, max);
//    }

    /**
     * 简单写法
     * @param root
     * @return
     */
    public int maxDepth(Node root) {
        if (root == null) return 0;
        int d = 0;
        for (Node node : root.children) d = Math.max(maxDepth(node), d);
        return d + 1;
    }

}

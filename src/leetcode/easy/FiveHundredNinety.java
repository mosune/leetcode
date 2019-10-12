package leetcode.easy;

import leetcode.commom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 590. N叉树的后序遍历
 *
 * 给定一个 N 叉树，返回其节点值的后序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其后序遍历: [5,6,3,2,4,1].
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * @author gcg
 * @create 2019-10-12 10:16
 **/
public class FiveHundredNinety {

    /**
     * 递归
     * @param root
     * @return
     */
//    public List<Integer> postorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        foreach(root, list);
//        return list;
//    }
//
//    private void foreach(Node root, List<Integer> list) {
//        if (root == null) return;
//        for (Node node : root.children) foreach(node, list);
//        list.add(root.val);
//    }

    /**
     * 迭代
     * @param root
     * @return
     */
    public List<Integer> postorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        Stack<Node> roots = new Stack<>();
        stack.push(root);

        while (!stack.isEmpty()) {
            Node node = stack.peek();
            if (node.children != null) {
                if (roots.isEmpty() || roots.peek() != node) {
                    roots.push(node);
                    for (int i = node.children.size() - 1; i >= 0; i--) stack.push(node.children.get(i));
                } else {
                    roots.pop();
                    stack.pop();
                    list.add(node.val);
                }
            } else {
                stack.pop();
                list.add(node.val);
            }

        }

        return list;
    }

}

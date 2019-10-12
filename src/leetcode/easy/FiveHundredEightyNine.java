package leetcode.easy;

import leetcode.commom.Node;

import java.util.ArrayList;
import java.util.List;
import java.util.Stack;

/**
 * 589. N叉树的前序遍历
 *
 * 给定一个 N 叉树，返回其节点值的前序遍历。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其前序遍历: [1,3,5,6,2,4]。
 *
 * 说明: 递归法很简单，你可以使用迭代法完成此题吗?
 *
 * @author gcg
 * @create 2019-10-11 12:38
 **/
public class FiveHundredEightyNine {

    /**
     * 递归解法
     * @param root
     * @return
     */
//    public List<Integer> preorder(Node root) {
//        List<Integer> list = new ArrayList<>();
//        foreach(root, list);
//        return list;
//    }
//
//    private void foreach(Node root, List<Integer> list) {
//        if (root == null) return;
//        list.add(root.val);
//        for (Node node : root.children) foreach(node, list);
//    }

    public List<Integer> preorder(Node root) {
        List<Integer> list = new ArrayList<>();
        Stack<Node> stack = new Stack<>();
        if (root != null) stack.add(root);

        // 迭代利用栈先放最右边的元素，然后栈顶是最左边的元素，以此类推逐渐遍历
        while (!stack.isEmpty()) {
            Node node = stack.pop();
            list.add(node.val);
            for (int i = node.children.size() - 1; i >= 0; i--) stack.add(node.children.get(i));
        }

        return list;
    }

}

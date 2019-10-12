package leetcode.easy;

import leetcode.commom.Node;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;

/**
 * 429. N叉树的层序遍历
 *
 * 给定一个 N 叉树，返回其节点值的层序遍历。 (即从左到右，逐层遍历)。
 *
 * 例如，给定一个 3叉树 :
 *
 * 返回其层序遍历:
 *
 * [
 *      [1],
 *      [3,2,4],
 *      [5,6]
 * ]
 *  
 *
 * 说明:
 *
 * 树的深度不会超过 1000。
 * 树的节点总数不会超过 5000。
 *
 * @author gcg
 * @create 2019-08-01 15:49
 **/
public class FourHundredTwentyNine {

//    public List<List<Integer>> levelOrder(Node root) {
//        List<List<Integer>> results = new ArrayList<>();
//        Queue<Node> queue = new LinkedList<>();
//        HashMap<Node, Integer> map = new HashMap<>();
//        queue.add(root);
//        map.put(root, 1);
//
//        while (!queue.isEmpty()) {
//            Node node = queue.poll();
//            Integer index = map.get(node);
//            map.remove(node);
//            if (results.size() < index) {
//                List<Integer> list = new ArrayList<>();
//                list.add(node.val);
//                results.add(list);
//            } else {
//                results.get(index - 1).add(node.val);
//            }
//            if (node.children != null) {
//                for (Node node1 : node.children) {
//                    queue.offer(node1);
//                    map.put(node1, index + 1);
//                }
//            }
//        }
//
//        return results;
//    }

    public List<List<Integer>> levelOrder(Node root) {
        List<List<Integer>> results = new ArrayList<>();
        if (root == null) return results;
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        int indexNum = 1;
        int nextNum = 0;
        int index = 1;
        while (!queue.isEmpty()) {
            if (indexNum == 0) {
                indexNum = nextNum;
                nextNum = 0;
                index++;
            }
            Node node = queue.poll();
            if (results.size() < index) {
                List<Integer> list = new ArrayList<>();
                list.add(node.val);
                results.add(list);
            } else {
                results.get(index - 1).add(node.val);
            }
            if (node.children != null) {
                queue.addAll(node.children);
                nextNum += node.children.size();
            }
            indexNum--;
        }

        return results;
    }

}

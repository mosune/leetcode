package leetcode.commom;

import java.util.List;

/**
 * @author gcg
 * @create 2019-10-12 11:25
 **/
public class Node {

    public int val;
    public List<Node> children;

    public Node() {}

    public Node(int _val, List<Node> _children) {
        val = _val;
        children = _children;
    }

}

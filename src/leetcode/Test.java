package leetcode;

import java.util.ArrayList;
import java.util.List;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        OneHundredTen oneHundredTen = new OneHundredTen();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.left.left = new TreeNode(3);
        root.right.right = new TreeNode(3);
        root.left.left.left = new TreeNode(15);
        root.right.right.right = new TreeNode(7);

//        System.out.println(oneHundredTen.isBalanced(root));

        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(2);
        System.out.println(1 + ":" + list.toString());
    }

}

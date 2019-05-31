package leetcode;

import java.util.List;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        OneHundredSeven oneHundredSeven = new OneHundredSeven();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(9);
        root.right = new TreeNode(20);
        root.right.left = new TreeNode(15);
        root.right.right = new TreeNode(7);


        List<List<Integer>> lists = oneHundredSeven.levelOrderBottom(root);
        System.out.println(lists);
    }

}

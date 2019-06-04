package leetcode;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        OneHundredEleven oneHundredEleven = new OneHundredEleven();

        TreeNode root = new TreeNode(3);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.left.left = new TreeNode(3);
        root.left.right = new TreeNode(3);

        System.out.println(oneHundredEleven.minDepth(root));
    }

}

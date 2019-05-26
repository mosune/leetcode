package leetcode;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        OneHundred oneHundred = new OneHundred();

        TreeNode p = new TreeNode(1);
        TreeNode q = new TreeNode(2);


        System.out.println(oneHundred.isSameTree(p, q));
    }

}

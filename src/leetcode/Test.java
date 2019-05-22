package leetcode;

/**
 * @author gcg
 * @create 2019-04-26 22:27
 **/
public class Test {

    public static void main(String[] args) {
        SixtySix sixtySix = new SixtySix();

        int[] nums = {9};

        nums = sixtySix.plusOne(nums);

        for (int num : nums) {
            System.out.println(num);
        }

    }

}

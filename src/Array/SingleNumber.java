package Array;

public class SingleNumber {
    public static int singleAppearance(int[] nums) {
        int res = 0;
        for (int num : nums) {
            res ^= num;
        }
        return res;
    }
}

package Array;

public class MaxConsecutive1s {
    public static int maxConsecutive1s(int[] nums) {
        int l = 0;
        int r = 0;
        int result = 0;
        // Using 2 Pointer Approach
        while(r<nums.length) {
            while(r<nums.length && nums[r]==1) {
                r++;
            }
            result = Math.max(result, r-l);
            while(r<nums.length && nums[r]==0){
                r++;
            }
            l = r;
        }
        return result;
    }
}

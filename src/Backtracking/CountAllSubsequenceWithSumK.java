package Backtracking;

public class CountAllSubsequenceWithSumK {
    static int count = 0;
    public static int totalCount(int[] nums, int k){
        countSubsequences(nums, k, 0, 0);
        return count;
    }

    private static void countSubsequences(int[] nums, int k, int idx, int sum){
        if(idx == nums.length){
            if(sum == k){
                count++;
            }
            return;
        }
        sum += nums[idx];
        countSubsequences(nums, k, idx+1, sum);
        sum -= nums[idx];
        countSubsequences(nums, k, idx+1, sum);
    }
}

package Backtracking;

public class CountAllSubsequenceWithSumK {
    static int count = 0;
    public static int totalCount(int[] nums, int k){
        //countSubsequences2(nums, k, 0, 0);
        return countSubsequences2(nums, k, 0, 0);
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


    // 2nd Approach
    private static int countSubsequences2(int[] nums, int k, int idx, int sum){
        if(idx == nums.length){
            if(sum == k){
                return 1;
            }
            return 0;
        }
        int c1 = countSubsequences2(nums, k, idx+1, sum + nums[idx]);
        int c2 = countSubsequences2(nums, k, idx+1, sum);
        return c1+c2;
    }
}

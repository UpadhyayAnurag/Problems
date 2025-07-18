package Array;

public class MaxSumSubArrayUsingKadaneAlgo {
    public static int maxSubArray(int[] nums) {
        int currSum = 0;
        int maxSum = Integer.MIN_VALUE;
        for(int num : nums){
            currSum += num;
            maxSum = Math.max(maxSum, currSum);
            currSum = (currSum>0)?currSum:0;
        }
        return maxSum;
    }
}

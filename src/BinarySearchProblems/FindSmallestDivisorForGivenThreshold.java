package BinarySearchProblems;

public class FindSmallestDivisorForGivenThreshold {
    public static int smallestDivisor(int[] nums, int threshold){
        int max = 0;
        for(int num : nums){
            max = Math.max(max,num);
        }
        if(nums.length== threshold ){
            return max;
        }
        return bs(nums, 1, max, threshold, 0);
    }

    private static int bs(int[] nums, int l, int r, int threshold, int res){
        int mid = (l + r)/2;
        if(l>r){
            return res;
        }
        boolean ans = divisionSum(nums, mid, threshold);
        if(ans){
            res = mid;
            return bs(nums, l, mid-1, threshold, res);
        }
        else{
            return bs(nums, mid+1, r, threshold, res);
        }
    }

    private static boolean divisionSum(int[] nums, int divisor, int threshold){
        int sum = 0;
        for(int num : nums){
            sum += Math.ceil(num/(float)divisor);
        }
        return sum<=threshold;
    }
}

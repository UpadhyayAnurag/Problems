package BinarySearchProblems;

public class KthMissingPositiveNumber {
    public static int findKthPositive(int[] nums, int k) {
        return bs(nums, k, 0, nums.length - 1);
    }
    private static int bs(int[] nums, int k, int l, int r) {
        int mid = (l+r)/2;
        if(r<l){
            return r + 1 + k;
        }
        int missing = nums[mid] - (mid + 1);
        if(missing<k){
            return bs(nums, k, mid+1, r);
        }
        else{
            return bs(nums, k, l, mid-1);
        }
    }
}

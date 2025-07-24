package BinarySearchProblems;

public class ImplementLowerBound {
    public static int lowerBound(int[] nums, int target){
        return bs(nums, target, 0, nums.length-1, nums.length);
    }

    private static int bs(int[] nums, int k, int l, int h, int idx){
        int mid = (l+h)/2;
        if(l>h){
            return idx;
        }
        else if(nums[mid]<k){
            return bs(nums, k, mid+1, h, idx);
        }
        else{
            idx = mid;
            return bs(nums, k, l, mid-1, idx);
        }
    }
}

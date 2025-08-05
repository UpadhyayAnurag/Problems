package BinarySearchProblems;

public class SingleElementInSortedArray {
    public static int singleElement(int[] nums){
        if(nums.length == 1){
            return nums[0];
        }
        return bs(nums, 1, nums.length-2);
    }
    private static int bs(int[] nums, int l, int r){
        int mid = l+(r-l)/2;
        if(nums[0]!=nums[1]){
            return nums[0];
        }
        else if(nums[nums.length-1]!=nums[nums.length-2]){
            return nums[nums.length-1];
        }
        else if(nums[mid]!=nums[mid-1] && nums[mid]!=nums[mid+1]){
            return nums[mid];
        }
        else if(mid%2!=0 && nums[mid]==nums[mid-1] || mid%2==0 &&  nums[mid]==nums[mid+1]){
            return bs(nums, mid+1, r);
        }
        else{
            return bs(nums, l, mid-1);
        }
    }
}

package BinarySearchProblems;

public class RecursiveBinarySearch {
    public static int binarySearch(int[] nums, int target){
        return helper(nums,target,0,nums.length-1);
    }

    private static int helper(int[] nums, int target, int low, int high){
        if(high<low){
            return -1;
        }
        int mid = (low + high)/2;
        if(nums[mid]==target){
            return mid;
        }
        else if(nums[mid]<target){
            return helper(nums, target, mid+1, high);
        }
        else{
            return helper(nums, target, low, mid-1);
        }
    }
}

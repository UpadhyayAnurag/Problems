package BinarySearchProblems;

public class PeakElementInArray {
    public static int findPeak(int[] nums){
        if(nums.length==1 || nums[0] > nums[1]){
            return 0;
        }
        else if(nums[nums.length-1] > nums[nums.length-2]){
            return nums.length-1;
        }
        else{
            return bs(nums, 1, nums.length-2);
        }
    }

    private static int bs(int[] nums, int l, int r){
        int mid = l+(r-l)/2;
        if(nums[mid]>nums[mid-1] && nums[mid]>nums[mid+1]){
            return mid;
        }
        else if(nums[mid]<nums[mid+1]){
            return bs(nums, mid+1, r);
        }
        else{
            return bs(nums, l, mid-1);
        }
    }
}

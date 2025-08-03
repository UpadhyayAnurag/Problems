package BinarySearchProblems;

public class SearchInRotatedSortedArray {
    public static int search(int[] nums, int target){
        return bs(nums, target, 0, nums.length-1);
    }
    private static int bs(int[] nums, int target, int l, int r){
        int mid = (l+r)/2;
        if(r<l){
            return -1;
        }
        if(nums[mid]==target)
            return mid;
        else if(nums[mid]<nums[r]){
            if(target>=nums[mid] && target<=nums[r]){
                return bs(nums, target, mid+1, r);
            }
            else{
                return bs(nums, target, l, mid-1);
            }
        }
        else{
            if(target>=nums[l] && target<=nums[mid]){
                return bs(nums, target, l, mid-1);
            }
            else{
                return bs(nums, target, mid+1, r);
            }
        }
    }
}

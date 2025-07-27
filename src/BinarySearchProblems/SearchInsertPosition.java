package BinarySearchProblems;

public class SearchInsertPosition {
    public static int searchInsert(int[] nums, int target) {
        int res = bs(nums, target, 0, nums.length-1);
        if(res == 0 && nums[0] > target || nums[res] == target) {
            return res;
        }
        return res+1;
    }

    private static int bs(int[] nums, int target, int low, int high) {
        int mid = (low + high) / 2;
        if(high<low || nums[mid]==target){
            return mid;
        }
        else if(nums[mid]>target){
            return bs(nums, target, low, mid - 1);
        }
        else{
            return bs(nums, target, mid + 1, high);
        }
    }
}

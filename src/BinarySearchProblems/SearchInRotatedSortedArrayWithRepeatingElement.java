package BinarySearchProblems;

public class SearchInRotatedSortedArrayWithRepeatingElement {
    public static boolean search(int[] nums, int target){
        return bs(nums, target, 0, nums.length-1);
    }
    private static boolean bs(int[] nums, int target, int l, int r){
        int mid = (l+r)/2;
        if(r<l){
            return false;
        }
        if(nums[mid]==target){
            return true;
        }
        if(nums[mid]==nums[l] && nums[mid]==nums[r]){
            l++;
            r--;
            return bs(nums, target, l, r);
        }

        else if(nums[mid]<=nums[r]){
            if(nums[mid]<target && nums[r]>= target){
                return bs(nums, target, mid+1, r);
            }
            else{
                return bs(nums, target, l, mid-1);
            }
        }
        else if(nums[l] <= nums[mid]){
            if(nums[mid]>target && nums[l] <= target){
                return bs(nums, target, l, mid-1);
            }
            else{
                return bs(nums, target, mid+1, r);
            }
        }
        return false;
    }
}

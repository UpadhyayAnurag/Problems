package BinarySearchProblems;

public class FirstAndLastOccurance {
    public static int[] firstAndLastOccurance(int[] nums, int target){
        return caller(nums, target);
    }

    private static int[] caller(int[] nums, int target){

        int o1 = lb(nums, target, 0, nums.length-1, nums.length);
        int o2 = ub(nums, target, 0, nums.length-1, nums.length);
        if(o1==nums.length || nums[o1] != target){
            return new int[]{-1,-1};
        }
        else{
            return new int[]{o1,o2-1};
        }
    }


    private static int ub(int[] nums, int target, int l, int r, int idx){
        int mid = (l+r)/2;
        if(l>r){
            return idx;
        }
        else if(nums[mid]<=target){
            return ub(nums, target, mid+1, r, idx);
        }
        else{
            idx = mid;
            return ub(nums, target, l, mid-1, idx);
        }
    }


    private static int lb(int[] nums, int target, int l, int r, int idx){
        int mid = (l+r)/2;
        if(l>r){
            return idx;
        }
        else if(nums[mid]<target){
            return lb(nums, target, mid+1, r, idx);
        }
        else{
            idx = mid;
            return lb(nums, target, l, mid-1, idx);
        }
    }
}

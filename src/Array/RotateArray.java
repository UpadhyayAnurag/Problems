package Array;

public class RotateArray {
    public static void rotate(int[] nums, int k) {
        int size = nums.length;
        k = k % size;
        reverse(nums, size-k,size-1);
        reverse(nums,0,size-k-1);
        reverse(nums,0,size-1);
    }

    public static void reverse(int[] nums, int start, int end){
        while(start<end){
            int temp = nums[start];
            nums[start] = nums[end];
            nums[end] = temp;
            start++;
            end--;
        }
    }
}

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


    public static void rotate_Iterative(int[] nums, int k){
        int size = nums.length;
        k = k % size;
        int[] aux = new int[k];


        for (int i = 0; i < k; i++) {
            aux[i] = nums[size - i - 1];
        }

        for (int i = size - 1; i > size - 1 - k; i--) {
            nums[i] = nums[i - k];
        }

        for (int i = 0; i < aux.length; i++) {
            nums[i] = aux[i];
        }

        for (int ele : nums) {
            System.out.print(ele + " ");
        }
    }
}

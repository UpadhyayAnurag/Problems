package Array;

public class MoveZeroes {
    public static void moveZeroes(int[] nums){
        int i = 0;
        for(int j = 0; j < nums.length; j++){ // Moving all non-zeroes to the beginning of the array
            if(nums[j] != 0){
                nums[i] = nums[j];
                i++;
            }
        }
        for(int j = i; j < nums.length; j++){  // Filling remaining spaces with zeroes
            nums[j] = 0;
        }
    }


    public static void moveZeroes2(int[] nums){
        int i = 0;
        int j = -1;
        for(i=0;i<nums.length;i++){
            if(nums[i]==0){
                j = i;
                break;
            }
        }
        int temp;
        for(i=j+1;i<nums.length;i++){
            if(nums[i]!=0){
                temp = nums[j];
                nums[j] = nums[i];
                nums[i] = temp;
                j++;
            }
        }
    }
}


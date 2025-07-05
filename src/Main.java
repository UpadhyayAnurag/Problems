import Array.*;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2,2,2, 3, 3, 4};

        // Second Maximum
        System.out.println(SecondMaximumInArray.secondMax(nums));

        // Remove Duplicate From Sorted Array
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums));

        // Left Rotate Array One
        int[] arr = {1,2,3,4,5};
        int[] res = LeftRotateArrayOne.leftRotateArray(arr);
        for(int ele : res){
            System.out.print(ele+ " ");
        }
        System.out.println();

        // Rotate Array
        int[] rot_arr = {1,2,3,4,5,6,7};
        RotateArray.rotate(rot_arr, 3);
        for(int ele : rot_arr){
            System.out.print(ele+ " ");
        }
        System.out.println();

        // Move Zeroes
        int[] mov_zero = {0,1,0,3,12};
        MoveZeroes.moveZeroes(mov_zero);
        for(int ele : mov_zero){
            System.out.print(ele+ " ");
        }
    }
}
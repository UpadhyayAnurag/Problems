import Array.RemoveDuplicatesFromSortedArray;
import Array.SecondMaximumInArray;

public class Main {
    public static void main(String[] args) {
        int[] nums = {1, 1, 1, 2,2,2, 3, 3, 4};
        System.out.println(SecondMaximumInArray.secondMax(nums));
        System.out.println(RemoveDuplicatesFromSortedArray.removeDuplicates(nums));
    }
}
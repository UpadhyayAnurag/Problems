package Array;

public class RemoveDuplicatesFromSortedArray {
    public static int removeDuplicates(int[] nums) {
        int i = 0;
        for (int num : nums) {
            if (i < 1 || num > nums[i - 1]) { // Comparing current element with the last unique element and handling a case where index can get -ve
                nums[i] = num;
                i++;
            }
        }
        return i;
    }
}

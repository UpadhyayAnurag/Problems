package BinarySearchProblems;

import java.util.Arrays;

public class MainForBinarySearch {
    public static void main(String[] args) {
        // Recursive Binary Search
        System.out.println(RecursiveBinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));

        // Implement Lower Bound
        System.out.println(ImplementLowerBound.lowerBound(new int[]{1,2,3,4,5,6,7,8,9,10}, 101));

        // Search Position to Insert an element if not present in an array
        System.out.println(SearchInsertPosition.searchInsert(new int[]{1,3,5,6},0));

        // First and Last Occurrence of an Element in an Array
        System.out.println(Arrays.toString(FirstAndLastOccurance.firstAndLastOccurance(new int[]{1, 2, 3, 3, 3, 4, 5, 6}, 3)));

        // Search In Rotated Sorted Array
        System.out.println(SearchInRotatedSortedArray.search(new int[]{3,1}, 1));

        // Search In Rotated Sorted Array With Repeating Values
        System.out.println(SearchInRotatedSortedArrayWithRepeatingElement.search(new int[]{3,1,2,2,3,2,2}, 2));
    }
}

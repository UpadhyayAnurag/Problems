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

        // Single Element in Sorted Array
        System.out.println(SingleElementInSortedArray.singleElement(new int[]{3,3,7,7,10,10,11,11,12}));

        // Peak Element Of The Array
        System.out.println(PeakElementInArray.findPeak(new int[]{1,2,3,1}));

        // Find Square Root of the Given Number
        System.out.println(FindSqrt.findSqrt(18));

        // KOKO Eating Banana
        System.out.println(KokoEatingBananas.minEatingSpeed(new int[]{3,6,7,11}, 8));

        // Minimum Number of Days to make m Bouquets
        System.out.println(MinimumDaysToMakeMBouquets.minDays(new int[]{7,7,7,7,12,7,7},2,3));

        // Find Smallest Divisor for Given a Threshold
        System.out.println(FindSmallestDivisorForGivenThreshold.smallestDivisor(new int[]{1,2,5,9}, 6));

        // Capacity To Ship Packages Within D Days
        System.out.println(CapacityToShipPackagesWithinDDays.shipWithinDays(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));

        // Kth Missing Positive Number
        System.out.println(KthMissingPositiveNumber.findKthPositive(new int[]{1,2,3,4,5,6,7,9,10}, 5));

        // Aggressive Cows
        System.out.println(AggressiveCows.aggressiveCows(new int[]{1,4,5,8}, 3));

        // Allocate Minimum Number of Pages
        System.out.println(AllocateMinimumNumberOfPages.findPages(new int[]{1,2,3,4,5,6,7,8,9,10}, 5));

        // Split Array Largest Sum
        System.out.println(SplitArrayLargestSum.splitArray(new int[]{7,2,5,10,8},2));

        // Minimize Max Distance to Gas Station
        System.out.println(MinimizeMaxDistanceToGasStation.minMaxDis(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}, 9));

        // Median Of Sorted Arrays
        System.out.println(MedianOfSortedArrays.findMedianSortedArrays(new int[]{2,3,4,5},new  int[]{1}));

        // Kth Element Of Sorted Arrays
        System.out.println(KthElementOfSortedArray.findKth(new int[] {1,3,5,7}, new int[] {2,4,6,8}, 4));

        // Row With Max 1's
        System.out.println(RowWithMax1s.rowsWithMax1s(new int[][] {{0, 1}, {1, 1}}));

        // Search In A 2D Matrix
        System.out.println(SearchInA2DMatrix.searchMatrix(new int[][] {{1, 3, 5, 7}, {10, 11, 16, 20}, {23, 30, 34, 50}}, 3));
    }
}

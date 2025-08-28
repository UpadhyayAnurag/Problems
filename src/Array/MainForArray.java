package Array;

import java.util.ArrayList;

public class MainForArray { // This class is responsible for handling all classes inside Array package
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
        System.out.println();

        // Frequency Of Most Frequent Element
        int[] freq_ele = {9930,9923,9983,9997,9934,9952,9945,9914,9985,9982,9970,9932,9985,9902,9975,9990,9922,9990,9994,9937,9996,9964,9943,9963,9911,9925,9935,9945,9933,9916,9930,9938,10000,9916,9911,9959,9957,9907,9913,9916,9993,9930,9975,9924,9988,9923,9910,9925,9977,9981,9927,9930,9927,9925,9923,9904,9928,9928,9986,9903,9985,9954,9938,9911,9952,9974,9926,9920,9972,9983,9973,9917,9995,9973,9977,9947,9936,9975,9954,9932,9964,9972,9935,9946,9966};
        int k = 3056;
        System.out.println(FrequencyOfMostFrequentElement.frequencyOfMostFrequentElement(freq_ele, k));

        // Union Of 2 Sorted Arrays
        int[] nums1 = {1, 2, 3, 4, 5};
        int[] nums2 = {1, 2, 3, 6, 7};
        ArrayList<Integer> lst = UnionOf2SortedArrays.union(nums1, nums2);
        System.out.println(lst);

        // Max Consecutive One's
        int[] maxOnes = {1,0,1,0,1,1,1,0,1,1,1,1};
        System.out.println(MaxConsecutive1s.maxConsecutive1s(maxOnes));

        // Number Appearing Once in Array
        int[] numOnce = {1,2,3,3,2,4,1,5,4};
        System.out.println(SingleNumber.singleAppearance(numOnce));

        // Longest Subarray with Sum K
        int[] numsSumK = {1,2,3,4,5,6,7,8,9,10};
        System.out.println(LongestSubarrayWithSumK.getLongestSubarray(numsSumK, 10));

        // 2 Sum -> Using Hashmap
        int[] twoSum = {2,7,11,15};
        int target = 9;
        int[] result2Sum = TwoSum.TwoSum(twoSum, target);
        for(int ele : result2Sum){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Sort Colors where 0, 1 & 2 are 3 different colors -> In-Place
        int[] numsColor = {2,0,2,1,1,0};
        SortColors.sortColors(numsColor);
        for(int ele : numsColor){
            System.out.print(ele+" ");
        }
        System.out.println();

        // Majority Element in Array
        int[] numsMaj = {3,2,3};
        System.out.println(MajorityElement.majorityElement(numsMaj));

        // Kadane's Algo to find maximum sum of subarray
        int[] numsKad = {-2,1,-3,4,-1,2,1,-5,4};
        System.out.println(MaxSumSubArrayUsingKadaneAlgo.maxSubArray(numsKad));

        // Best Time to Buy and Sell Stocks
        int[] numsProfit = {7,1,5,3,6,4};
        System.out.println(BestTimeToBuySellStock.maxProfit(numsProfit));

        // Median Of 2 Sorted Arrays
        System.out.println(MedianOf2SortedArrays.findMedianSortedArrays(new int[]{1,3}, new int[]{2}));
    }
}

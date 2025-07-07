package Array;

import java.util.Arrays;

public class FrequencyOfMostFrequentElement {
    public static int frequencyOfMostFrequentElement(int[] nums,int k) {
        // This Approach uses Binary Search Technique to find the frequency of the most frequent element in an array
        Arrays.sort(nums);     // Sorting the Array to effectively implement binary search
        int len = nums.length;
        int[] pSum = new int[len];

        // CALCULATING PREFIX ARRAY
        pSum[0] = nums[0];
        for(int i=1; i<len; i++){
            pSum[i] = nums[i] + pSum[i - 1];
        }

        // using outer for loop to traverse each element in the array
        int res = 0;
        for(int i=0;i<len;i++){
            int freq = bSearch(i,nums,pSum,k);
            res = Math.max(res,freq);
        }
        return res;
    }

    // Binary Search Function
    public static int bSearch(int idx, int[] nums, int[] pSum, int k) {
        int l = 0;
        int r = idx;
        int res = 0;
        int mid = (l+r)/2;
        while(l<=r){
            mid = (l+r)/2;
            int targetSum = (idx - mid + 1) * nums[idx];
            int preSum = pSum[idx] - (mid > 0 ? pSum[mid - 1] : 0);   // TO COMPUTE SUM OF ELEMENTS BETWEEN idx and mid
            if(targetSum-preSum>k){
                l = mid+1;
            }
            else{
                res = mid;
                r = mid-1;
            }
        }
        return idx-res+1;
    }
}

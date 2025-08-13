package BinarySearchProblems;

public class MinimumDaysToMakeMBouquets {
    public static int minDays(int[] bloomDay, int m, int k){
        if(m*k > bloomDay.length){
            return -1;
        }
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        // Find min & max for Binary Search
        for(int num:bloomDay){
            min = Math.min(min, num);
            max = Math.max(max, num);
        }
        return bs(bloomDay, m, k, min, max, -1);
    }
    private static int bs(int[] bloomDay, int m, int k, int l, int r, int res){
        int mid = (l+r)/2;
        if(l>r){
            return res;
        }
        boolean ans = possible(bloomDay, mid, k, m);

        if(ans){
            res = mid;
            return bs(bloomDay, m, k, l, mid-1, res);
        }
        else{
            return bs(bloomDay, m, k, mid+1, r, res);
        }
    }
    private static boolean possible(int[] nums, int currDay, int k, int m){
        int globalCtr = 0;
        int loopCtr = 0;
        for(int i=0;i<nums.length;i++){
            if(nums[i]<=currDay){
                loopCtr++;
            }
            else{
                globalCtr += loopCtr/k;
                loopCtr = 0;
            }
        }
        globalCtr += loopCtr/k;
        return (globalCtr==m || globalCtr>m);
    }
}

package BinarySearchProblems;

import java.util.Arrays;

public class AggressiveCows {
    public static int aggressiveCows(int[] stalls, int k) {
        Arrays.sort(stalls);
        return bs(stalls, k, 1, stalls[stalls.length-1]-stalls[0]);
    }

    private static int bs(int[] stalls, int k, int l, int r){
        int mid = l+(r-l)/2;
        if(r<l){
            return r;
        }
        if(isPossible(stalls, mid, k)){
            return bs(stalls, k, mid+1, r);
        }
        else{
            return bs(stalls, k, l, mid-1);
        }
    }

    private static boolean isPossible(int[] stalls, int gap, int k){
        int last = stalls[0];
        int cows = 1;

        for(int i=1;i<stalls.length;i++){
            if(stalls[i]-last >= gap){
                cows++;
                last = stalls[i];
            }
            // return cows == k;
        }
        return cows>=k;
    }
}

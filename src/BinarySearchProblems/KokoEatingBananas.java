package BinarySearchProblems;

public class KokoEatingBananas {
    public static int minEatingSpeed(int[] piles, int h) {
        int max = Integer.MIN_VALUE;
        for(int num:piles){
            max = Math.max(num, max);
        }

        return bs(piles, 1, max, h);
    }
    private static int bs(int[]piles, int l, int r, int givenTime){
        int mid = l+(r-l)/2;
        if(r<l){
            return l;
        }
        int totalTime = calcTime(piles, mid);
        if(totalTime>givenTime){
            return bs(piles, mid+1, r, givenTime);
        }
        else{
            return bs(piles, l, mid-1, givenTime);
        }
    }

    private static int calcTime(int[] piles, int ratePerHour){
        int res = 0;
        for(int num:piles){
            res += (int) Math.ceil((double)num/ratePerHour);
        }
        return res;
    }
}

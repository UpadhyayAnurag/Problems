package BinarySearchProblems;

public class CapacityToShipPackagesWithinDDays {
    public static int shipWithinDays(int[] weights, int days){
        int max = 0;
        int sum = 0;
        for(int weight : weights){
            max = Math.max(max,weight);
            sum += weight;
        }
        if(days == 1){
            return sum;
        }
        return bs(weights, days, max, sum, -1);
    }
    private static int bs(int[] weights, int days, int l, int r, int res){
        int mid = l + (r-l)/2;
        if(l>r){
            return res;
        }
        int ans = countDays(weights, mid);
        if(ans<=days){
            res = mid;
            return bs(weights, days, l, mid-1, res);
        }
        else{
            return bs(weights, days, mid+1, r, res);
        }
    }

    private static int countDays(int[] weights, int capacity){
        int sum = 0;
        int days = 0;
        for(int i=0;i<weights.length;i++){
            if(sum+weights[i]<=capacity){
                sum += weights[i];
            }
            else{
                days++;
                sum = weights[i];
            }
        }
        days++;
        return days;
    }
}

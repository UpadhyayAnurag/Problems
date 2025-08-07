package BinarySearchProblems;

public class FindSqrt {
    public static int findSqrt(int n){
        int res = -1;
        return bs(n, res, 0, n);
    }
    private static int bs(int n, int res, int l, int r){
        int mid = (l+r)/2;
        if(r<l){
            return res;
        }
        if(mid*mid==n){
            return mid;
        }
        else if(mid*mid<n){
            res = mid;
            return bs(n, res, mid+1, r);
        }
        else{
            return bs(n, res, l, mid-1);
        }
    }
}

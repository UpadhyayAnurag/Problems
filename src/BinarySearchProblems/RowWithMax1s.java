package BinarySearchProblems;

public class RowWithMax1s {
    public static int rowsWithMax1s(int[][] mat) {
        int count = 0;
        int res = 0;
        for(int i=0;i<mat.length;i++){
            int num = bs(mat[i],0,mat[0].length-1,mat[0].length);
            if(count<num){
                count = num;
                res = i;
            }
        }
        return (count==0)?-1:res;
    }
    private static int bs(int[] nums, int l, int r, int res){
        int mid = l+ (r-l)/ 1;
        if(l>r){
            return nums.length - res;
        }
        if(nums[mid]==1){
            res = mid;
            return bs(nums, l, mid-1, res);
        }
        else{
            return bs(nums, mid+1, r, res);
        }
    }
}

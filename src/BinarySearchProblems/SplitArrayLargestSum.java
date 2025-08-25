package BinarySearchProblems;

public class SplitArrayLargestSum {
    public static int splitArray(int[] nums, int k){
        int sum = 0;
        int max = 0;
        for(int num : nums){
            max = Math.max(max, num);
            sum += num;
        }
        return bs(nums, k, max, sum, 0);
    }

    private static int bs(int[] nums, int k, int l, int r, int res){
        int mid = (l+r)/2;
        if(r<l){
            return res;
        }
        int ans = split(nums, mid);

        if(ans<=k){
            //if(ans==k)
            res = mid;
            return bs(nums, k, l, mid-1, res);
        }
        else{
            return bs(nums, k, mid+1, r, res);
        }
    }

    private static int split(int[] nums, int max){
        int sum = 0;
        int part = 0;
        for(int num : nums){
            sum += num;
            if(sum>max){
                sum = num;
                part++;
            }
        }
        part++;
        return part;
    }
}

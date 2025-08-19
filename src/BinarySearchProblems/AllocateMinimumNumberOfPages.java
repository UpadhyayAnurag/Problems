package BinarySearchProblems;

public class AllocateMinimumNumberOfPages {
    public static int findPages(int[] nums, int k){
        int sum = 0;
        int max = 0;
        if(k>nums.length){
            return -1;
        }
        for(int num : nums){
            max = Math.max(max, num);
            sum += num;
        }
        return bs(nums, k, max, sum);
    }

    private static int bs(int[] nums, int k, int l, int r){
        int mid = l+(r-l)/2;
        if(r<l){
            return l;
        }
        if(isPossible(nums, mid, k)){
            return bs(nums, k, l, mid-1);
        }
        else{
            return bs(nums, k, mid+1, r);
        }
    }

    private static boolean isPossible(int[] nums, int pages, int students){
        int temp = 0;
        int pageCount = 0;
        for(int num : nums){
            temp += num;
            if(temp>pages){
                temp = num;
                pageCount++;
            }
        }
        pageCount++;
        return pageCount <= students;
    }
}

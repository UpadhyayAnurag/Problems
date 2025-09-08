package BinarySearchProblems;

public class KthElementOfSortedArray {
    public static int findKth(int[] nums1, int[] nums2, int k){
        int n1 = nums1.length;
        int n2 = nums2.length;



        if(n1>n2){
            return findKth(nums2,nums1,k);
        }

        int l = Math.max(0,k-n2);
        int r = Math.min(k,n1);

        while(l<=r){
            int mid1 = (l+r) >> 1;
            int mid2 = k-mid1;

            int l1 = (mid1<=0)? Integer.MIN_VALUE : nums1[mid1-1];
            int l2 = (mid2<=0)? Integer.MIN_VALUE : nums2[mid2-1];
            int r1 = (mid1>=n1)? Integer.MAX_VALUE : nums1[mid1];
            int r2 = (mid2>=n2)? Integer.MAX_VALUE : nums2[mid2];

            if(l1<=r2 && l2<=r1){
                return Math.max(l1,l2);
            }
            else if(l1>r2){
                r = mid1-1;
            }
            else{
                l = mid1+1;
            }
        }
        return -1;
    }
}

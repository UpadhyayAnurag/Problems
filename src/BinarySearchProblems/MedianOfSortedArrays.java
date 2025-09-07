package BinarySearchProblems;

public class MedianOfSortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n1 = nums1.length;
        int n2 = nums2.length;
        if(n1>n2){
            return findMedianSortedArrays(nums2,nums1);
        }
        int partition = (n1+n2+1)/2;

        int n = n1+n2;
        int l = 0;
        int r = n1;
        while(r>=l){
            int mid1 = (l+r) >> 1;
            int mid2 = partition - mid1;

            int l1 = (mid1 == 0) ? Integer.MIN_VALUE : nums1[mid1 - 1];
            int r1 = (mid1 == n1) ? Integer.MAX_VALUE : nums1[mid1];
            int l2 = (mid2 == 0) ? Integer.MIN_VALUE : nums2[mid2 - 1];
            int r2 = (mid2 == n2) ? Integer.MAX_VALUE : nums2[mid2];


            if(l2<=r1 && l1<=r2){
                if(n%2 != 0){
                    return Math.max(l1,l2);
                }
                else{
                    return (Math.max(l1,l2)+Math.min(r1,r2))/2.0;
                }
            }
            else if(l1>r2){
                r = mid1-1;
            }
            else{
                l = mid1+1;
            }
        }
        return 1.00;
    }
}

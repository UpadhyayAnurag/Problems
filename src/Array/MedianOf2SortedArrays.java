package Array;

public class MedianOf2SortedArrays {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        res = merge(nums1,nums2);
        if(res.length %2 != 0){
            return (double)res[res.length/2];
        }
        else{
            double med = (res[res.length/2] + res[res.length/2 - 1])/2.0;
            return med;
        }
    }
    private static int[] merge(int[] nums1,int[] nums2){
        int n = nums1.length;
        int m = nums2.length;
        int[] res = new int[n+m];
        int k = 0;
        int temp1 = 0;
        int temp2 = 0;
        while(temp1<n && temp2<m){
            if(nums1[temp1]<nums2[temp2]){
                res[k] = nums1[temp1];
                temp1++;
                k++;
            }
            else{
                res[k] = nums2[temp2];
                temp2++;
                k++;
            }
        }
        while(temp1<n){
            res[k] = nums1[temp1];
            temp1++;
            k++;
        }
        while(temp2<m){
            res[k] = nums2[temp2];
            temp2++;
            k++;
        }
        return res;
    }
}

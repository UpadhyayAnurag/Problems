package Array;

import java.util.ArrayList;

public class UnionOf2SortedArrays {
    public static ArrayList<Integer> union(int[] nums1, int[] nums2) {
        ArrayList<Integer> lst = new ArrayList<>();
        int s1 = nums1.length;
        int s2 = nums2.length;
        int p1 = 0, p2 = 0;

        while(p1<s1 && p2<s2){
            if(nums1[p1] < nums2[p2]){
                if(lst.isEmpty() || lst.get(lst.size()-1)!=nums1[p1]){  // Either list is empty or the last element is not equals to the smallest element in any of the 2 arrays
                    lst.add(nums1[p1]);
                }
                p1++;
            }
            else if(nums1[p1]>=nums2[p2]){
                if(lst.isEmpty() || lst.get(lst.size()-1)!=nums2[p2]){
                    lst.add(nums2[p2]);
                }
                p2++;
            }
        }

        // CASE WHEN 2nd ARRAY IS SMALLER THAN 1st ARRAY
        while(p1<s1){
            if(lst.isEmpty() || lst.get(lst.size()-1)!=nums1[p1]){
                lst.add(nums1[p1]);
            }
            p1++;
        }

        // CASE WHEN 1st ARRAY IS SMALLER THAN 2nd ARRAY
        while(p2<s2){
            if(lst.isEmpty() || lst.get(lst.size()-1)!=nums2[p2]){
                lst.add(nums2[p2]);
            }
            p2++;
        }
        return lst;
    }
}

package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class PrintAllSubsequences {
    public static List<List<Integer>> printSubsequences(int[] nums){
        List<List<Integer>> result = new ArrayList<>();
        int idx = 0;
        findSubsequence(nums, idx, result, new ArrayList<>());
        return result;
    }

    private static void findSubsequence(int[] nums, int idx, List<List<Integer>> result, List<Integer> lst){
        if(idx == nums.length){
            result.add(new ArrayList<>(lst));
            return;
        }
        lst.add(nums[idx]);
        findSubsequence(nums,idx+1, result, lst);
        lst.removeLast();
        findSubsequence(nums, idx+1, result, lst);
    }
}

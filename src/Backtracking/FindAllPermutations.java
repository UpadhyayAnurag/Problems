package Backtracking;

import java.util.ArrayList;
import java.util.List;

public class FindAllPermutations {
    public static List<List<Integer>> findPermutations(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        helper(nums, new ArrayList<Integer>(),res);
        return res;
    }

    private static void helper(int[] nums, ArrayList<Integer> lst, List<List<Integer>> res) {
        if(lst.size() == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        for (int num : nums) {
            if (!lst.contains(num)) {
                lst.add(num);
                helper(nums, lst, res);
                lst.removeLast();
            }
        }
    }
}

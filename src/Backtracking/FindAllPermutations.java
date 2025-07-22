package Backtracking;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

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





    // SOLUTION USING SET



    public static List<List<Integer>> findPermutations1(int[] nums){
        List<List<Integer>> res = new ArrayList<>();
        Set<Integer> set = new HashSet<>();
        helper1(nums, new ArrayList<Integer>(), res, set);
        return res;
    }

    private static void helper1(int[] nums, ArrayList<Integer> lst, List<List<Integer>> res, Set<Integer> set) {
        if(lst.size() == nums.length){
            res.add(new ArrayList<>(lst));
            return;
        }
        for (int i=0;i<nums.length;i++) {
            if (!set.contains(i)) {
                lst.add(nums[i]);
                set.add(i);
                helper1(nums, lst, res, set);
                set.remove(i);
                lst.removeLast();
            }
        }
    }
}

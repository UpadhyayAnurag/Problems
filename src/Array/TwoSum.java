package Array;

import java.util.HashMap;

public class TwoSum {
    public static int[] TwoSum(int[] nums, int target) {
        int[] result = new int[2];
        // Using HashMap Approach in which I will be Traversing the array and simultaneously keep searching
        // the target - curr in Hashmap.

        HashMap<Integer, Integer> map = new HashMap<>();
        for(int i=0;i<nums.length;i++){
            if(map.containsKey(target-nums[i])){
                result[0] = map.get(target-nums[i]);
                result[1] = i;
                break;
            }
            map.put(nums[i],i);
        }
        return result;
    }
}

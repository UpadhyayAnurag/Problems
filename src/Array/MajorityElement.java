package Array;

public class MajorityElement {

    // Solved Using Boyle-Moore Majority Voting Algorithm
    // Intuition -> If an element occurs in an array more than 1/2 times, then others combined won't be able to cancel each element out.

    public static int majorityElement(int[] nums) {
        int count = 0;
        int candidate = nums[0];
        int countActual = 1;
        for(int num : nums){
            if(count == 0){
                candidate = num;
            }
            count += (candidate == num) ? 1 : -1;
        }
        for(int num : nums){
            if(num == candidate)
                countActual++;
        }
        return (countActual > nums.length/2) ? candidate : -1;
    }
}

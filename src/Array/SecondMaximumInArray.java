package Array;

public class SecondMaximumInArray {
    public static int secondMax(int[] nums) {
        int max = Integer.MIN_VALUE;
        int smax = Integer.MIN_VALUE;

        for (int num : nums) {
            if (num > max) {
                smax = max;
                max = num;
            }
            else if (num > smax && num < max) {
                smax = num;
            }
        }
        return (smax == Integer.MIN_VALUE)? -1 : smax;
    }
}

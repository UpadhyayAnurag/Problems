package Array;

public class LeftRotateArrayOne {
    public static int[] leftRotateArray(int[] arr) {
        int n = arr.length;
        int temp = arr[0]; // storing the first element of array in a variable
        for (int i = 0; i < n - 1; i++) {
            arr[i] = arr[i + 1];
        }
        arr[n - 1] = temp; // assigned the value of variable at the last index
        return arr;
    }
}

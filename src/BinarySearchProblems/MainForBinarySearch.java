package BinarySearchProblems;

public class MainForBinarySearch {
    public static void main(String[] args) {
        // Recursive Binary Search
        System.out.println(RecursiveBinarySearch.binarySearch(new int[]{1,2,3,4,5,6,7,8,9,10}, 10));

        // Implement Lower Bound
        System.out.println(ImplementLowerBound.lowerBound(new int[]{1,2,3,4,5,6,7,8,9,10}, 101));
    }
}

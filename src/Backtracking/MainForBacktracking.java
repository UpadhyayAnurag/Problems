package Backtracking;

public class MainForBacktracking {
    public static void main(String[] args) {
        // Print All Subsequences
        System.out.println(PrintAllSubsequences.printSubsequences(new int[]{1,2,3}));

        // Count Number of Subsequences with sum K
        System.out.println(CountAllSubsequenceWithSumK.totalCount(new int[]{1,2,1,1,1,1,1}, 2));

        // Sum String
        System.out.println(SumString.isSumString("112358"));

        // Find Permutation
        System.out.println(FindAllPermutations.findPermutations(new int[]{1,2,3,4}));
    }
}

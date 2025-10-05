package Strings;

public class MainForString {
    public static void main(String[] args) {
        // Remove Outer Parentheses
        System.out.println(RemoveOuterParentheses.removeOuterParentheses("()()(())((()))((())()())"));

        // Reverse Words In A String
        System.out.println(ReverseWordsInAString.reverseWords("     Hello    This Is    Anurag        "));

        // Longest Common Prefix
        System.out.println(LongestCommonPrefix.longestCommonPrefix(new String[]{"flower","flow","flight"}));

        // Sort Characters of a String By Frequency
        System.out.println(SortCharactersByFrequency.frequencySort("ccaabbb"));
    }
}
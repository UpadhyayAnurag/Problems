package Strings;

public class LongestCommonPrefix {
    public static String longestCommonPrefix(String[] strs) {
        int small = strs[0].length();
        String res = strs[0];
        StringBuilder sb = new StringBuilder();

        // Find Smallest String from the given Strings
        for(String s : strs){
            if(s.length()<small){
                small = s.length();
                res = s;
            }
        }

        // Compare with each element using startsWith()
        int i = 0;
        while(i<strs.length){
            if(strs[i].startsWith(res)){
                i++;
            }
            else{
                sb = new StringBuilder(res);
                sb.deleteCharAt(sb.length()-1);
                res = sb.toString();
            }
        }
        return res;
    }
}

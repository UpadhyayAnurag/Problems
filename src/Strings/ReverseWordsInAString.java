package Strings;

public class ReverseWordsInAString {
    public static String reverseWords(String s) {
        String[] arr = s.split("\\s+");
        StringBuilder sb = new StringBuilder();
        for(int i=arr.length-1;i>=0;i--){
            sb.append(arr[i]);
            sb.append(" ");
        }
        return sb.toString().trim();
    }
}

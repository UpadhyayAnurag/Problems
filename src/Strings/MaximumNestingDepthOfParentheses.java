package Strings;

public class MaximumNestingDepthOfParentheses {
    public static int maxDepth(String s) {
        int maxCount = 0;
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
                maxCount = Math.max(maxCount, count);
            }
            else if(ch==')'){
                count--;
            }
        }
        return maxCount;
    }
}

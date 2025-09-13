package Strings;

public class RemoveOuterParentheses {
    public static String removeOuterParentheses(String s) {
        StringBuilder sb = new StringBuilder();
        int count = 0;
        for(char ch : s.toCharArray()){
            if(ch=='('){
                count++;
            }
            if(ch=='(' && count!=1){
                sb.append(ch);
            }
            else if(ch==')' && count!=1){
                sb.append(ch);
                count--;
            }
            else if(ch==')' && count==1){
                count--;
            }
        }
        return sb.toString();
    }
}

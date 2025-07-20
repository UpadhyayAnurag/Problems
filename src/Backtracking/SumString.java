package Backtracking;

/* Approach Explained
*
* In this question we need to find the sequences such that if the sum of previous 2 numbers equals to the next one,
* Ex - 112358
*       In the above example: 1+1 = 2
*                             1+2 = 3
*                             2+3 = 5
*                             3+5 = 8
*  Hence the given string is sum String
*
*
*   Solution Approach :
*           isSumString()  -> Covers all possible length combinations
*           checkSum()   -> Breaks string according to lengths provided by isSumString() -> Then calculates third string and
*                               matches both strings and takes respective actions
*           calcSum()   ->  Primarily focuses on calculating a sum of 2 provided sequences without actually converting them
*                               into an Integer
*
* */


public class SumString {
    public static boolean isSumString(String s){
        int n = s.length();

        for(int len1=1; len1<n;len1++){
            for(int len2=1; len1+len2<n;len2++){
                if(checkSum(s,0,len1,len2)){
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkSum(String s, int start, int len1, int len2){

        String part1 = s.substring(start, start+len1);
        String part2 = s.substring(start+len1, start+len1+len2);

        if(part1.length()>1 && part1.charAt(0)=='0' ||
        part2.length()>1 && part2.charAt(0)=='0'){
            return false;
        }

        String calculatedSum = calcSum(part1, part2);
        int calculatedSumLen = calculatedSum.length();

        if(start + len1 + len2 + calculatedSumLen > s.length()){
            return false;
        }

        if(calculatedSum.length()>1 && calculatedSum.charAt(0)=='0'){
            return false;
        }

        String part3 = s.substring(start+len1+len2, start+len1+len2+calculatedSumLen);

        if(part3.equals(calculatedSum)){
            if(start+len1+len2+calculatedSumLen==s.length()){
                return true;
            }
            return checkSum(s, start+len1, len2, calculatedSumLen);
        }
        return false;
    }

    private static String calcSum(String s1, String s2){
        int l1 = s1.length();
        int l2 = s2.length();

        if(l1<l2){
            String temp = s1;
            s1 = s2;
            s2 = temp;
        }

        l1 = s1.length();
        l2 = s2.length();

        String sum = "";
        int carry = 0;

        for(int i=0;i<l2;i++){
            int d1 = s1.charAt(s1.length()-1-i) - '0';
            int d2 = s2.charAt(s2.length()-1-i) - '0';

            int digit = (d1+d2+carry) % 10;
            carry = (d1+d2+carry) / 10;

            sum = (char)(digit+'0') + sum;
        }

        for(int i=l2;i<l1;i++){
            int d1 = s1.charAt(s1.length()-1-i) - '0';

            int digit = (d1+carry) % 10;
            carry = (d1+carry) / 10;

            sum = (char)(digit+'0') + sum;
        }

        if(carry > 0){
            sum = (char) (carry+'0') + sum;
        }

        return sum;
    }
}

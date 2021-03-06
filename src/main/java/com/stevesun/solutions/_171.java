package com.stevesun.solutions;

/**Given a column title as appear in an Excel sheet, return its corresponding column number.

 For example:

 A -> 1
 B -> 2
 C -> 3
 ...
 Z -> 26
 AA -> 27
 AB -> 28
 */
public class _171 {

    public int titleToNumber(String s) {
        char[] c = s.toCharArray();
        int result = 0;
        for(int i = s.length()-1; i >= 0; i--){
            result += (c[i]-64) * ((int) Math.pow(26, s.length()-i-1));//The ASCII value of A is 65
        }
        return result;
    }
    
}

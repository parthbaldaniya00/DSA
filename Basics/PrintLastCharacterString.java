package Basics;

public class PrintLastCharacterString {
    public static void main(String[] args) {
        Solution sol = new Solution();
        String s = "example";
        
        char ans = sol.lastChar(s);
        System.out.println("The last character is: " + ans);
    }
}

class Solution {
    public char lastChar(String s) {
        
        return s.charAt(s.length() - 1);
    }

    
}
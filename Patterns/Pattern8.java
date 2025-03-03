package Patterns;

public class Pattern8 {
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern8(N);
    }
}

class Solution {
    public void pattern8(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i-1; j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*n-(2*i-1)); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
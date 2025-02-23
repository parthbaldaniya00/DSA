package Patterns;

public class Pattern5 {
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern5(N);
    }
}

class Solution {
    public void pattern5(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i+1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}

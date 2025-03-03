package Patterns;

public class pattern7 {
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern7(N);
    }
}

class Solution {
    public void pattern7(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=(n-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i-1); j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
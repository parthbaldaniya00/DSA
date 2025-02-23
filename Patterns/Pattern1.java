package Patterns;

class Pattern1 {
    public static void main(String[] args) {
        int N = 4;

        // Create an instance of the Solution class
        Solution sol = new Solution();

        sol.pattern1(N);
    }
}

class Solution {
    public void pattern1(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=n; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
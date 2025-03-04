package Patterns;

public class Pattern10 {
    public static void main(String[] args) {
        int N = 5;

        // Create an instance of Solution class
        Solution sol = new Solution();

        sol.pattern10(N);
    }
}

class Solution {
    public void pattern10(int n) {
        for(int i=1; i<=n; i++){
            for(int j=1; j<=i; j++){
                if((i+j) % 2 == 0 ){
                    System.out.print("1 ");
                }else{
                    System.out.print("0 ");
                }
            }
            System.out.println();
        }
    }
}
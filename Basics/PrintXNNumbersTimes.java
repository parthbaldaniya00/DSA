package Basics;

public class PrintXNNumbersTimes {
    public static void main(String[] args) {
        Solution sol = new Solution();
        int X = 7, N = 5;
        
        sol.printX(X, N);
    }
}

class Solution {
    public void printX(int X, int N) {
        while(N > 0){ 
            if(N == 1){
                System.out.print(X);
            }else{
                System.out.print(X + " ");
            }
           
            N--;
        }
        System.out.println();
    }
}
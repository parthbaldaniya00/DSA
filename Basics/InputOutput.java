package Basics;
import java.util.Scanner;

public class InputOutput {
    public static void main(String[] args) {
        Solution sol = new Solution();
        
        Scanner sc = new Scanner(System.in);
        
        sol.printNumber(sc);
    }
}

class Solution {
    public void printNumber(Scanner sc) {
        
        int number;
        
        number = sc.nextInt();
        
        System.out.print(number);
    }    
}

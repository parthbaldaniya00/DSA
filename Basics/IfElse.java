package Basics;
import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Solution solution = new Solution();

        Scanner sc = new Scanner(System.in);
        int age = sc.nextInt();

        solution.isAdult(age);
    }
}

class Solution {
    public void isAdult(int age) {
        if(age >= 18){
            System.out.print("Adult");
        }else{
            System.out.print("Teen");
        }
    }
}

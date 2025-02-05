package Basics;

public class SumFirstLastElementArray {
    public static void main(String[] args) {
        int[] nums = {2, 3, 4, 5, 6};
        
        Solution sol = new Solution();

        int ans = sol.sumOfFirstAndLast(nums);

        System.out.println("Sum of first and last element: " + ans);
    }
}

class Solution {
    public int sumOfFirstAndLast(int[] nums) {
        int sum = nums[0]+nums[nums.length-1];
        return sum;
    }
}
package org.example.leetcode;

public class FindMaxConsecutiveOnes {
    public int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int temp = 0;
        for (int item : nums) {
            temp = item == 1 ? temp + 1 : 0;
            if (temp > max) {
                max = temp;
            }
        }
        return max;
    }
}

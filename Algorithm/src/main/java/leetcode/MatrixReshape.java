package leetcode;

import java.util.LinkedList;

public class MatrixReshape {
    public int[][] matrixReshape1(int[][] nums, int r, int c) {
        int nr = nums.length;
        int nc = nums[0].length;
        if (r * c != nr * nc) {
            return nums;
        } else {
            int[][] nnums = new int[r][c];
            LinkedList<Integer> temp = new LinkedList<>();
            //int[] temp = new int[r * c];
            for (int[] items : nums) {
                for (int item : items) {
                    temp.add(item);
                }
            }
            for (int i = 0; i < nnums.length; i++) {
                for (int j = 0; j < nnums[0].length; j++) {
                    nnums[i][j] = temp.removeFirst();
                }
            }
            return nnums;
        }
    }

    public int[][] matrixReshape(int[][] nums, int r, int c) {
        // 原来的行和列
        int or = nums.length;
        int oc = nums[0].length;
        if (r * c != or * oc) {
            return nums;
        } else {
            int[][] nnums = new int[r][c];
            for (int i = 0; i < r; i++) {
                for (int j = 0; j < c; j++) {
                    // nnums[i][j]对应一维数组下标为c*i+j的数
                    int n = c * i + j;
                    nnums[i][j] = nums[n / oc][n % oc];
                }
            }
            return nnums;
        }
    }
}

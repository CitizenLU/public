package leetcode;

import org.junit.Assert;
import org.junit.Test;

public class MatrixReshapeTest {

    @Test
    public void matrixReshape1() {
        int[][] nums={{1,2},{3,4}};
        int r=1;
        int c=4;
        MatrixReshape matrixReshape=new MatrixReshape();
        int[][] actual=matrixReshape.matrixReshape(nums,r,c);
        int[][] expect={{1,2,3,4}};
        Assert.assertArrayEquals(expect,actual);
    }

    @Test
    public void matrixReshape() {
        int[][] nums={{1,2},{3,4}};
        int r=1;
        int c=4;
        MatrixReshape matrixReshape=new MatrixReshape();
        int[][] actual=matrixReshape.matrixReshape(nums,r,c);
        int[][] expect={{1,2,3,4}};
        Assert.assertArrayEquals(expect,actual);
    }
}
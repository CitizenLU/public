package org.example.leetcode;

import org.junit.Assert;
import org.junit.Test;

import static org.junit.Assert.*;

public class MergeTest {

    @Test
    public void merge() {
        Merge merge=new Merge();
        int[] nums1={1,2,3,0,0,0};
        int m=3;
        int[] nums2={2,5,6};
        int n=3;
        merge.merge(nums1,m,nums2,n);
        int[] expected={1,2,2,3,5,6};
        Assert.assertArrayEquals(expected,nums1);
    }
}
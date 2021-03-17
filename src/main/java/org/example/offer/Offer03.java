package org.example.offer;

import java.util.HashSet;

public class Offer03 {
    public int findRepeatNumber(int[] nums){
        HashSet<Integer> hashSet=new HashSet<>();
        for (int x:nums){
            if (!hashSet.contains(x)){
                hashSet.add(x);
            }else {
                return x;
            }
        }
        return -1;
    }

    public boolean contain(int[] nums, int x){
        for (int i:nums){
            if (i==x) {
                return true;
            }
        }
        return false;
    }
}

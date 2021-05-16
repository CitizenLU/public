package org.example.leetcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Demo {
    public float sum(){
        float a=0.1f;
        float b=0.2f;
        float c=a+b;
        System.out.println(c);
        return c;
    }

    public static void main(String[] args) {
        System.out.println(new Demo().sum());
    }

//    public void arraysCopy(int[] source) {
//        int[] result = Arrays.copyOf(source, source.length);
//    }
//
//    public void systemCopy(int[] source) {
//        int[] result = new int[source.length];
//        System.arraycopy(source, 0, result, 0, source.length);
//    }
//
//    public void forCopy(int[] source) {
//        int[] result = new int[source.length];
//        for (int i = 0; i < source.length; i++) {
//            result[i] = source[i];
//        }
//    }
}

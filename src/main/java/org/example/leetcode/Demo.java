package org.example.leetcode;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.*;

public class Demo {
    public String address;
    public Demo(String address){
        this.address=address;
    }
    public int hashCode(){
        return address.hashCode();
    }

    public static void main(String[] args) {

        try (FileInputStream fileInputStream = new FileInputStream("");
             FileOutputStream fileOutputStream = new FileOutputStream("")) {
        } catch (IOException e) {
            System.out.println("");
        }
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
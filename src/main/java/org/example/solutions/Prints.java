package org.example.solutions;

public class Prints {
    //打印数组
    public static void printArrays(int[] array)
    {
        int n=array.length;
        System.out.print("[");
        for (int i=0;i<n-1;i++)
        {
            System.out.print(array[i]+",");
        }
        System.out.print(array[n-1]+"]");
        System.out.println();
    }
}

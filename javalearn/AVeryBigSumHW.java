package javalearn;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AVeryBigSumHW {
//    static int aVeryBigSum(int[] ar) {
//        long sum = 0;
//        for(long i = 0; i<ar.length; i++){
//            sum = sum + ar[(int) i];
//        }
//        return (int) sum;
//    }

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.print("Enter length of array: ");
        int n = in.nextInt();
        int arr[] = new int[n];
        for(int arr_i=0; arr_i < n; arr_i++){
            System.out.print("enter the element-"+(arr_i+1)+": ");
            arr[arr_i] = in.nextInt();
        }
        BigInteger sum=BigInteger.valueOf(0);
        for(int i=0;i<arr.length;i++)
        {
            sum=sum.add(BigInteger.valueOf(arr[i]));
            System.out.print(BigInteger.valueOf(arr[i])+" ");
        }
        System.out.println();
        System.out.println(sum);
    }
}

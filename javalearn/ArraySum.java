package javalearn;

import java.util.List;

public class ArraySum {
    public static int simpleArraySum(int[] ar){
        int sum = 0;
        int n = 6;
        for(int i = 0; i<ar.length; i++){
           sum = sum + ar[i];
        }
        return sum;

    }
    public static void main(String[] args) {
           int ar[] = new int[]{11,11,11,11,11,11};
        System.out.println(simpleArraySum(ar));

    }
}

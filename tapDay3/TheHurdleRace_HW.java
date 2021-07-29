package tapDay3;

import java.util.Scanner;

public class TheHurdleRace_HW {
    static void theHurdleRace(){
         int max = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the K value: ");
         int k = sc.nextInt();
        System.out.println("Enter the number: ");
        int n = sc.nextInt();

        for(int i = 0; i<n; i++){
            System.out.println("Enter the element-"+(i+1)+": ");
            max = Math.max(max,sc.nextInt());
        }
        if(k-max < 0){
            System.out.println(Math.abs(k-max));
        }else {
            System.out.println(0);
        }
    }

    public static void main(String[] args) {
        System.out.println("Enter your Hurdle Race Values: ");
          theHurdleRace();
    }
}

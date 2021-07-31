package tapDay4;

import java.util.ArrayList;

public class SherlockAndArray {
    static String balancedSums(ArrayList<Integer> arr){
        int totalSum = 0;
        int leftSum = 0;
        int rightSum;


        for(int i =0; i<arr.size(); i++){
            totalSum = totalSum + arr.get(i);
        }
        for(int i =0; i<arr.size(); i++){
            rightSum = totalSum -arr.get(i) - leftSum;
            if(leftSum == rightSum){
                return "YES";
            }else {
                leftSum = leftSum + arr.get(i);
            }
        }
        return "NO";

    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(1);
        arr.add(4);
        arr.add(1);
        arr.add(1);
        balancedSums(arr);

    }
}

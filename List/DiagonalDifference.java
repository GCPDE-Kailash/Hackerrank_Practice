package List;

import java.util.ArrayList;
import java.util.Arrays;

public class DiagonalDifference {
    public static int diagonalDifference(ArrayList<ArrayList<Integer>> arr) {
        int n =3, d1 =0,d2=0;
        for(int i = 0; i<n; i++){
            for(int j=0;j<n;j++){
                if(i==j){
                    d1 += arr.get(i).get(j);
                }
                if(i==n-1-j){
                    d2 += arr.get(i).get(j);
                }
            }
        }
        return Math.abs(d1-d2);

    }
    public static void main(String[] args) {
        ArrayList<ArrayList<Integer> > arr
                = new ArrayList<ArrayList<Integer> >();
        arr.add(new ArrayList<Integer>(Arrays.asList(11,2,4)));
        arr.add(new ArrayList<Integer>(Arrays.asList(4,5,6)));
        arr.add(new ArrayList<Integer>(Arrays.asList(10,8,-12)));

        System.out.println(diagonalDifference(arr));
    }

}

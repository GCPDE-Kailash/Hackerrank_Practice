package tapAssignment;

import java.util.ArrayList;
import java.util.List;

public class MigratoryBirdsProblem {
    static int migratoryBirds(List<Integer> arr){
        int n =6;
        int res[] = new int[n];
        for(int i =0; i<arr.size(); i++){
            int index = arr.get(i);
            res[index]++;
        }
        int type =0, max =0;
        for(int i =0; i<n; i++){
            if(res[i]> max){
                max = res[i];
                type =i;
            }
        }
        return type;
    }

    public static void main(String[] args) {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(1);
        arr.add(4);
        arr.add(4);
        arr.add(4);
        arr.add(5);
        arr.add(3);
        System.out.println(migratoryBirds(arr));

    }
}

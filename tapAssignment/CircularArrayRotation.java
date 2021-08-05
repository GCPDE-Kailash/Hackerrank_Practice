package tapAssignment;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class CircularArrayRotation {
    public static List<Integer> circularArrayRotation(List<Integer> a, int k, List<Integer> q) {
     k = k%a.size();
     int l = a.size();
     for(int i =0; i<q.size();i++){
         int pos = (q.get(i) -k+l)%l;
         q.set(i, a.get(pos));
     }
     return q;
    }

    public static void main(String[] args) {
        // THIS PART IS NOT CLEAR IT'S CIRCULAR LINKED LIST, LOGIC PARTS CORRECT!!
        ArrayList<Integer> a = new ArrayList<>();
        a.add(1);
        a.add(2);
        a.add(3);
        List<Integer> k = Collections.singletonList(2);
        int q = 3;
        System.out.println(circularArrayRotation(k,q,a));

    }
}

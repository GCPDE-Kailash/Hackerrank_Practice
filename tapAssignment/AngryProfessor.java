package tapAssignment;

import java.util.ArrayList;
import java.util.List;

public class AngryProfessor {
    static String angryProfessor(int k, List<Integer> a) {

        int c = 0;
            for (int i = 0; i < a.size(); i++) {
                if (a.get(i) <= 0) {
                    c++;
                }
            }

          return((c>=k) ? "NO" : "YES");
    }


    public static void main(String[] args) {
        int k = 2;
        ArrayList<Integer> a = new ArrayList<>();
        a.add(0);
        a.add(1);
        a.add(2);
        a.add(1);
       // a.add(2);
        System.out.println(angryProfessor(k,a));
    }
}

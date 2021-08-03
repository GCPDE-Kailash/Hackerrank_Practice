package tapDay3;


import java.util.ArrayList;
import java.util.List;

public class TheHurdleRace_HW {
    static int theHurdleRace(int k, List<Integer> height) {
        int max = height.get(0);
        for (int i = 0; i < height.size(); i++) {
            if (height.get(i) > max) {
                max = height.get(i);
            }
        }
        if(k<max) {
            return max - k;
        }else {
            return 0;
        }
    }
    public static void main(String[] args) {
        ArrayList<Integer> height = new ArrayList<>();
        height.add(1);
        height.add(2);
        height.add(3);
        height.add(3);
        height.add(2);
        int k = 1;
        int n = 5;
        System.out.println(theHurdleRace(k,height));
    }
}

package BlueMount;

import java.util.ArrayList;
import java.util.List;

public class FindElement {
    public static String findNumber(List<Integer> arr, int k) {
        // Write your code here
        for (int i = 0; i < arr.size(); i++) {
            if (arr.get(i) == k) {
                return "YES";
            }
        }
        return "NO";
    }

    public static void main(String[] args) {
        ArrayList<Integer> res = new ArrayList<>();
        int k =5;
        res.add(4);
        res.add(3);
        res.add(7);
        res.add(0);
        res.add(9);


        System.out.println(findNumber(res,k));

    }
}

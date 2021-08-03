package tapDay3;
import java.util.Arrays;

public class TheHurdleRace_HW {
    static int theHurdleRace() {

        int k =7; int n = 5;
        int[] height = {2,5,4,5,2};
        int a[] = new int[n];
        for (int i = 0; i < n; i++) {

        }
        Arrays.sort(a);
        int max = a[n - 1];
        if (k >= a[n - 1]) {
            System.out.println(0);
        } else {
            System.out.println(a[n - 1] - k);
        }
        return max;
    }

    public static void main(String[] args) {
        int[] height = new int[]{1, 2, 3, 3, 2};
        int k = 1;
        System.out.println(theHurdleRace());
    }
}

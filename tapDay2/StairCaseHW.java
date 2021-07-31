package tapDay2;

public class StairCaseHW {
    static void  stairCase(int n) {

        for (int i = 0; i < n; i++) {
            for (int j = n - 1; j > i; j--) {
                System.out.print(" ");
            }
            for (int j = 0; j <= i; j++) {

                System.out.print("#");
            }
            System.out.println();
        }


    }

    public static void main(String[] args) {
        //int n;
        //System.out.println(stairCase(n));
        int n = 6;
        stairCase(n);
    }
}

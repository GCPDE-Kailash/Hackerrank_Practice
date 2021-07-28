package tapDay3;

public class NumberJumpLine {
    static String kangaroo(int x1, int v1, int x2, int v2) {
        int newX1 = x1;
        int newX2 = x2;

        if(v1<v2){
            return "NO";
        }

        while (newX1 < newX2) {
            newX1 = newX1 + v1;
            newX2 = newX2 + v2;
            if (newX1 == newX2) {
                return "YES";
            }
        }
        return "NO";
    }
    public static void main(String[] args) {
        int x1 = 0;
        int v1 = 3;
        int x2 = 2;
        int v2 = 1;
        System.out.println(kangaroo(x1,v1,x2,v2));
    }
}

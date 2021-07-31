package tapDay2;

public class FindDigits {
    static int findDigitsDivisor(int n){
      int t = n;
      int count = 0;
      int ld = 0; // ld = last digit

        while (t>0){
            ld = t%10;
            if(ld !=0){
            if(n%ld==0){
                count++;
              }
            }
            t = t/10;
        }
        return count;
    }
    public static void main(String[] args) {
        int n = 1012;
        System.out.println(findDigitsDivisor(n));

    }
}

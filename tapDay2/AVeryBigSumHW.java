package tapDay2;

public class AVeryBigSumHW {
    static long aVeryBigSum(long[] ar) {
        long sum =0;
        for(long x: ar){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        long [] ar = new long[1+3+5+6];
        System.out.println(aVeryBigSum(ar));
    }

}

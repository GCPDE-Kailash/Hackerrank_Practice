package tapDay2;

import java.util.Collections;
import java.util.List;

public class AVeryBigSumHW {
    static long aVeryBigSum(List<Long> ar) {
        long sum =0;
        for(long x: ar){
            sum += x;
        }
        return sum;
    }

    public static void main(String[] args) {
        long ar = new Long(8);
        System.out.println(aVeryBigSum(Collections.singletonList(ar)));
    }
}

package tapAssignment;

import java.util.ArrayList;
import java.util.List;

public class BirthdayCakeCandles {
    static int birthdayCakeCandles(List<Integer> candles) {
        int max = candles.get(0);
        for (int i = 0; i < candles.size(); i++) {
            if (candles.get(i) > max) {
                 max = candles.get(i);
                System.out.println(max);
            }
        }
        int c =0;
        for(int i=0; i<candles.size(); i++){
            if (candles.get(i) == max){
                c++;
            }
        }
        return c;
    }
    public static void main(String[] args) {
        ArrayList<Integer> candles = new ArrayList<>();
        candles.add(3);
        candles.add(2);
        candles.add(1);
        candles.add(3);
        System.out.println(birthdayCakeCandles(candles));
    }
}

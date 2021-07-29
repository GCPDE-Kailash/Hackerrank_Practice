package tapDay4;

import java.util.ArrayList;

public class BreakingTheRecords {

    static ArrayList breakingRecords(ArrayList<Integer> scores){
        int max = scores.get(0);
        int min = scores.get(0);
        int maxCount = 0;
        int minCount = 0;

        for(int i =1; i<scores.size(); i++){
            if(scores.get(i)> max){
                max = scores.get(i);
                maxCount++;
            }
            if(scores.get(i)< min){
                min = scores.get(i);
                minCount++;
            }
        }
          ArrayList result = new ArrayList();
        result.add(maxCount);
        result.add(minCount);
        return result;
    }
    public static void main(String[] args) {
        ArrayList<Integer> scores = new ArrayList<Integer>();
        scores.add(10);
        scores.add(5);
        scores.add(20);
        scores.add(20);
        scores.add(4);
        System.out.println(breakingRecords(scores));
    }
}

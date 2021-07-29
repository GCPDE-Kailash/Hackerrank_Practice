package tapDay4;

import java.util.ArrayList;

public class BirthdayBar {
    static int birthdayBar(ArrayList<Integer> s,int d, int m){
        int count = 0;
        for(int i = 0; i<=s.size()-m ;i++){
            int sum = 0;
            for(int j=i; j<i+m; j++){
                sum = sum + s.get(j);
            }if(sum==d){
                count++;
            }
        }
        return count;
    }
    public static void main(String[] args) {
        ArrayList<Integer> s = new ArrayList<>();
        s.add(2);
        s.add(2);
        s.add(1);
        s.add(3);
        s.add(2);
        System.out.println(birthdayBar(s,4,2));

    }
}

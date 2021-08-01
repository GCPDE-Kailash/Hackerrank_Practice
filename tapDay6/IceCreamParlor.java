package tapDay6;

import java.util.ArrayList;

public class IceCreamParlor {
    static  ArrayList<Integer> iceCreamParlor(int m, ArrayList<Integer> ar){
         ArrayList<Integer> res = new ArrayList<Integer>();
        for(int i=0; i<ar.size()-1; i++){
            for(int j=i+1; j<ar.size(); j++){
                if(ar.get(i)+ar.get(j) ==m){
                    res.add(i+1);
                    res.add(j+1);
                    break;
                }
            }
        }
        return res;
    }
    public static void main(String[] args) {

    }
}

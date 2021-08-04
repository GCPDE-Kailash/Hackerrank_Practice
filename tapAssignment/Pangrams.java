package tapAssignment;

import java.util.Locale;

public class Pangrams {
    static String pangramString(String s){

         s = s.toLowerCase();
        for(char c = 'a'; c<= 'z'; c++){
            if(s.indexOf(c) <0){
                return "not pangram";
            }
        }
        return "pangram";
    }
    public static void main(String[] args) {
        String s = "The quick brown fox jumps over the lazy dog";
        System.out.println(pangramString(s));
    }
}

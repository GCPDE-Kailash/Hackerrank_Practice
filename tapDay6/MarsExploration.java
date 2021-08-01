package tapDay6;

public class MarsExploration {
    static int marsExploration(String s){
       int mistake = 0;
       for(int i=0; i<s.length(); i=i+3){
           if(s.charAt(i) != 'S' ){
               mistake++;
           }
           if (s.charAt(i+1) != 'O'){
               mistake++;
           }
           if (s.charAt(i+2) != 'S'){
               mistake++;
           }
       }
       return mistake;
    }

    public static void main(String[] args) {
        String s = "SOSSPSSQSSOR";
        System.out.println(marsExploration(s));
    }
}

package tapDay5;

public class AlternatingCharacters {
    static int alternatingCharacters(String s){
       int count = 0;
        for(int i =1; i<s.length(); i++){
            if(s.charAt(i)==s.charAt(i-1)){
                count++;
            }
        }
        return  count;


    }
    public static void main(String[] args) {
        String s = "AABAAB";
        System.out.println(alternatingCharacters(s));
    }
}

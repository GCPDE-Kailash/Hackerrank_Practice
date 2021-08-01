package tapDay5;

public class RepeatedString {
    static int repeatedString(String s, int n){
        int countA=0;
        for(int i=0; i<s.length(); i++){
            if(s.charAt(i) == 'a'){
                countA++;
            }
        }
        countA = countA * (n/s.length());
        for(int i =0; i<(n%s.length()); i++){
            if(s.charAt(i)=='a'){
                countA++;
            }
        }
        return countA;
    }

    public static void main(String[] args) {
        String s = "aba";
        int n = 10;
        System.out.println(repeatedString(s,n));
    }
}

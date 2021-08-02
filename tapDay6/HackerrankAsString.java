package tapDay6;

public class HackerrankAsString {
    static String hackerrankInString(String s){
        int i=0,j=0;
        String hk = "hackerrank";
        while (i<hk.length() && j<s.length()){
            if(hk.charAt(i) == s.charAt(j)){
                i++;
                j++;
            }else {
                j++;
            }
        }
        if(i==hk.length()){
            return "YES";
        }else {
            return "NO";
        }
    }

    public static void main(String[] args) {
        String s = "haaackeaarranaak";
        System.out.println(hackerrankInString(s));
    }
}

package tapDay6;

public class CamelCase {
    static int camelcase(String s){
        int count = 0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>= 'A' && s.charAt(i)<='Z'){
                count++;
            }
        }
        return count+1;

    }

    public static void main(String[] args) {
        String s = "saveChangesInTheEditor";
        System.out.println(camelcase(s));
    }
}

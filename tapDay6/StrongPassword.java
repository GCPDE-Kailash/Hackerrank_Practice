package tapDay6;

public class StrongPassword {
    static int passwordMinimumNumber(String s,int n){
        int addCount =0;
        int digitCount=0;
        int upperCount =0;
        int lowerCount =0;
        int specialCount =0;
        for(int i =0; i<s.length(); i++){
            if(s.charAt(i)>='0' && s.charAt(i)<='9') {
                digitCount++;
            } else if (s.charAt(i)>='A' && s.charAt(i)<='Z'){
                upperCount++;
            }else if(s.charAt(i)>='a' && s.charAt(i)<= 'z'){
                lowerCount++;
            }else {
                specialCount++;
            }
        }
        if(digitCount ==0){
            addCount++;
            digitCount++;
        }
        if(lowerCount ==0){
            addCount++;
            lowerCount++;
        }
        if(upperCount==0){
            addCount++;
            upperCount++;
        }
        if(specialCount==0){
            addCount++;
            specialCount++;
        }
        int total = digitCount + lowerCount + upperCount + specialCount;

        if(total -6 <0){
            addCount += 6 - total;
        }
        return addCount;
    }

    public static void main(String[] args) {
        String s = "2@gfhA";
        int n = 6;
        System.out.println(passwordMinimumNumber(s,n));
    }
}

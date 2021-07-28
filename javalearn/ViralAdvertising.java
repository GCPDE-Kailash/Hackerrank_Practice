package javalearn;

public class ViralAdvertising {
    static int viralAdvertise(int n){
        int shared = 5;
        int like = 0;
        int total= 0;

        for(int i = 1; i<=n; i++){
            like = shared/2;
            total = total+ like;
            shared = like *3;
        }
        return total;
    }
    public static void main(String[] args) {
        int n = 4;
        int total = viralAdvertise(n);
        System.out.println(total);

    }
}

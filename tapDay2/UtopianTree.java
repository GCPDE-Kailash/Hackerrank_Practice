package tapDay2;

public class UtopianTree {
    static int utopianTree(int n){
        int t = 1;

        for(int i = 1; i<=n; i++){
            if(i%2==0){
                t = t+1;
            }else {
                t = t*2;
            }
        }
        return t;
    }

    public static void main(String[] args) {
	  int n = 5;
	  int t = utopianTree(n);
        System.out.println(t);

    }
}

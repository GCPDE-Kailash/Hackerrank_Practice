package tapDay3;

public class ChocolateFeast {
    static int chocofeast(int n, int c, int m){
        int choco = n/c;
        int wrap = choco;
        int newChoco = 0;

        while (wrap >= m){
            newChoco = wrap /m;
            choco = choco + newChoco;
            wrap = (wrap % m) + newChoco;
        }
        return choco;
    }
    public static void main(String[] args) {
        int n = 15;
        int c = 3;
        int m = 2;
        System.out.println(chocofeast(n,c,m));
    }
}

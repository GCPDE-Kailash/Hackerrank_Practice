package tapDay2;

public class CatAndMouse {
    static String catAndMouse(int x, int y, int z){
        int d1 =0;
        int d2=0;

        if(x<=z){
            d1 = z-x;
        }else {
            d1= x-z;
        }
        if(y<=z){
            d2= z-y;
        }else {
            d2 = y-z;
        }
        if(d1==d2){
            return "Mouse C";
        }else if(d1<d2){
            return "Cat A";
        }else {
            return "Cat B";
        }
    }
    public static void main(String[] args) {
        int x= 2;
        int y = 5;
        int z = 4;
        String res = catAndMouse(x,y,z);
        System.out.println(res);

    }
}

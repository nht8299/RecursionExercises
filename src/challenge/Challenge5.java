package challenge;

public class Challenge5 {
    public static int GCD(int x,int y){
        if (x % y == 0){
            return y;
        }else
            return GCD(y,x % y);
    }

    public static void main(String[] args) {
        System.out.println(GCD(27,45));
    }
}

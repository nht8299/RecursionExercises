package challenge;

public class Challenge12 {
    public static int findP(int x,int y){
        if (y == 0) return 1;
        return x * findP(x,y-1);
    }

    public static void main(String[] args) {
        System.out.println(findP(3,3));
    }
}

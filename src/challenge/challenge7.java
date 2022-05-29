package challenge;

public class challenge7 {
    public static int findP(int n,int start){
        if (n== 0){
            return 1;
        }
        if (start == 2*n +1){
            return start;
        }
        return start*findP(n,start + 2);
    }

    public static void main(String[] args) {
        System.out.println(findP(2,1));
    }
}

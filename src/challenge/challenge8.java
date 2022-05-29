package challenge;

public class challenge8 {
    public static int findS(int n,int start){
        if (n== 0){
            return 1;
        }
        if (start == 2*n +1){
            return start;
        }
        return start*findS(n,start + 2);
    }

    public static void main(String[] args) {
        System.out.println(findS(2,1));
    }
}

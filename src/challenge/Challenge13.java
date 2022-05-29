package challenge;

public class Challenge13 {
    public static double findS(int n){
        if (n == 1) return 1;
        return (1.0/n) + findS(n-1);
    }

    public static void main(String[] args) {
        System.out.printf("%.2f",(findS(3)));
    }
}

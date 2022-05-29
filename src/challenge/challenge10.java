package challenge;

public class challenge10 {
    static int factorial(int n){
        if (n == 0)
            return 1;
        else
            return(n * factorial(n-1));
    }
    public static int findS(int n){
        if (n == 1) return 1;
        else {
            int current = factorial(n);
            return findS(n -1 )+current;
        }
    }

    public static void main(String[] args) {
        System.out.println(findS(2));
    }
}

package challenge;

public class Challenge11 {
    public static int findP(int n) {
        if (n == 1)
            return 1;
        int current = (int) Math.pow(n,2);
        return findP(n -1)+current;
    }

    public static void main(String[] args) {
        System.out.println(findP(3));
    }
}

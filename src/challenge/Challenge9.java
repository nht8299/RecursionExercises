package challenge;

public class Challenge9 {
        public static int findS(int n) {
            if (n == 1) return 1;

            int current = (int) Math.pow(-1, n + 1) * n;
            return current + findS(n - 1);

        }
    public static void main(String[] args) {
        System.out.println(findS(10));
    }
}

package challenge;

public class Challenge1 {
    public static void reverseNumber(int number) {
        if (number < 10) {
            System.out.print(number);
            return;
        } else
            System.out.print(number % 10);
        reverseNumber(number / 10);
    }

    public static void main(String[] args) {
        reverseNumber(1000);
    }
}
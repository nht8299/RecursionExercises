package challenge;

public class challenge6 {
    public static void firstDigitNumber(int number){
        if (number < 10){
            System.out.println(number);
        }else
            firstDigitNumber(number/10);
    }

    public static void main(String[] args) {
        firstDigitNumber(54123);
    }
}

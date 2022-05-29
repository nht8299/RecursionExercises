package challenge;

public class Challenge3 {
    public static int highest = 0;

    public static int highestDigitOfNumber(int number){
        if (number < 10){
            if (highest < number){
                highest = number;
            }
        }else {
            if (highest < (number % 10)){
                highest = (number % 10);
            }
            highestDigitOfNumber(number/10);
        }
        return highest;
    }

    public static void main(String[] args) {
        System.out.println(highestDigitOfNumber(192));
    }
}

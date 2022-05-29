package challenge;

public class Challenge4 {
    public static int binary = 0;
    public static int convertBinary(int number){
        if (number == 0){
            return binary = 0;
        }else
            return (number % 2 + 10* convertBinary(number/2));
    }

    public static void main(String[] args) {
        System.out.println(convertBinary(12));
    }
}

package challenge;

import java.util.Scanner;

public class Challenge14 {
    public static boolean checkEvenOrOdd(int n){
        if (n == 0) return true;
        else if (n == 1) return  false;
        else return checkEvenOrOdd(n-2);
    }

    public static void main(String[] args) {
        System.out.println("Please enter a positive number: ");
        Scanner key = new Scanner(System.in);
        int number = key.nextInt();
        while (number < 0){
            System.out.println("Please enter a positive integer number!");
            number = key.nextInt();
        }
        if (checkEvenOrOdd(number)){
            System.out.println(number + ": is Even");
        }else System.out.println(number +" : is Odd");
    }
}

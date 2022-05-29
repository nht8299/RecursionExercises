package challenge;

public class Challenge2 {
    public static int count = 0;
    public static int countNumber(int number){
        if (number < 10){
            return count += 1;
        }else{
            count += 1;
            countNumber( number/ 10);
        }
        return count;
    }

    public static void main(String[] args) {
        System.out.println(countNumber(10000));
    }
}

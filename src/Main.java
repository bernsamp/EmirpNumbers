import java.util.*;

public class Main {
    public static boolean isPrime(int number) {
        if (number <= 1)
            return false;
        for (int i = 2; i < number; i++)
            if (number % i == 0)
                return false;
        return true;
    }

    public static boolean isEmirp(int number){
        if (!isPrime(number))
            return false;

        int reverseNumber = 0;

        while (number != 0) {
            int lastDigit = number % 10;
            reverseNumber = reverseNumber * 10 + lastDigit;
            number /= 10;
        }
        return isPrime(reverseNumber);
    }

    public static void main(String[] args){

        Scanner sc = new Scanner(System.in);

        System.out.print("Enter starting range: ");
        int start = sc.nextInt();

        System.out.print("Enter ending range: ");
        int end = sc.nextInt();

        System.out.println("Emirp numbers between " + start + " and " + end + " are: ");
        for (int i = start; i <= end; i++){

            if (isEmirp(i))
                System.out.println(i + "  ");
        }
    }
}
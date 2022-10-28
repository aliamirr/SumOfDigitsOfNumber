import java.util.Scanner;

public class SumOfDigitsOfNumber {
    public static void main(String[] args)
    {
        int num, dig, sum = 0;
        System.out.println("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        num = inp.nextInt();

        while(num > 0) {
            dig = num % 10;
            sum = sum + dig;
            num /= 10;
        }

        System.out.println("The required sum of the digits of the given number is: " + sum);
    }


}
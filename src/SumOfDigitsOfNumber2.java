import java.util.Scanner;

public class SumOfDigitsOfNumber2
{
    public static void main(String[] args)
    {
        long number, sum;
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter a number: ");
        number = inp.nextLong();
        for(sum = 0; number != 0; number = number/10){
            sum = sum + number % 10;
        }
        System.out.println("Sum of digits: " + sum);
    }
}

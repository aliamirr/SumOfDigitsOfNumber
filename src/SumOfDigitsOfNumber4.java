import java.util.Scanner;

public class SumOfDigitsOfNumber4
{
    static int SumOfDigits4(int number) {
        int sum;

        for(sum = 0; number > 0; sum = sum + number % 10, number = number / 10);
         return sum;
    }

    public static void main(String[] args) {
        int Numb , Su;
        System.out.println("Enter the number: ");
        Scanner inp = new Scanner(System.in);
        Numb = inp.nextInt();
        Su = SumOfDigits4(Numb);
        System.out.println("The sum of digits: " + Su);


    }
}

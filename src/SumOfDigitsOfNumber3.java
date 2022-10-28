import java.util.Scanner;

public class SumOfDigitsOfNumber3
{
    static int SumOfDigits3(int number) {
        int sum = 0;
        while(number!= 0){
            sum = sum + number % 10;
            number = number/10;
        }
        return sum;

    }

    public static void main(String[] args) {
        int Num, Sum;
        System.out.println("Enter a number: ");
        Scanner inp = new Scanner(System.in);
        Num = inp.nextInt();
        Sum = SumOfDigits3(Num);
        System.out.println("The sum of digits: " + Sum);



    }
}

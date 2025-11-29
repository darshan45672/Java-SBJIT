
import java.util.Scanner;

public class Sum{
    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        System.out.print("Enter Number 1: \t");
        int num1 = myScanner.nextInt();
        System.out.print("\nEnter Number 2: \t");
        int num2 = myScanner.nextInt();

        int sum = 0;

        sum = num1 + num2;

        System.out.println("Sum of " + num1 + " + " + num2 + " = " + sum);
    }
}
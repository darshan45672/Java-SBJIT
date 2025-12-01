import java.util.*;

class Conditionals {
    public static void main(String[] args){
        int num1 = 0;
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter an Num1: \t");
        num1 = scanner.nextInt();

        System.out.println("\nEnter Num2: \t");
        int num2 = scanner.nextInt();

        int sum = num1 + num2;

        if(num1 && num2 > 0){
            System.out.println("Both numbers are positive");
        }

        if (sum == 10){
            System.out.println("Sum is equal to 10");
        } else if (sum > 10){
            System.out.println("Sum is greater than 10");
        } else {
            System.out.println("Sum is less than 10");
        }

    }
}
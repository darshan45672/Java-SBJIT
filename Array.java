import java.util.Scanner;

class Array {
    public static void main(String[] args) {
       int[] numbers = new int[5];

       Scanner scanner = new Scanner(System.in);

       for(int i = 0; i < numbers.length; i++) {
           System.out.println("Enter number " + (i + 1) + ": ");
           numbers[i] = scanner.nextInt();
       }
       scanner.close();

       
for (int num : numbers) {
  System.out.println(num);
}
    }
}
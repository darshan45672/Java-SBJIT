// Vasanth wants to go to a trip with his girlfriend, but he has a budget issue
// if his budget is less than 1000 he can take his girlfiend to a nearby place
// if his budget is between 1000 and 3000 he can take her to a hill station
// if his budget is between 3000 and 5000 he can take her to a beach
// if his budget is more than 50000 he can take her abroad.
// write a java code to help vasanth to decide where he can take his girlfriend 
// based on his budget.

import java.util.Scanner;

class Assignement1 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        boolean validBudget = true;

        while(validBudget){
        System.out.print("Enter your budget: ");
        int budget = scanner.nextInt();

        if(budget < 1000){
            System.out.println("You can take your girlfriend to a nearby place.");
        } else if(budget >= 1000 && budget < 3000){
            System.out.println("You can take your girlfriend to a hill station.");
        } else if(budget >= 3000 && budget < 5000){
            System.out.println("You can take your girlfriend to a beach.");
        } else if(budget > 5000){
            System.out.println("You can take your girlfriend abroad.");
        } else {
            System.out.println("Invalid budget.");
            validBudget = false;
        }
        }
        scanner.close();
    }
}
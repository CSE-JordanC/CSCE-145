//Jordan Chavous 

import java.util.Scanner;

public class AppleTester {
    public static void main(String[] args) {
    	
        //This prints a welcome message to the user
        System.out.println("Welcome to the Apple tester!!!");

        //This creates the first apple object using the default constructor
        System.out.println("Creating the first apple!");
        Apple apple1 = new Apple();
        System.out.println("Default values of the first apple object:");
        //This displays the apple1 details
        apple1.writeOutput();

        //This creates the second apple object using the users inputs within the parameters
        Scanner scanner = new Scanner(System.in);
        
        //Asks for user input for apple type
        System.out.println("\nEnter the type of the second apple object:");
        String type = scanner.nextLine();
        
        //Asks for user input for apple weight
        System.out.println("Enter the weight of the second apple object:");
        double weight = scanner.nextDouble();
        
        //Asks for user input for apple price
        System.out.println("Enter the price of the second apple object:");
        double price = scanner.nextDouble();

        //This creates the second apple object
        System.out.println("\nCreating the second apple object!");
        Apple apple2 = new Apple(type, weight, price);
        System.out.println("Values of the second apple object:");
        //This displays apple2 details
        apple2.writeOutput();

        scanner.close();
    }
}

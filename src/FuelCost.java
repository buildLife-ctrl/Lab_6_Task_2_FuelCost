import java.util.Scanner;

public class FuelCost {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //variable
        double gasInGallons = 0;
        double fuelEfficiency = 0; //miles per gallon
        double gasPrice = 0; //per gallon
        double costPerHundred = 0;
        double lengthCarGoes = 0;
        boolean checks = false;

        //checks that input of gallons of gas is valid
        do {
            //asks the number of gallons of gas in the tank
            System.out.println("How many gallons of gas do you have remaining in your tank?");
            if (scan.hasNextDouble()) {
                gasInGallons = scan.nextDouble();
                if (gasInGallons >= 0) {
                    checks = true; //stops the loop since they entered the right stuff.
                } else {
                    System.out.println("Make sure your value is not negative. Please try again.");
                }
            } else {
                System.out.println("Whoops, looks like you have entered the wrong data type. Please try again.");
            }
            scan.nextLine();
        } while (!checks);

        //redone for use again in the next while loop
        checks = false;

        //checks that input of fuel efficiency is valid
        do {
            //asks the fuel efficiency in miles per gallon
            System.out.println("What is your fuel efficiency in miles per gallon?");
            if (scan.hasNextDouble()) {
                fuelEfficiency = scan.nextDouble();
                if (fuelEfficiency > 0) {
                    checks = true; //stops the loop since they entered the right stuff.
                } else {
                    System.out.println("Make sure your value is not negative or zero. Please try again.");
                }
            } else {
                System.out.println("Whoops, looks like you have entered the wrong data type. Please try again.");
            }
            scan.nextLine();
        } while (!checks);

        //redone for use again in the next while loop
        checks = false;

        //checks for inputs of price of the gas
        do {
            //asks the price of gas per gallon
            System.out.println("What is the price of your gas per gallon?");
            if (scan.hasNextDouble()) {
                gasPrice = scan.nextDouble();
                if (gasPrice > 0) {
                    checks = true; //stops the loop since they entered the right stuff.
                } else {
                    System.out.println("Make sure your value is not negative or zero. Please try again.");
                }
            } else {
                System.out.println("Whoops, looks like you have entered the wrong data type. Please try again.");
            }
            scan.nextLine();
        } while (!checks);

        //calculations and output
        if (checks) {
            costPerHundred = 100 / fuelEfficiency * gasPrice;
            lengthCarGoes = gasInGallons * fuelEfficiency;
            System.out.printf("%-30s %6.2f", "Cost per 100 miles in $:", costPerHundred);
            System.out.printf("\n%-30s %6.2f", "Distance left in miles:", lengthCarGoes);
        }
    }
}
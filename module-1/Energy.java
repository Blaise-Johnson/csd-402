//Blaise Johnson
//September 13, 2026
//Assignment 1.3

import java.util.Scanner; // imports scanner from java.util package 

public class Energy{
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); // scanner created

        System.out.println("Enter the water amount in kilograms: "); // Asks user for water amount
        double waterAmount = input.nextDouble(); // user water amount input, used double to allow for decimal input

        
        System.out.println("Enter starting temperature: "); // Asks user for starting temperature
        double initialTemp = input.nextDouble(); // user initial temp input

        
        System.out.println("Enter final temperature: "); // Asks user for final temperature
        double finalTemp = input.nextDouble(); // user final temp input

        double energy = waterAmount * (finalTemp - initialTemp) * 4184; // energy calculation

        System.out.println("The required energy is " + energy + " joules.");
        input.close(); // closes scanner
    

    }
}


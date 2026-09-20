//Blaise Johnson
//September 20,2026
//Assignment 2.2

import java.util.Random; //imports random class
import java.util.Scanner; // imports scanner class

public class game {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        Random rand = new Random();

        int randomNum = rand.nextInt(3)+1; // choose a number from 1 2 or 3

        int rock = 1; 
        int paper = 2;
        int scissors = 3; 

        System.out.println("Choose an option: 1 for Rock, 2 for Paper or 3 for Scissors"); // gets user input
        int selection = input.nextInt();

        if (randomNum == rock && selection == rock) {  
            System.out.println("Computer chose: Rock");
            System.out.println("You chose: Rock");
            System.out.println("You Tied");}

            else if (randomNum == rock && selection == scissors){
                System.out.println("Computer chose: Rock");
                System.out.println("You chose: Scissors ");
                System.out.println("You Lose");}

            else if (randomNum == rock && selection == paper){
                System.out.println("Computer chose: Rock");
                System.out.println("You chose: Paper ");
                System.out.println("You Win");}

            else if (randomNum == paper && selection == paper){
                System.out.println("Computer chose: Paper");
                System.out.println("You chose: Paper");
                System.out.println("You Tied");}

            else if (randomNum == paper && selection == rock){
                System.out.println("Computer chose: Paper");
                System.out.println("You chose: Rock");
                System.out.println("You Lose");}

            else if (randomNum == paper && selection == scissors){
                System.out.println("Computer chose: Paper");
                System.out.println("You chose: Scissors");
                System.out.println("You Win");}

            else if (randomNum == scissors && selection == scissors){
                System.out.println("Computer chose: Scissors");
                System.out.println("You chose: Scissors");
                System.out.println("You Tied");}

            else if (randomNum == scissors && selection == rock ){
                System.out.println("Computer chose: Scissors");
                System.out.println("You chose: Rock");
                System.out.println("You Win");}
            
            else if (randomNum == scissors &&  selection == paper){
                System.out.println("Computer chose: Scissors");
                System.out.println("You Chose: Paper ");
                System.out.println("You Lose");}


            input.close(); // closes scanner
        



    }
}

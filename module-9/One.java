//Blaise Johnson
//Assignment 9.2
//November 8, 2026

import java.util.ArrayList; // imports arraylist class
import java.util.Scanner; // imports scanner class

public class One{
    public static void main(String[] args){ //main method

    ArrayList<String> comics = new ArrayList<>(); //arraylist
    Scanner input = new Scanner(System.in);

        comics.add("SpiderMan: Miles Morales");
        comics.add("Something is killing the children");
        comics.add("Paper Girls");
        comics.add("Static: Season One");
        comics.add("New Titans");
        comics.add("What If...? SpiderMan");
        comics.add("Bishop");
        comics.add("Nubia: Queen of the Amazon");
        comics.add("Teen Titans");
        comics.add("Nightmare SpiderMan");


        System.out.println("Full comic list");
        System.out.println("---------------");

        for (String comic : comics){
            System.out.println(comic);
        }
        
        System.out.println("");
        System.out.println("What comic would you like to see? ");



        try{
            String selection = input.nextLine();

            int number = Integer.parseInt(selection); // String to int

            Integer boxedSelection = number; // Autoboxing

            int index = boxedSelection; // Auto-unboxing


            System.out.println(comics.get(index));
        }
        catch(IndexOutOfBoundsException e){
            System.out.println("Out of Bounds");
        }
        catch(NumberFormatException e){
            System.out.println("Out of Bounds");
        }

        input.close();

    }

    

}


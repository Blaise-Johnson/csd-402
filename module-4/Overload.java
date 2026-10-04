//Blaise Johnson
//Assignment 4.2
//October 4, 2026


public class Overload {

    public static void main(String[] args){

        short[] shorty = {2,4,6,8}; //short array created here

        System.out.println("Short Array Numbers: "); // prints string 

        for (short number : shorty){ // loops through numbers in array 
            System.out.println(number); //prints looped numbers 
        }

        short shortResult = average(shorty); // calls short method 

        System.out.println("Average:" + shortResult); //prints string and results 


        int[] intel = {3,6,9,12,15,18,21,24,27,30}; //int array 

        System.out.println("Int Array Numbers: "); // prints string 

        for ( int numbers : intel){ //loops through numbers 
            System.out.println(numbers); //prints looped numbers 
        }

        int intResult = average(intel); //calls int method
        System.out.println("Average: " + intResult); // prints int average 


        long[] oolong = {100,99,98,97,96,95}; // long array 

        System.out.println("Long Array Numbers: "); // prints string

        for (long numbers : oolong){ // prints numbers in long array
            System.out.println(numbers); 
        }

        long longResult = average(oolong); //calls long method
        System.out.println("Average: " + longResult); // prints long average


        double[] doubleDutch = {0.5, 44.4, 37.9, 15.3, 21.7}; //double array
        
        System.out.println("Double Array Numbers: "); // prints string

        for (double numbers : doubleDutch){ // loops through numbers in array
            System.out.println(numbers); // prints looped numbers
        }

        double doubleResults = average(doubleDutch); //calls double method
        System.out.println("Average: " + doubleResults); // prints average



    }


    public static short average (short[] array){
        short sum = 0; //sets sum to immediately to zero

        for (short numbers : array){ // loop to go through all numbers in array
            sum += numbers; // adds numbers together in array
        }

        return (short)(sum / array.length); //gets average 
    }

    public static int average (int[] array){
        int sum = 0; //sets sum to zero

        for (int numbers : array) { // loops through numbers in array
            sum += numbers; // adds numbers together in array
        }

        return sum / array.length; //gets average
    }

    public static long average (long[] array){ //long method
        long sum = 0; //sets sum to zero

        for (long numbers : array){ // loops through numbers in array 
            sum += numbers; // adds numbers together
        }

        return sum / array.length; //gets average
    }

    public static double average (double[] array){ //double method
        double sum = 0; // starts sum at zero

        for (double numbers : array){ // loops through array
            sum += numbers; // adds numbers together
        }

        return sum / array.length; // gets average
    }

}

    
    



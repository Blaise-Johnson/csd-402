//Blaise Johnson
//Assignment 9.2
//November 8, 2026

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Random;
import java.util.Scanner;


public class Two {
    public static void main(String[] args) {

        Random random = new Random();

        
        try {  // Creates file or appends to existing file
            FileWriter writer = new FileWriter("data.file", true);

            
            for (int i = 0; i < 10; i++) { // Generates and writes 10 random integers
                int number = random.nextInt(100) + 1;
                writer.write(number + " ");
            }

            writer.close();

            System.out.println("Numbers written to file successfully.");

             
            File file = new File("data.file"); // Reopens file
            Scanner reader = new Scanner(file);

            System.out.println("Contents of data.file:");

            
            while (reader.hasNext()) { // Reads and displays file contents
                System.out.print(reader.next() + " ");
            }

            
            reader.close();

        } catch (IOException e) {
            System.out.println("An error occurred while handling the file.");
        }
    }
}
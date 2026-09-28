/*Blaise Johnson*/
/*Assignment 3.2 */
/*September 27, 2026 */



public class Loop { /*public class is capitalized for Java coding standards */
    public static void main(String[] args) { /*main method for starting the program */

        for (int row = 0; row < 7; row++) { /*loop for creating each row */

                    
                    for (int space = 0; space < 6 - row; space++) { /*loop to create the spaces before each row*/
                        System.out.print("   ");
                    }

                    
                    for (int i = 0; i <= row; i++) { /*loop to print increasing numbers */
                        System.out.printf("%3d", (int)Math.pow(2, i)); /*added %3d so each number has the same space*/
                    }

                    
                    for (int i = row - 1; i >= 0; i--) { /*loop to print decreasing numbers */
                        System.out.printf("%3d", (int)Math.pow(2, i)); /*again added %3d so each number has the same space*/
                    }

                    /*loop to create the spaces between the number and @ */
                    for (int space = 0; space < 6 - row; space++) { 
                        System.out.print("   ");
                    }

                    System.out.println(" @"); /*prints the @ at the end of each row */
                }
    }
}
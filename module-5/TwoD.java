//Blaise Johnson 
//Assignment 5.2
//October 11, 2026


public class TwoD{ // creates TwoD class
        public static void main(String[] args){ //main method

            int [][] notorious = { //integer array
            {4,1,6,8,3,19,44},
            {100,3,74,1,8142,4,67},
            {52,10,37,49,90,2,9}
            };

            double [][] b_i_g = { // double array
                {1.2,2.3,3.4,4.5,5.6},
                {9.8,8.7,7.6,6.5,5.4},
                {3.5,4.6,67.8,39.1,55.8}
            };



            int[] largeI = locateLargest(notorious); //finds largest integer
            int[] largeDub = locateLargest(b_i_g); // finds largest double

            int[] smallI = locateSmallest(notorious); //finds smallest integer
            int[] smallDub = locateSmallest(b_i_g); // finds smallest double

            System.out.println("Largest Integer"); 
            System.out.println("Row: " + largeI[0]); //prints row
            System.out.println("Column: " + largeI[1]); //prints column 
            System.out.println(); // adds a space between prints 

            System.out.println("Largest Double");
            System.out.println("Row: " + largeDub[0]); //prints row
            System.out.println("Column: " + largeDub[1]); //prints column
            System.out.println(" ");

            
            System.out.println("Smallest Integer");
            System.out.println("Row: " + smallI[0]); //prints row
            System.out.println("Column: " + smallI[1]); // prints column
            System.out.println(" ");

            System.out.println("Smallest Double");
            System.out.println("Row: " + smallDub[0]); //prints row
            System.out.println("Column: " + smallDub[1]); //prints column

    }

    public static int[] locateLargest(int[][] arrayParam){

        int biggie = arrayParam[0][0]; // intialy sets first element as largest

        int row = 0; //stores largest row index
        int col = 0; //stores largest column index

        for (int i  = 0; //loops through rows 
            i < arrayParam.length;
            i++){ //moves to next row

                for (int j = 0; //loops through columns
                    j < arrayParam[i].length;
                    j++){ // moves to next column 

                        if (arrayParam[i][j] > biggie){ //checks if current value is larger than biggie
                            biggie = arrayParam[i][j]; //updates largest value

                            row = i; //saves row index of new values
                            col = j; //saves index of new values 
                        }
                    }
            }

        return new int[] {row, col}; //returns location of largest integer
    }

    public static int[] locateSmallest(int [][] arrayParam){
        int smalls = arrayParam[0][0];

        int row = 0;
        int col = 0;

        for (int i = 0;
            i < arrayParam.length;
            i++){


                for (int j = 0;
                    j < arrayParam[i].length;
                    j++){


                        if (arrayParam[i][j] < smalls){
                            smalls = arrayParam[i][j];

                            row = i;
                            col = j;

                        }
                    }

            }
        return new int[] {row,col};
    }

    public static int[] locateLargest(double[][] arrayParam){
        double biggie = arrayParam[0][0];

        int row = 0;
        int col = 0;

        for (int i = 0;
            i < arrayParam.length;
            i++){

                for (int j = 0;
                    j < arrayParam[i].length;
                    j++){
                        if (arrayParam[i][j] > biggie){
                            biggie = arrayParam[i][j];

                            row = i;
                            col = j;
                        }
                    }
            }

        return new int[] {row,col};

    }


    public static int[] locateSmallest(double[][] arrayParam){
        double smalls = arrayParam[0][0];

        int row = 0;
        int col = 0;

        for (int i = 0;
            i < arrayParam.length;
            i++){
                for (int j = 0;
                    j < arrayParam[i].length;
                    j++){

                        if (arrayParam[i][j] < smalls){
                            smalls = arrayParam[i][j];

                            row = i;
                            col = j;
                        }                       
                    }
            }

        return new int[] {row,col};
    }
    


}

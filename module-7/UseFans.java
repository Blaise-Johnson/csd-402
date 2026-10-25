//Blaise Johnson
//Assignment 7.2
//October 25, 2026


import java.util.ArrayList; //imports array list class

public class UseFans {

    public static void main(String[] args){// main method

        ArrayList<Fan> fans = new ArrayList<>(); // holds fans
        
        //fans added to collection
        fans.add(new Fan(Fan.SLOW,true,8,"Orange"));
        fans.add(new Fan(Fan.MEDIUM,true,10,"Green"));
        fans.add(new Fan(Fan.FAST,true,12,"Blue"));
        fans.add(new Fan(Fan.STOPPED,false,6,"White"));

        showAllFans(fans); //method to display all fans
    }


    //loops through all fan objects
    public static void showAllFans(ArrayList<Fan> fans){
        for (Fan fan : fans){
            showOneFan(fan); //resued so I dont have to rewrite it
        }
    }

    //method to display single fans
    public static void showOneFan(Fan fan){

        System.out.println("Speed: " + fan.getSpeed());
        System.out.println("On Status: " + fan.getOn());
        System.out.println("Radius: " + fan.getRadius());
        System.out.println("Color: " + fan.getColor());
        System.out.println();
    }

}

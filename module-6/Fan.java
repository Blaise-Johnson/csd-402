//Blaise Johnson
//Assignment 6.2
//October 19, 2026



public class Fan{ // fan class
    public static final int STOPPED = 0; 
    public static final int SLOW = 1;
    public static final int MEDIUM = 2;
    public static final int FAST = 3;

    private int speed = STOPPED; //private field with default value
    private boolean on = false; //private field with default value
    private int radius = 6;//private field with default value
    private String color = "White";//private field with default value

    public Fan(){ //no-argument constructor
       speed = STOPPED;
       on = false;
       radius = 6;
       color = "White";
    }

    public Fan(int speed, boolean on, int radius,String color){ //initializes fields using arguments
        this.speed = speed;
        this.on = on;
        this.radius = radius;
        this.color = color;
    }

    public int getSpeed(){ //speed getter
        return speed;
    }

    public boolean getOn(){ //on getter
        return on;
    }

    public int getRadius(){ //radius getter
        return radius;
    }

    public String getColor(){ // color getter
        return color;
    }


    public void setSpeed(int newSpeed){ //speed setter
        this.speed= newSpeed;
    }

    public void setOn(boolean newOn){ //on setter
        this.on = newOn;
    }

    public void setRadius(int newRadius){ //radius setter
        this.radius = newRadius;
    }

    public void setColor (String newColor){//color setter
        this.color = newColor;
    }

    public String toString(){ // returns a String describing the fan 
           return "Fan Speed: " + speed +
           "\nFan On: " + on +
           "\nFan Radius: " + radius +
           "\nFan Color: " + color; 
    }
    public static void main(String[] args){ // main method

    Fan fanOne = new Fan(); //no arg constructor

    Fan fanTwo = new Fan(Fan.FAST,true,10,"Purple"); // uses arguments

    System.out.println("Fan One: ");
    System.out.println(fanOne.toString());
    System.out.println();

    System.out.println("Fan Two:");
    System.out.println(fanTwo);


    //setter test
    fanOne.setSpeed(Fan.MEDIUM);
    fanOne.setOn(true);
    fanOne.setRadius(42);
    fanOne.setColor("Teal");

    //getter test
    System.out.println("\nNew Fan One: ");

    System.out.println("New Speed: " + fanOne.getSpeed());
    System.out.println("New On Status: " + fanOne.getOn());
    System.out.println("New Radius: " + fanOne.getRadius());
    System.out.println("New Color: " + fanOne.getColor());

}


}


    
    


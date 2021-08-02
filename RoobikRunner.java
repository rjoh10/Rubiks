import java.util.Scanner;

public class RoobikRunner
{
    /** 
     * 
     * */
    public static void main(String[] args)
    {
        // Code to ask user for instructions to manipulate the code
        // Commands would be left, right, up, down,cw(clockwise) ccw(anticlockwise) and exit
        // Print out the cube after each command (except exit)
       System.out.println("Base Image of Roobiks");
        RoobikCube rc = new RoobikCube();
        System.out.println(rc);
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What direction would you like to rotate? Type left,right,up,down,cw or ccw");
            System.out.println("Type exit to Exit");
            String direct = sc.nextLine();
           if (direct.equalsIgnoreCase("exit")) {
                System.out.println("GoodBye");
                break;
            }
            else if (direct.equalsIgnoreCase("cw")) {
                System.out.println("Call clockwise rotate method");
                rc = rc.turnCW();
                System.out.println(rc);
            } else if (direct.equalsIgnoreCase("ccw")) {
                System.out.println("Call counter clockwise method");
                rc = rc.turnCCW();
                System.out.println(rc);
            }
            else if (direct.equalsIgnoreCase("left")) {
                System.out.println("Call Left rotate method");
                rc = rc.turnLeft();
                System.out.println(rc);
            } else if (direct.equalsIgnoreCase("right")) {
                System.out.println("Call Right rotate method");
                rc = rc.turnRight();
                System.out.println(rc);
            } else if (direct.equalsIgnoreCase("up")) {
                System.out.println("Call Up rotate method");
                rc = rc.turnUp();
                System.out.println(rc);
            } else if (direct.equalsIgnoreCase("down")) {
                System.out.println("Call Down rotate method");
                rc = rc.turnDown();
                System.out.println(rc);
            }

        }
    }
}

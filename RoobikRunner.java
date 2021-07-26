import java.util.Scanner;

public class RoobikRunner
{
    /** 
     * 
     * */
    public static void main(String[] args)
    {
        // Code to ask user for instructions to manipulate the code
        // Commands would be left, right, up, down and exit
        // Print out the cube after each command (except exit)
       
        RoobikCube rc = new RoobikCube();
        System.out.println(rc);
        
        Scanner sc = new Scanner(System.in);
        while (true) {
            System.out.println("What direction would you like to rotate? or Type exit to Exit");
            String direct = sc.nextLine();
            if (direct.equals("exit")) {
                System.out.println("GoodBye");
                break;
            } else if (direct.equals("left")) {
                System.out.println("Call Left rotate method");
                rc = rc.turnLeft();
                System.out.println(rc);
            } else if (direct.equals("right")) {
                System.out.println("Call Right rotate method");
                rc = rc.turnRight();
                System.out.println(rc);
            } else if (direct.equals("up")) {
                System.out.println("Call Up rotate method");
                rc = rc.turnUp();
                System.out.println(rc);
            } else if (direct.equals("down")) {
                System.out.println("Call Down rotate method");
                rc = rc.turnDown();
                System.out.println(rc);
            }

        }
    }
}

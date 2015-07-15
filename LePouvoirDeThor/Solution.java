import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Player {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        int LX = in.nextInt(); // the X position of the light of power
        int LY = in.nextInt(); // the Y position of the light of power
        int TX = in.nextInt(); // Thor's starting X position
        int TY = in.nextInt(); // Thor's starting Y position
        
         int thorX = TX;
         int thorY = TY;

        // game loop
        while (true) {
            int E = in.nextInt(); // The level of Thor's remaining energy, representing the number of moves he can still make.
           
            String directionX = ""; 
            String directionY = "";
            if (thorX > LX) {
                directionX = "W";
                thorX--;
            }
            else if (thorX < LX)  {
                directionX = "E";
                thorX++;
            }
            else 
                directionX = "";
                
            if (thorY > LY) {
                directionY = "N";
                thorY--;
            }
            else if (thorY < LY) {
                directionY = "S";
                thorY++;
            }
            else 
                directionY = "";
            
            // To debug: System.err.println("Debug messages...");

            System.out.println(directionY + directionX); // A single line providing the move to be made: N NE E SE S SW W or NW
        }
    }
}

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
         Map<Integer, Integer> mountains = new HashMap<Integer, Integer>();
        // game loop
        while (true) {
           
            int spaceX = in.nextInt();
            int spaceY = in.nextInt();
            for (int i = 0; i < 8; i++) {
                int mountainH = in.nextInt(); // represents the height of one mountain, from 9 to 0. Mountain heights are provided from left to right.
                mountains.put(i, mountainH);
            }

            // Write an action using System.out.println()
            int higherMountain = 0;
            int index = 0;
            for (int i : mountains.keySet()) {
                int y = mountains.get(i);
                if ( y > higherMountain) {
                    higherMountain = y;
                    index = i;
                    
                }
            } 
            System.err.println(spaceX + " -- " + index + " ++++ " + higherMountain);
            if (spaceX == index) {
                
                System.out.println("FIRE");
                continue;
            } 
            else {
                System.out.println("HOLD");
            }
            mountains.clear();
            // To debug: System.err.println("Debug messages...");

            //System.out.println("HOLD"); // either:  FIRE (ship is firing its phase cannons) or HOLD (ship is not firing).
        }
    }
}

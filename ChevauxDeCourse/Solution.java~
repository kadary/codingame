import java.util.*;
import java.io.*;
import java.math.*;

/**
 * Auto-generated code below aims at helping you parse
 * the standard input according to the problem statement.
 **/
class Solution {

    public static void main(String args[]) {
        Scanner in = new Scanner(System.in);
        String MESSAGE = in.nextLine();
        char[] cArray = MESSAGE.toCharArray();
        StringBuilder answer = new StringBuilder();
        StringBuilder binaryString = new StringBuilder();
        
        for (char stringChar : cArray) {
            binaryString.append((String) String.format("%7s", Integer.toBinaryString((int) stringChar)).replace(' ', '0'));
        }
        String groups[] = binaryString.toString().split("(?<=1)(?=0)|(?<=0)(?=1)");
        int counter = 0;
        for (String group : groups) {
          //System.err.println(group);
          if (group.contains("0")) {
              answer.append("00 ");
          }
          else {
            answer.append("0 ");
          }
          for (int i = 0; i < group.length(); i++) {
                answer.append("0");  
          }
          if (counter < groups.length - 1) {
            answer.append(" ");
            counter++;
          } 
          
        }

        System.out.println(answer.toString());
    }
}

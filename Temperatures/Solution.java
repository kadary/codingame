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
        int N = in.nextInt(); // the number of temperatures to analyse
        in.nextLine();
        String TEMPS = in.nextLine(); // the N temperatures expressed as integers ranging from -273 to 5526

        // Write an action using System.out.println()
        // To debug: System.err.println("Debug messages...");
        int result = 0;
        if (TEMPS.isEmpty()) {
            System.out.println(result);
        } 
        else { 
            List<Integer> list = new ArrayList<Integer>();
            List<Integer> originaList = new ArrayList<Integer>();
            for (int i = 0; i < N; i++) {
                list.add(Math.abs(Integer.valueOf(TEMPS.split(" ")[i])));
                originaList.add(Integer.valueOf(TEMPS.split(" ")[i]));
            }
            if (originaList.size() == 1) {
                result = originaList.get(0);
            } 
            else {
                Collections.sort(list);
                result =  list.get(N-1);
                for (int i = 0; i < list.size(); i++) {
                    int tmp = originaList.get(i);
                    System.err.println(result);
                    if (Math.abs(tmp) <= Math.abs(result)) {
                        result = tmp;
                    }
                }
                if (Math.signum(result) == -1.0 && originaList.contains(Math.abs(result))) {
                    result = Math.abs(result);
                    System.err.println(result);
                } 
            }
            System.out.println(result);
        }
    }
}

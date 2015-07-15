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
        int N = in.nextInt(); // Number of elements which make up the association table.
        in.nextLine();
        int Q = in.nextInt(); // Number Q of file names to be analyzed.
        in.nextLine();
        Map<String, String> mimeType = new HashMap<String, String>();
        List<String> files = new ArrayList<String>();
        for (int i = 0; i < N; i++) {
            String EXT = in.next(); // file extension
            String MT = in.next(); // MIME type.
            mimeType.put(EXT.toLowerCase(), MT);
            in.nextLine();
        }
        for (int i = 0; i < Q; i++) {
            String FNAME = in.nextLine(); // One file name per line.
            files.add(FNAME.toLowerCase());
        }
        
        for (String file : files) {
            int pointer = file.lastIndexOf(".");
            String ext = file.substring(pointer+1);
            //System.err.println(ext);
            if( pointer == -1 || !ext.matches("\\w+") ) {
                System.out.println("UNKNOWN"); 
            }
            else { 
               if (mimeType.keySet().contains(ext)) {
                    System.out.println(mimeType.get(ext));
                }
                else {
                   System.out.println("UNKNOWN"); 
                }    
            }
        }
    }
}

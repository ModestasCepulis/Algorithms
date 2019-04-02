package Lab11;

import java.awt.*;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.*;

public class FileHandling {
    public static void main(String[] args) {
        String fileName = "C:\\Users\\t00199237\\Desktop\\hamlet.txt";
        //Set<String> words = new TreeSet<String>();
        Map<String, Integer> words = new TreeMap<String, Integer>();
        int lineNumber = 1;

        try {
            Scanner in = new Scanner(new File(fileName));
            while (in.hasNextLine()) {
                Scanner lineParser = new Scanner(in.nextLine());
                // Use any characters other than a-z, A-Z, 0-9 as delimiters
                lineParser.useDelimiter("[^A-Za-z0-9_]+");
                while (lineParser.hasNext()) {
                    String identifier = lineParser.next();
                   //System.out.println( identifier);
                   words.put(identifier, lineNumber);
                }
                lineNumber++;

            }

            //Iterator iter = words.iterator();

            //Qs2
            /*while(iter.hasNext())
            {
                System.out.println(iter.next());
            }*/

            //Qs3
            Set<String> KeySet = words.keySet();

            for (String key : KeySet)
            {
                int value = words.get(key);
                System.out.println(key + " no. " + value);
            }




        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }




    }
}

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
/**
* This program calculates amount of mean median and mode.
*
* @author  Jedidiah Alfred
* @version 1.0
* @since   2023-02-08
*/

public final class ReverseString {
    /**
    * This is a private constructor used to satisfy the
    * style checker.
    *
    * @exception IllegalStateException Utility Class
    */
    private ReverseString() {
        throw new IllegalStateException("Utility Class");
    }
    /**
    * This is the main method.
    *
    * @param args Unused
    * @throws Exception if something goes wrong
    */

    public static void main(String[] args) {

        // Initializing variables
        String list;
        try {

            // new file object
            final File input = new File("input.txt");
            final Scanner scanner = new Scanner(input);

            // Creating the writer
            final FileWriter output = new FileWriter("output.txt");

            // ArrayList to hold the lines
            final ArrayList<String> lists = new ArrayList<>();

            // Getting the input from the first file
            while (scanner.hasNextLine()) {

                // getting next line and putting it in the interim list
                list = scanner.nextLine();
                lists.add(list);
            }
            // set a counter
            final int counter = 0;
            // creating a new array to hold this data
            final String[] listArr = new String[lists.size()];
            for (int location = 0; location < listArr.length; location++) {
                listArr[location] = lists.get(location);
            }

            // here is the Loop to send each line to function.
            for (String stringList : listArr) {

                // Call function.
                final String reverse = reverse(stringList);
                System.out.println(reverse);
                output.write(reverse + "\n");
            }

            // Close the writer.
            output.close();

        } catch (IOException err) {

            // For when no input file is found.
            System.err.println("Err: " + err.getMessage());
        }
    }
    /**
    * This is the method reverse the string.
    *
    * @param list This is the string
    * @return the score of the 2dArray
    */

    public static String reverse(String list) {
        // Detects if the line is empty.
        if (list.isEmpty()) {
            return list;
        } else {
            // Recall the function with all characters but the first.
            return reverse(list.substring(1)) + list.charAt(0);
        }
    }
}

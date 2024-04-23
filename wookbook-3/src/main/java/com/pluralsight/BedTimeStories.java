package com.pluralsight;

import java.io.BufferedReader; // import the BufferReader class which reads text from a character-input stream
import java.io.FileReader;  // import the FileReader class  which is used to read character files
import java.io.IOException; // import the IOException class which is an exception class for input-output operations
import java.util.Scanner; // import the Scanner class which is used to read input from the user

public class BedTimeStories {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in); // create an object of the Scanner class

        // prompt the user to enter preferred file name
        System.out.println("Enter the name of the story/file to read (e.g., hansel_and_gretel.txt, mary_had_a_little_lamb.txt, or goldilocks.txt):");
        String fileName = scanner.nextLine();

        // This line starts a try block, where we attempt to open the specified file (fileName) for reading using a BufferedReader
        try (BufferedReader reader = new BufferedReader(new FileReader(fileName))) {

            String line; // store each line of text read from the file
            int lineNumber = 1;

            //  iterate as long as there are lines to read from the file
            //  we'll read a line from the file using the readLine() method of the BufferedReader and assign it to the line variable
            while ((line = reader.readLine()) != null) {

                // this line prints the current line number followed by a dot and a space, and then the content of the line variable, to the console
                System.out.println(lineNumber + ". " + line);

                lineNumber++; //  increment the lineNumber variable to prepare for the next line
            }
        }

        // handle any IOException that may occur during file reading
        catch (IOException e) {

            // print error message indicating that there was an error reading the file,
            // along with the specific error message obtained from the exception (e.getMessage())
            System.out.println("Error reading the file: " + e.getMessage());
        }

        // this block will always be executed regardless if an exception occurs or not
        finally {
            scanner.close();
        }

    }

}

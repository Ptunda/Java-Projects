
// Create a program that reads data from a text file and processes it.
// Implement error handling using try-catch blocks to handle file-related exceptions such as `FileNotFoundException` and `IOException`

// 1. created a file to read using git bash (arsenal-fc.txt)
// 2. import the Scanner class and create a Scanner object to receive input from the user
// 3. import the FileReader class and create a FileReader object to read the file
// 4. surround the code with a try-catch statement to address a FileNotFound Exception
// 5. create a BufferedReader object to read the file
// 6. declare a String that will represent every line in the file
// 7. assign the bufferReader object to the String and test that if the line String is not empty, we should display a line to the console
// 8. catch / handle IOExceptions in a separate catch statement to tell the user that there was an error in the Input-Output operations
// 9. (Optional) you can use the Thread.sleep() method to create a 1000 millisecond pauses when you print to the console and add appropriate exception to the method signature

package com.pluralSight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class FileReaderApp {


    public static void main(String[] args) throws InterruptedException {

        Scanner in = new Scanner(System.in);

        try {

            System.out.print("\nEnter the file you want to read (arsenal-fc.txt): ");
            String fileName = in.nextLine();
            System.out.println();

            FileReader fileReader = new FileReader(fileName);

            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line;

            while((line = bufferedReader.readLine()) != null){

                System.out.println(line);
                Thread.sleep(1000);

            }
        } catch (FileNotFoundException e) {

            System.out.println("A FileNotFoundException occurred! " + e.getMessage());

        }catch (IOException e){
            System.out.println("An IOException occurred! " + e.getMessage());
        }


    }
}

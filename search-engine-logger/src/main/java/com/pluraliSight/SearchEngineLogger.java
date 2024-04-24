package com.pluraliSight;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class SearchEngineLogger {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        createFile();

    }
    // method that creates the logs.txt file
    public static void createFile(){

        System.out.println("Select an action:");
        System.out.println("1 to Launch the Application");
        System.out.println("2. to Search for a Term");
        System.out.println("3 to Exit the Application");

        int choice = myScanner.nextInt();

        switch (choice){

            case 1:
                try {

                FileWriter potatoWriter = new FileWriter("logs.txt");

                potatoWriter.write("Launch \n");
                potatoWriter.write("Search: How to use ChatGPT \n");
                potatoWriter.write("Search: How to forge a camp knife \n");
                potatoWriter.write("Exit \n");

                potatoWriter.close();

            } catch (IOException e) {
                throw new RuntimeException(e);
            }
                break;

        }



    }
}

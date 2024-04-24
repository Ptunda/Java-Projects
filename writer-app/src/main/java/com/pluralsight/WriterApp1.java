package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class WriterApp1 {

    public static void main(String[] args) {

        try {
            // the File Writer class enables us to create new files and add content to them
            // create an object of the FileWriter class
            // it initially has an error, so we need to catch it
            // provide the file you want to create
            FileWriter potatoWriter = new FileWriter("Skills.txt");

            // add content to the file
            potatoWriter.write("Skills: \n");
            potatoWriter.write("HTML, CSS, JS, Java \n");
            potatoWriter.write("Hi, my name is Paul Tunda.");

            potatoWriter.close(); // close the FileWriter
        } catch (Exception e) {
            System.out.println("An error! " + e.getMessage());
        }

        addMoreContent();

    }

    public static void addMoreContent(){

        try {
            // add the true adjument to allow us to add more content to the file without
            // overriding the original content initially added
            FileWriter potatoWriter2 = new FileWriter("Skills2.txt", true);

            // add content to the file
            potatoWriter2.write("Skills: \n");
            potatoWriter2.write("HTML, CSS, JS, Java \n");
            potatoWriter2.write("Hi, my name is Paul Tunda.\n \n");
            potatoWriter2.write("I love potatoes"); // new line of content added

            potatoWriter2.close(); // close the FileWriter
        } catch (Exception e) {
            System.out.println("An error! " + e.getMessage());
        }


    }
}

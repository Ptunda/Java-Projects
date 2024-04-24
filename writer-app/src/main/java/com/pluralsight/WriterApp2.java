package com.pluralsight;

import java.io.FileWriter;
import java.io.IOException;

public class WriterApp2 {

    public static void main(String[] args) {

        try {
            FileWriter potatoWriter3 = new FileWriter("Skills.txt");
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}

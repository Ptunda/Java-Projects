package com.pluralSight;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

public class StoreApp {

    // the key is the product id, the value is a product object
    public static HashMap<Integer, Product> inventory =
            new HashMap<>();

    public static void main(String[] args) {
        // this method loads product objects into inventory
        loadInventory();
        Scanner scanner = new Scanner(System.in);
        System.out.print("What item # are you interested in? ");
        int id = scanner.nextInt();
        Product matchedProduct = inventory.get(id);
        if (matchedProduct == null) {
            System.out.println("We don't carry that product");
            return;
        }
        System.out.printf("We carry %s and the price is $%.2f",
                matchedProduct.getName(), matchedProduct.getPrice());
    }

    public static void loadInventory() {

        // handling exceptions
        try {

            // prompted the user to enter the file they want to read
            System.out.print("Enter file you want to read (inventory.csv): ");
            String fileName = scanner.nextLine();

            // created instances of the FileReader and BufferedReader to help read the file, handling possible FileNotFoundException
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);

            String line; // declared a String to help read each line of the file

            // while there's no empty line, let's read the file
            while ((line = bufferedReader.readLine()) != null){

                // create an array of strings for three different categories
                // id of a product, name of the product, and price of the product
//                String[] items = line.split("\\|");
//
//                // if each array has a length of 3 items
//                if(items.length == 3){
//
//                    // extract the values to create a Product object
//                    int id = Integer.parseInt(items[0]);
//                    String name = items[1];
//                    double price = Double.parseDouble(items[2]);
//
//                    Product product = new Product(id, name, price); // create a product object
//
//                    inventory.add(product); // add every product to the inventory arraylist
//
//                }
//
//            }
//
//            bufferedReader.close(); // close the BufferedReader
//
//
//        }catch(FileNotFoundException e){
//
//            System.out.println("A FileNotFoundException occurred! " + e.getMessage()); // handle the FileNotFoundException
//        }

    }


}

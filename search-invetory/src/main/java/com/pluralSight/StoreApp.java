
// 1. created 2 classes: StoreApp and Product

package com.pluralSight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.*;

public class StoreApp {

    static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

 //       ArrayList<Product> inventory = getInventory();


//        replaced this code with a menu drive
//         sort the products by their name
//        Collections.sort(inventory, Comparator.comparing(Product::getName));
//
//        // tell the user each product we have in the store
//        System.out.println("We carry the following inventory: ");
//
//        // iterate through the store to display all products
//        for (Product product : inventory) {
//
//            System.out.printf("id: %d %s - Price: $%.2f \n", product.getId(), product.getName(), product.getPrice());
//
//        }

        loadInventory(); // Load inventory from file
        boolean quit = false;

        while (!quit) {
            printMenu();
            System.out.print("Enter command: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume newline character

            switch (choice) {
                case 1:
                    listAllProducts();
                    break;
                case 2:
                    lookupProductById();
                    break;
                case 3:
                    findProductsInPriceRange();
                    break;
                case 4:
                    addNewProduct();
                    break;
                case 5:
                    quit = true;
                    System.out.println("Exiting the application...");
                    break;
                default:
                    System.out.println("Invalid choice. Please enter a number between 1 and 5.");
            }
        }


    }



//    replacing this code with a menu-driven code
//     created a method that returns an arraylist of products
//    public static ArrayList<Product> getInventory() {
//
//        // created an instance of the arraylist
//        ArrayList<Product> inventory = new ArrayList<>();
//
//        // handling exceptions
//        try {
//
//            // prompted the user to enter the file they want to read
//            System.out.print("Enter file you want to read (inventory.csv): ");
//            String fileName = scanner.nextLine();
//
//            // created instances of the FileReader and BufferedReader to help read the file, handling possible FileNotFoundException
//            FileReader fileReader = new FileReader(fileName);
//            BufferedReader bufferedReader = new BufferedReader(fileReader);
//
//            String line; // declared a String to help read each line of the file
//
//            // while there's no empty line, let's read the file
//            while ((line = bufferedReader.readLine()) != null){
//
//                // create an array of strings for three different categories
//                // id of a product, name of the product, and price of the product
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
//
//        catch (IOException e) {
//
//            System.out.println("IOException occurred! " + e.getMessage()); // handle the IOException
//        }
//        return inventory; // return the arraylist
//    }

    public static void printMenu() {
        System.out.println("What do you want to do?");
        System.out.println("1- List all products");
        System.out.println("2- Lookup a product by its id");
        System.out.println("3- Find all products within a price range");
        System.out.println("4- Add a new product");
        System.out.println("5- Quit the application");
    }

    public static void loadInventory() {

        ArrayList<Product> inventory = new ArrayList<>();

        try {
            System.out.print("Enter file you want to read (inventory.csv): ");
            String fileName = scanner.nextLine();
            FileReader fileReader = new FileReader(fileName);
            BufferedReader bufferedReader = new BufferedReader(fileReader);
            String line;

            while ((line = bufferedReader.readLine()) != null) {
                String[] parts = line.split("\\|");
                if (parts.length == 3) {
                    int id = Integer.parseInt(parts[0]);
                    String name = parts[1];
                    double price = Double.parseDouble(parts[2]);
                    inventory.add(new Product(id, name, price));
                }
            }
            bufferedReader.close();
        } catch (FileNotFoundException e) {
            System.out.println("File not found: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Error reading file: " + e.getMessage());
        }
    }

    public static void listAllProducts() {
        System.out.println("Listing all products:");
        for (Product p : inventory) {
            System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(), p.getName(), p.getPrice());
        }
    }

    public static void lookupProductById() {
        System.out.print("Enter the product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        boolean found = false;

        for (Product p : inventory) {
            if (p.getId() == id) {
                System.out.println("Product found:");
                System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(), p.getName(), p.getPrice());
                found = true;
                break;
            }
        }

        if (!found) {
            System.out.println("Product not found.");
        }
    }

    public static void findProductsInPriceRange() {
        System.out.print("Enter the minimum price: ");
        double minPrice = scanner.nextDouble();
        System.out.print("Enter the maximum price: ");
        double maxPrice = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character
        boolean found = false;

        System.out.println("Products within price range:");
        for (Product p : inventory) {
            if (p.getPrice() >= minPrice && p.getPrice() <= maxPrice) {
                System.out.printf("id: %d %s - Price: $%.2f%n", p.getId(), p.getName(), p.getPrice());
                found = true;
            }
        }

        if (!found) {
            System.out.println("No products found within the specified price range.");
        }
    }

    public static void addNewProduct() {
        System.out.print("Enter product ID: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consume newline character
        System.out.print("Enter product name: ");
        String name = scanner.nextLine();
        System.out.print("Enter product price: ");
        double price = scanner.nextDouble();
        scanner.nextLine(); // Consume newline character

        Product newProduct = new Product(id, name, price);
        inventory.add(newProduct);
        System.out.println("New product added successfully.");
    }


}


package java;


import java.util.Scanner;

public class AddressBuilder {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // prompt the user for information
        System.out.println("Please enter the following information: ");
        // FULL NAME
        System.out.print("Full name: ");
        String fullName = scanner.nextLine();

        // CREATE A FREE LINE FOR READABILITY
        System.out.println();

        // BILLING STREET
        System.out.print("Billing Street: ");
        String billingStreet = scanner.nextLine();

        // BILLING CITY
        System.out.print("Billing City: ");
        String billingCity = scanner.nextLine();

        // BILLING STATE
        System.out.print("Billing State: ");
        String billingState = scanner.nextLine();

        // BILLING ZIP
        System.out.print("Billing Zip: ");
        String billingZip = scanner.nextLine();

        // CREATE A FREE LINE
        System.out.println();

        // SHIPPING STREET
        System.out.print("Shipping Street: ");
        String shippingStreet = scanner.nextLine();

        // SHIPPING CITY
        System.out.print("Shipping city: ");
        String shippingCity = scanner.nextLine();

        // SHIPPING STATE
        System.out.print("Shipping State: ");
        String shippingState = scanner.nextLine();

        // SHIPPING ZIP
        System.out.print("Shipping Zip: ");
        String  shippingZip = scanner.nextLine();

        // create the object of the StringBuilder
        StringBuilder shippingBuilder = new StringBuilder();

        // APPEND THE STRING VALUES
        shippingBuilder.append(fullName + "\n \n" + "Billing Address: \n");
        shippingBuilder.append(billingStreet + "\n");
        shippingBuilder.append(billingCity + ", ");
        shippingBuilder.append(billingState + " ");
        shippingBuilder.append(billingZip + "\n \n");

        shippingBuilder.append("Shipping Address: \n");
        shippingBuilder.append(shippingStreet + "\n");
        shippingBuilder.append(shippingCity + ", ");
        shippingBuilder.append(shippingState + " ");
        shippingBuilder.append(shippingZip + "\n");

        String shippingInformation = shippingBuilder.toString();

        System.out.println();
        System.out.println(shippingInformation);

    }
}

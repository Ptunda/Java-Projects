
package java;

import java.util.Scanner;

public class FullNameParser {

    public static void main(String[] args) {

        // create an object of the Scanner class
        Scanner scanner = new Scanner(System.in);

        // prompt the user to enter their name and trim any trailing space that could be entered by the user
        System.out.println("Please enter your full name:");
        String fullName = scanner.nextLine().trim();

        // find the position of the first space in the user's full name
        int firstSpaceIndex = fullName.indexOf(' ');

        // find the position of the last space in the user's full name
        int lastSpaceIndex = fullName.lastIndexOf(' ');

        // create a substring of the first name
        String firstName = fullName.substring(0, firstSpaceIndex);

        // extract the middle name of the user. we are checking of the firstSpace index and lastSpaceIndex are not the same
        String middleName;
        if (firstSpaceIndex != lastSpaceIndex) {
            // extract middle
            middleName = fullName.substring(firstSpaceIndex + 1, lastSpaceIndex);

            // convert the middle name to first initial of the middle name
            middleName = middleName.charAt(0) + ".";
        } else {
            middleName = "(none)";
        }

        String lastName = fullName.substring(lastSpaceIndex + 1);

        // Display the individual pieces of the name
        System.out.println("First name: " + firstName);
        System.out.println("Middle name: " + middleName);
        System.out.println("Last name: " + lastName);


    }

}

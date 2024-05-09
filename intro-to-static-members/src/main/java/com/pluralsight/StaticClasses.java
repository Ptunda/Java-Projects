package com.pluralsight;

public class StaticClasses {

    public static void main(String[] args) {

        String prefix = "Mr.,";
        String firstName = "Paul";
        String middleName = "Israel";
        String lastName = "Tunda";
        String suffix = "Sr.";

        String myName = NameFormatter.format(prefix, firstName, middleName, lastName, suffix);

        System.out.println(myName);


        String firstName1 = "Umrah";
        String lastName2 = "Tunda";

        String myName2 = NameFormatter.format(firstName1, lastName2);

        System.out.println("=================================================");

        System.out.println(myName2 + " is coming");

    }

}

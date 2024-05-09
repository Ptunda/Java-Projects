package com.pluralsight;

public class NameFormatter {


    public static String format(String firstName, String lastName){

        String name = format("", firstName, "", lastName, "");

        return name;

    }

    public static String format(String prefix, String firstName, String middleName, String lastName, String suffix){

        StringBuilder stringBuilder = new StringBuilder(); // to build a String

        stringBuilder.append(lastName).append(", ");

        // if there's a prefix, append it, otherwise ignore and continue
        if (!prefix.isEmpty()){

            stringBuilder.append(prefix).append(" ");

        }

        stringBuilder.append(firstName);


        // if there's a middle name get it's initial and append that. if not, ignore
        if (!middleName.isEmpty()){

            middleName = " " + middleName.substring(0,1) + ". ";

            stringBuilder.append(middleName);

        }


        // if user has a suffix, append it
        if (!suffix.isEmpty()){

            stringBuilder.append(suffix);

        }


        String name = stringBuilder.toString();

        return  name;
    }

    public static String format(String fullName){



        return fullName;
    }
}

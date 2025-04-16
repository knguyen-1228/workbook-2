package com.pluralsight;

import java.util.Scanner;

public class FullNameApplication {

    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        //Asking and receiving first name
        System.out.println("Enter your first name: ");
        String firstName = myScanner.nextLine().trim();

        //Asking and receiving middle name
        System.out.println("Enter your middle name: ");
        String middleName = myScanner.nextLine().trim();

        //Asking and receiving last name
        System.out.println("Enter your last name: ");
        String lastName = myScanner.nextLine().trim();

        //Asking and receiving suffix name
        System.out.println("Enter your suffix name: ");
        String suffix = myScanner.nextLine().trim();

        //using trim and printing
        StringBuilder fullName = new StringBuilder();

        fullName.append(firstName);

        if (!middleName.isEmpty()){
            fullName.append(" ").append(middleName);
        }

        fullName.append(" ").append(lastName);

        if (!suffix.isEmpty()){
            fullName.append(", ").append(suffix);
        }


        System.out.println(fullName);








    }
}

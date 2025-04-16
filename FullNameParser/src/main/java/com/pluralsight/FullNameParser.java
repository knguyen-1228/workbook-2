package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        //Created user input while storing and trim string as fullName
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = myScanner.nextLine().trim();
        // Splitting sstring by " "
        String[] namePieces = fullName.split(" ");
        // Creating 3 string variables
        String firstName = "";
        String middleName = "";
        String lastName = "";
        // if else state  to give variable values
        if(namePieces.length == 3){
            firstName = namePieces[0];
            middleName = namePieces[1];
            lastName = namePieces[2];
        }
        else if(namePieces.length == 2){
            firstName = namePieces[0];
            lastName = namePieces[1];
            if(middleName.isBlank()){
                middleName = "(none)";
            }
        }else{
            System.out.println("Invalid Input");
        }
        // print the output
        System.out.println("First Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " +  lastName);




    }
}

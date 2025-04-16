package com.pluralsight;

import java.util.Scanner;

public class FullNameParser {
    public static void main(String[] args) {
        Scanner myScanner = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        String fullName = myScanner.nextLine().trim();

        String[] namePieces = fullName.split(" ");
        String firstName = "";
        String middleName = "";
        String lastName = "";
        if(namePieces.length == 3){
            firstName = namePieces[0];
            middleName = namePieces[1];
            lastName = namePieces[2];

        }
        else{
            firstName = namePieces[0];
            lastName = namePieces[1];
            if(middleName.isBlank()){
                middleName = "(none)";
            }
        }
        System.out.println("First Name: " + firstName + "\nMiddle Name: " + middleName + "\nLast Name: " +  lastName);




    }
}

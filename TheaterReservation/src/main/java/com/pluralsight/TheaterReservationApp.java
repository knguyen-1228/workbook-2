package com.pluralsight;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class TheaterReservationApp {

    static Scanner myScanner = new Scanner(System.in);
    static DateTimeFormatter inputFormatter = DateTimeFormatter.ofPattern("M/d/yyyy");

    public static void main(String[] args) {

        String fullName = askQuestions("Please enter your name:\t");

        String[] namePieces = fullName.split(" ");

        LocalDate date = LocalDate.parse(askQuestions("What date will you be coming (mm/dd/yyyy):\t"), inputFormatter);

        String numTickets = askQuestions("How many tickets would you like?\t");

        displayName(displayNameAsParts(namePieces), date, numTickets);

    }

    public static String askQuestions(String questions) {

        System.out.print(questions);
        String answer = myScanner.nextLine();

        return answer.trim();

    }
    public static String displayNameAsParts(String[] namePartsArray){
        String firstName = namePartsArray[0];
        String lastName = namePartsArray[1];

        return lastName + ", " + firstName;

    }


    public static void displayName(String fullName, LocalDate date, String numTicketes){

        System.out.println(numTicketes + " ticket(s) reserved for " + date + " under " + fullName);

    }
}

package com.pluralsight;

import java.util.Scanner;

public class AddressBuilder {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Please provide the following information");
        System.out.println("------------------------------------------");

        String fullName = askQuestion("Full name:\t");

        String billingStreet = askQuestion("Billing Street:\t");
        String billingCity = askQuestion("Billing City:\t");
        String billingState = askQuestion("Billing State:\t");
        String billingZip = askQuestion("Billing Zip:\t");

        String shippingStreet = askQuestion("Shipping Street:\t");
        String shippingCity = askQuestion("Shipping City:\t");
        String shippingState = askQuestion("Shipping State:\t");
        String shippingZip = askQuestion("Shipping Zip:\t");

        displayInfo(fullName,billingState,billingCity,billingStreet,billingZip,shippingStreet,shippingCity,shippingState,shippingZip);
    }
    public static String askQuestion(String question){
        System.out.print(question);
        String answer = myScanner.nextLine();

        return answer.trim();
    }

    public static void displayInfo(String fullName, String billingState, String billingCity, String billingStreet, String billingZip, String shippingStreet, String shippingCity, String shippingState, String shippingZip){
        StringBuilder billingShipping = new StringBuilder();
        //Name
        billingShipping.append("Name:\t").append(fullName).append("\n\n");
        //Billing
        billingShipping.append("Billing Address:\t\n").append(billingStreet).append("\n").append(billingCity.toUpperCase()).append(", ").append(billingState.toUpperCase()).append(" ").append(billingZip);
        //Shipping
        billingShipping.append("\n\nShipping Address:\t\n").append(shippingStreet).append("\n").append(shippingCity.substring(0,1).toUpperCase()).append(", ").append(shippingState.toUpperCase()).append(" ").append(shippingZip);
        System.out.print(billingShipping);
    }
}

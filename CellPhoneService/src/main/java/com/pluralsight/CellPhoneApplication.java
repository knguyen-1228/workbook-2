package com.pluralsight;

import java.util.Scanner;

public class CellPhoneApplication {

    static Scanner myScanner = new Scanner(System.in);

    public static void main(String[] args) {

        CellPhone myPhone = new CellPhone();

        System.out.print("What is the serial number?\t");
        String sn = myScanner.nextLine();

        System.out.print("What the model of the phone?\t");
        String model = myScanner.nextLine();

        System.out.print("Who is the carrier?\t");
        String carrier = myScanner.nextLine();

        System.out.print("What is the phone number?\t");
        String phoneNumber = myScanner.nextLine();

        System.out.print("Who is the owner?\t");
        String owner = myScanner.nextLine();

        myPhone.setSerialNum(Integer.parseInt(sn));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNum(phoneNumber);
        myPhone.setOwner(owner);

        System.out.println("SN:  " + myPhone.getSerialNum());
        System.out.println("Model:  " + myPhone.getModel());
        System.out.println("Carrier:  " + myPhone.getCarrier());
        System.out.println("Phone Number:  " + myPhone.getPhoneNum());
        System.out.println("Owner:  " + myPhone.getOwner());

    }
}

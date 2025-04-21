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

        System.out.print("What is the number you would like to dial?\t");
        String dial = myScanner.nextLine();

        myPhone.setSerialNum(Integer.parseInt(sn));
        myPhone.setModel(model);
        myPhone.setCarrier(carrier);
        myPhone.setPhoneNum(phoneNumber);
        myPhone.setOwner(owner);
        myPhone.setDial(dial);

        /*
        System.out.println("SN:  " + myPhone.getSerialNum());
        System.out.println("Model:  " + myPhone.getModel());
        System.out.println("Carrier:  " + myPhone.getCarrier());
        System.out.println("Phone Number:  " + myPhone.getPhoneNum());
        System.out.println("Owner:  " + myPhone.getOwner());

         */

        //creating new phone
        System.out.println("\n\n");
       CellPhone phone1 = new CellPhone();
       phone1.setPhoneNum("855-555-2222");
       phone1.setOwner("Kevin Nguyen");

       // Using display method to show the info
       System.out.println("----Info for My Phone----");
       display(myPhone);
       System.out.println("----Info for Phone 2----");
       display(phone1);
       System.out.println("\n");

       //having my phone call phone1
       myPhone.dialPhone(phone1.getPhoneNum());

       //having phone 1 call my phone
       System.out.println("\n");
       phone1.dialPhone(myPhone.getPhoneNum());
       System.out.println("\n");

       CellPhone phone2 = new CellPhone(123,"iphone","att","1231231234","kevin","7897897890");

       display(phone2);

       System.out.println("\n");
       myPhone.dialPhone((phone2.getPhoneNum()));
       System.out.println("\n");



    }
    static void display(CellPhone phone){
        System.out.println("SN:  " + phone.getSerialNum());
        System.out.println("Model:  " + phone.getModel());
        System.out.println("Carrier:  " + phone.getCarrier());
        System.out.println("Phone Number:  " + phone.getPhoneNum());
        System.out.println("Owner:  " + phone.getOwner());
    }

}

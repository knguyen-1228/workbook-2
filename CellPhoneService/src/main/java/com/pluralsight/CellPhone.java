package com.pluralsight;

public class CellPhone {

    // properties/variables that describe cellphone
    private int serialNum;
    private String model;
    private String carrier;
    private String phoneNum;
    private String owner;
    private String dial;

    //is the constructor
    //decided the values for the prop
    public CellPhone(){
        this.serialNum = 0;
        this.model = "";
        this.carrier = "";
        this.phoneNum = "";
        this.owner = "";
        this.dial = "";
    }

    public CellPhone(int sN, String model, String carrier, String phoneNum, String owner, String dial){
        this.serialNum = sN;
        this.model = model;
        this.carrier = carrier;
        this.phoneNum = phoneNum;
        this.owner = owner;
        this.dial = dial;
    }


    //method shows how you make a phone call another phone
    public void dialPhone(String phoneNumber){
        System.out.println(this.getOwner() + "'s phone is calling " + phoneNumber);

    }

    //getter and setter (line 22 - 60)
    public int getSerialNum() {
        return serialNum;
    }

    public void setSerialNum(int serialNum) {
        this.serialNum = serialNum;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getPhoneNum() {
        return phoneNum;
    }

    public void setPhoneNum(String phoneNum) {
        this.phoneNum = phoneNum;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public String getDial() {
        return dial;
    }

    public void setDial(String dial) {
        this.dial = dial;
    }
}

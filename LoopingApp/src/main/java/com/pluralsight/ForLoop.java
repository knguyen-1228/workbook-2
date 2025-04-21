package com.pluralsight;

public class ForLoop {
    public static void main(String[] args) throws InterruptedException{
        for (int i=10;i<=10;i--){
            Thread.sleep(1000);
            if(i==0){
                System.out.println("Launch");
                break;
            }
            System.out.println(i);
        }
    }
}

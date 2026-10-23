package com.pluralsight;

public class CellPhoneApplication {
    public static void main(String[] args) {

        String sillyString = "I'm a silly string";
        sillyString = sillyString.trim();

        CellPhone myPhone = new CellPhone(123, "iPhone");
        myPhone.setModel("Android");
        myPhone.display();


        System.out.println("serial number: " + myPhone.getSerialNumber() +
                " model: " + myPhone.getModel());
    }
}

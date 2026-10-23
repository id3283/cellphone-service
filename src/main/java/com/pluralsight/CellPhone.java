package com.pluralsight;

public class CellPhone {
    private int serialNumber;
    private String model;

    public CellPhone() {
        this.serialNumber = 0;
        this.model = "";
    }

    public CellPhone(int serialNumber, String model) {
        this.serialNumber = serialNumber;
        this.model = model;
    }

    //region getters/setters
    public int getSerialNumber() {
        return this.serialNumber;
    }
    public void setSerialNumber(int serialNumber) {
        this.serialNumber = serialNumber;
    }

    public String getModel() {
        return this.model;
    }
    public void setModel(String model) {
        this.model = model;
    }
    //endregion

    public void display() {
        System.out.println("SN: " + this.serialNumber +
                " Model: " + this.model);
    }
}

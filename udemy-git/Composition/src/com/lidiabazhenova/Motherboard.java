package com.lidiabazhenova;

public class Motherboard {

    private String model;
    private String manufacturer;
    private int ramSlots;
    private int cardSloats;
    private String bios;

    public Motherboard(String model, String manufacturer, int ramSlots, int cardSloats, String bios) {
        this.model = model;
        this.manufacturer = manufacturer;
        this.ramSlots = ramSlots;
        this.cardSloats = cardSloats;
        this.bios = bios;
    }

    public void loadprogram(String programName) {
        System.out.println("Program " + programName + "is now loading...");
    }


    public String getModel() {
        return model;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public int getRamSlots() {
        return ramSlots;
    }

    public int getCardSloats() {
        return cardSloats;
    }

    public String getBios() {
        return bios;
    }
}

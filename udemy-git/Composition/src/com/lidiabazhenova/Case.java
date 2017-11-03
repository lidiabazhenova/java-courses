package com.lidiabazhenova;

public class Case {
    private String model;
    private String manufacture;
    private String powerSupply;
    private Dimentions dimentions;

    public Case(String model, String manufacture, String powerSupply, Dimentions dimentions) {
        this.model = model;
        this.manufacture = manufacture;
        this.powerSupply = powerSupply;
        this.dimentions = dimentions;
    }

    public void pressPowerButton() {
        System.out.println("Power button pressed");
    }

    public String getModel() {
        return model;
    }

    public String getManufacture() {
        return manufacture;
    }

    public String getPowerSupply() {
        return powerSupply;
    }

    public Dimentions getDimentions() {
        return dimentions;
    }
}

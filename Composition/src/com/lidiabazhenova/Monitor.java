package com.lidiabazhenova;

public class Monitor {

    private String model;
    private String munufacturer;
    private int size;
    private Resolution nativeResolution;

    public Monitor(String model, String munufacturer, int size, Resolution nativeResolution) {
        this.model = model;
        this.munufacturer = munufacturer;
        this.size = size;
        this.nativeResolution = nativeResolution;
    }

    public void drawPixelAt(int x, int y, String color) {
        System.out.println("Drawing pixel at " + x + "," + y + " in colour " + color);
    }

}

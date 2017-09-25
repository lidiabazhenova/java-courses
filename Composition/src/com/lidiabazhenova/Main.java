package com.lidiabazhenova;

public class Main {

    public static void main(String[] args) {
        Dimentions dimentions = new Dimentions(20, 20, 5);
        Case thecase = new Case("222B", "Dell", "240",
                dimentions);

        Monitor theMonitor = new Monitor("27inch Beast", "Acer",
                27, new Resolution(2540, 1440));

        Motherboard motherboard = new Motherboard("BJ-200", "Asus", 4, 6, "v2.44");

        PC thePC = new PC(thecase, theMonitor, motherboard);

        thePC.powerUp();

    }
}

package ru.lesson.lessons;

public class Calculator {

    private double result;

    public void add(double... params) {
        for (Double param : params) {
            this.result += param;
        }
    }

    public void sub(double... params) {
        for (Double param : params) {
            this.result = params[0]-params[1];
        }
    }

    public void div(double... args) {
        if (args.length > 0) {
            this.result = args[0] / args[1];

        } else {
            System.out.println("enter numbers");
        }
    }

    public double getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}	



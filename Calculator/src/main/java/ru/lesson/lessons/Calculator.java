package ru.lesson.lessons;

import java.util.Arrays;

import static java.util.Arrays.copyOfRange;

public class Calculator {

    private double result;

    public void add(double... params) {
        for (Double param : params) {
            this.result += param;
        }
    }

    public void sub(double... args) {
        if (args.length > 0) {
            this.result = args[0] - args[1];
        }
    }


    public void mul(double... args) throws UserException {
        if (args.length > 1) {
            this.result = args[0] * args[1];
        } else {
            throw new UserException("You'd enter args");
        }
    }

    public void div(double... args) throws UserException {
        if (args.length > 1) {
            this.result = args[0];
            if (args.length > 1) {
                for (final double param: copyOfRange(args, 1, args.length)) {
                    if (param == 0) {
                        throw new UserException("division by 0");
                    } else {
                        this.result /= param;
                    }
                }
            }
        } else {
            throw new UserException("You'd enter args");
        }
    }

    public double getResult() {
        return this.result;
    }

    public void cleanResult() {
        this.result = 0;
    }
}	



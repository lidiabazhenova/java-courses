//package ru.lesson.lessons;

public class Calculate {
    public static void main(String[] arg) {
        System.out.println("Calculate...");
        int first = Integer.valueOf(arg[0]);
        int second = Integer.valueOf(arg[1]);
        int add = first + second;
        int subt = first - second;
        int mult = first * second;
        double div = (double) first / (double) second;
        double sqrt = Math.pow(first, second);

        System.out.println("Addition=" + add);
        System.out.println("Subtraction=" + subt);
        System.out.println("Multiplication=" + mult);
        System.out.println("Division=" + div);
        System.out.println("Power=" + sqrt);


    }
}
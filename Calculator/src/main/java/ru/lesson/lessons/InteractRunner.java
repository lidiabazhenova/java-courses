package ru.lesson.lessons;

import java.util.Scanner;

public class InteractRunner {
    public static void main(String[] arg) {
        final int ADDITION = 1;
        final int SUBSTRACTION = 2;
        final int MULTIPLICATION = 3;
        final int DIVISION = 4;

        Scanner reader = new Scanner(System.in);
        try {
            Calculator calc = new Calculator();
            String exit = "no";
            while (!exit.equals("yes")) {
                System.out.println("Enter first arg:");
                String first = reader.next();
                System.out.println("Enter second arg:");
                String second = reader.next();
                menu();
                int operation = reader.nextInt();
                switch (operation) {
                    case ADDITION: {
                        calc.add(Double.valueOf(first), Double.valueOf(second));
                        System.out.println("Result:" + calc.getResult());
                        calc.cleanResult();
                        break;
                    }
                    case SUBSTRACTION: {
                        calc.sub(Double.valueOf(first), Double.valueOf(second));
                        System.out.println("Result:" + calc.getResult());
                        calc.cleanResult();
                        break;
                    }
                    case MULTIPLICATION: {
                        try {
                            calc.mul(Double.valueOf(first), Double.valueOf(second));
                        } catch (UserException e) {
                            System.out.println(e.getMessage());
                            System.out.println("Please, enter two args");
                        }
                        System.out.println("Result:" + calc.getResult());
                        calc.cleanResult();
                        break;
                    }
                    case DIVISION: {
                        try {
                            calc.div(Double.valueOf(first), Double.valueOf(second));
                        } catch (Exception e) {
                            System.out.println(e.getMessage());
                            System.out.println("Please, enter two args");
                        }
                        System.out.println("Result:" + calc.getResult());
                        calc.cleanResult();
                        break;
                    }
                }

                System.out.println("Exit:yes/no");
                exit = reader.next();
            }

        } finally {
            reader.close();
        }

    }

    public static void menu() {
        System.out.println("Choose operation");
        System.out.println("Enter '1' for addition\n" +
                "      '2' for subtraction\n" +
                "      '3' for multiplication\n" +
                "      '4' for division\n" +
                "      '5' for power");
    }

}





				

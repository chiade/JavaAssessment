package ControlFlowLoop;

import java.util.Scanner;

public class MovieDiscounts {

    public static int getInput(String startMsg)
    {
        boolean exit = true;
        Scanner scan = new Scanner(System.in);
        int input = 0;

        do {
            try {
                System.out.print(startMsg);
                input = Integer.parseInt(scan.nextLine());

                if (input > 0) {
                    exit = true;
                } else {
                    System.out.println("Error: Negative number or Zero! Please try again.");
                }
            } catch (NumberFormatException e) {
                //This block of code will be executed Exception is thrown by Java
                System.out.println("Error: Not a number! Enter again.");
            }
        } while (!exit);

        return input;
    }
    public static void discounts() {
        //Part 2: Movie discounts
        double price = 7.00;
        final int perTix = 7;
        int tixNum = 0;
        String startMsg;
        startMsg = "Please enter your age:";

        //Call getInput Method
        int input = getInput(startMsg);
        if (input > 60) {
            price = perTix - (perTix * 0.55);
        }
        else if (input < 5) {
            price = perTix - (perTix * 0.60);
        }
        else {
            startMsg = "Please enter the number of tickets:";
            tixNum = getInput(startMsg);

            if (tixNum >= 2) {
                price = tixNum * (perTix - (perTix * 0.30));
            } else {
                price = perTix;
            }
        }
        System.out.println("Your age is " + input + ", and your ticket price is $" + String.format("%.2f.", price));
    }
}

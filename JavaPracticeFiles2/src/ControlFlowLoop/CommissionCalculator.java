package ControlFlowLoop;

import java.util.Scanner;

public class CommissionCalculator {

    public static void commission()
    {
        //1) User can input sales figure of the employee
        //return type of String, but want to store return in int

        double commission = 0.0;
        double userCommission = 0.0;
        int userInput = 0;
        boolean isInputError = true;
        Scanner scan = new Scanner(System.in);

        do {
            try {
                System.out.print("Please enter sales figure: ");
                userInput = Integer.parseInt(scan.nextLine());

                // this statement will not execute if there is exception
                //negative number can be checked in a customised exception
                //e.g. bank system, deposit(), withdraw(), transfer()
                //check if balance (100) is 0 or negative, cannot withdraw(), transfer()
                //create customised exception (throw an error if balance is 0 or -ve
                if (userInput > 0) {
                    isInputError = false;
                }
                else {
                    System.out.println("Error: negative number! Try again!");
                }
            }
            catch (NumberFormatException e) {
                //This block of code will be executed exception is thrown by Java
                System.out.println("Error. not a number! Please enter a number");
            }
        } while (isInputError); // while loop will keep looping if isInputError is true

        //2) Calculate the commission
        if (userInput > 10000) {
            commission = 0.3;
        }
        else if (userInput >= 5000) {
            commission = 0.2;
        }
        else if (userInput >= 1000) {
            commission = 0.1;
        }

        userCommission = userInput * commission; // no need else for NA cos original commission = 0.0

        System.out.println(String.format("Your sales figure is $%d. Your commission is $%.2f.", userInput, userCommission));


    }
}

package ControlFlowLoop;

import java.sql.SQLOutput;
import java.util.Date;
import java.util.Scanner;

public class MyControlFlowLoop {

    public static void practiceControlFlowLoop() {

        //Control Flow - if/else
        final int ageLimit = 18;
        int age = 25;

        //age < 18 and age > 80 - logical operators (&&, ||, !)

        if (age < ageLimit) {
            System.out.println("Too young/old to make purchase");
        } else {
            System.out.println("can make purchase");
        }

        //ternary operator (condition)
        String result = (age < ageLimit) ? "Customer is too young/old, cannot make " + "purchase" : "Customer can make purchase";
        System.out.println(result);

        //Example of Switch
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter a number for current season: ");
        int getSeason = scan.nextInt();     //assume user input is a number

        switch (getSeason) {
            case 1:
                System.out.println("Winter");
                break;
            case 2:
                System.out.println("Spring");
                break;
            case 3:
                System.out.println("Summer");
                break;
            case 4:
                System.out.println("Autumn");
                break;
            default:
                System.out.println("Invalid number");
        }

        //-----------------------Practice 1: if-else statement
        String message = "";
        System.out.println("\nControl Flow & Loop: Practice 1 - Exercise 2");
        //Get name from user input
        Scanner scanName = new Scanner(System.in);
        System.out.print("Please your name: ");
        String getName = scanName.nextLine();

        while (true) {
//Get score from user input
            Scanner scanScore = new Scanner(System.in);
            System.out.print("Please enter your score to check your grade: ");
            int getScore = scanScore.nextInt();

//Invalid score not between 0-100: repeat loop to ask for score again
            if (!(getScore >= 0 && getScore <= 100)) {
                System.out.println("Invalid number, please enter a valid score (0-100).");
            }
            else {
//Score = 85 to 100: print name and grade, end loop
            if (getScore >= 85) {
                message = "Congrats, you scored an 'A'!";
            }
//Score = 75 and above: print name and grade, end loop
            else if (getScore >= 75) {
                message = "Good Job, you scored a 'B'!";
            }
//Score = 50 and above: print name and grade, end loop
            else if (getScore >= 50) {
                message = "You scored a 'C'. Try harder next time!";
            }
//Score = 0 to 50: print name and grade, end loop
            else {
                message = "You have failed. Please come and see me.";
            }
            break;
        }
    }
    System.out.println(String.format("Hi %s. %s", getName, message));

//-------------------------------------Practice 2: switch statement
        Scanner scan2 = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int getMonth = scan2.nextInt();     //assume user input is a number
            switch (getMonth) {
                case 1:
                    System.out.println("January");
                    break;
                case 2:
                    System.out.println("February");
                    break;
                case 3:
                    System.out.println("March");
                    break;
                case 4:
                    System.out.println("April");
                    break;
                case 5:
                    System.out.println("May");
                    break;
                case 6:
                    System.out.println("June");
                    break;
                case 7:
                    System.out.println("July");
                    break;
                case 8:
                    System.out.println("August");
                    break;
                case 9:
                    System.out.println("September");
                    break;
                case 10:
                    System.out.println("October");
                    break;
                case 11:
                    System.out.println("November");
                    break;
                case 12:
                    System.out.println("December");
                    break;
                default:
                    System.out.println("Invalid number");
            }

            //------------------------------Practice 3:
            int counter = 0;
            while (counter<=10) {
                System.out.println(counter);
                counter++;
            }
        int counter2 = 1;
        while(counter2 <= 15){
            System.out.printf("%d Potato%n",counter2);
            counter2 ++;
        }
        System.out.println("Loop Finished");

        String s = "Desmond";
        int ii = 0;
        while (ii<=15) {
            System.out.println(s);
            ii++;
        }

        int iii = 0;
        do {
            System.out.println(iii+1 + ")" + s);
            iii++;
        } while (iii <10);

        for (int iv = 0; iv < 10; iv++ ) {
            System.out.println(s);
        }

        //checking if a form validation is ok
        //boolean isValid = false;
        //while (isValid)
        //{
        // ask user to keep filling the form
        //}

        for (int m = 1; m < 11; m++ ) {
            if (m == 7) {
                continue;
            }
            System.out.println(m);
        }
    }
}


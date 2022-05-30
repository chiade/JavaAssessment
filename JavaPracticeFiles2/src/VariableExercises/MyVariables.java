package VariableExercises;

import java.util.Scanner;

public class MyVariables {

    // var myX = 100; - Instance variable and var is not allowed here
    public static void practiceVariable() {
        //create to practice Java variables, datatype, operators
        //System.out.println("In MyVariables class");

        //JavaScript: var, let, const
        var x = 100;    //Type inference

        //Non-primitive data type - as an object, Java built-in objects
        //Javascript - browser built-in objects e.g. Date, Array, Math, String
        // - Array forEach(). Math random(), String match(), Date getFULLYear()
        //Java - String, Arrays and Classes
        // - String format(), Array length
        //These data type has its own properties and methods
        String name = "Jean Looi"; //Double quote represent a String
        String id = "P012345";  //String is just a list of Chars

        //Primitive data type - store a single value of that type
        //specify the size and type of variable values, and it has no additional methods
        int age;
        final char gender = 'F';  //single quote represent a Char
        float salary = 1600.50f;
        boolean isHungry = false;
        byte myNum1 = 100;
        //if there is no letter behind the decimal, it is a double data type
        double totalCost = 12000.80;

        age = 18; //assign value later
        //gender = 'M'; //incorrect. cannot reassign to a final variable

        //Hello my name is Jean Looi, my id is P012345. I am 18 years old, with a salary of 1600.50. The total cost that i need to pay is $12000.80

        System.out.println("Hello my name is " + name + ", my id is " + id);   //shortcut use "sout" to print
        //Javascript backtick `` == Java string format method
        System.out.println(String.format("Hello my name is %s, my id is %s. I am %d years old, with a salary of %.2f. \nThe total cost that i need to pay is $%.2f",name,id,age,salary,totalCost));

        //Java comparison operators
        int a = 6, b = 10;
        System.out.println(a == b); //print false
        System.out.println(a < b);  // print true

        //comparing string is different - there are 4 methods we can use to compare 2 strings
        String s1 = "hello";
        String s2 = "hello";
        System.out.println(s1 == s2);   //print true

        //String, Array, Class are objects. Create new instance object with keyword 'new'
        //const product = new ProductController(); //example in JS
        //const student = new Student();        // example in JS
        String s3 = new String("hello");
        System.out.println(s1 == s3);   //print false
        System.out.println(s1.equals(s2));  //print true - right way instead of ==

        if (s1.equals(s3)) {
            System.out.println("Matched");
        }
        else {
            System.out.println("Not match");
        }

        String s4 = "A";
        String s5 = new String("a");
        System.out.println(s4.compareTo(s5));   //print 65-97 = -32

        //Java Application Memory Allocation
        /*
        There are 2 kinds of memory used in Java. They are called stack and heap memory. stack memory store primitive data types and addresses (postal code) of objects (String, Array, Class)
        - object values are stored in the heap memory
         */

        //An example of scanner package
        //System.out - Java to output/display content onto the terminal
        //System.in - Java to input/get content from the terminal
        Scanner getInput = new Scanner(System.in);
        System.out.print("Enter a name: "); //print 1 line; println 2 lines
        String userName = getInput.nextLine();
        System.out.println("My name is : " + userName);

        System.out.print("Enter your age :");
        int myAge = getInput.nextInt();
        //int age = 90; //error cannot redefine a variable

        System.out.println("My age is:" + myAge);


//------------------------------------
        String name1 = "Desmond chia";
        int age1 = 48;
        String email1 = "chia@hotmail.com";
        System.out.println(String.format("My name is %s age %d email is %s.", name1, age1, email1));

        char myGender = 'F';
        boolean isJavaFun = true;
        float myFloat = 1.5f;
        double myDouble = 99.99d;
        double mySalary = 1200.50;

        System.out.println(String.format("My gender is %c, and my salary is %.2f. Java is fun! %b",myGender, mySalary, isJavaFun));

        //---------------------Practice 2: Operators
        float price = 0;
        final float gst = 0.07f;
        Scanner scan = new Scanner(System.in);
        System.out.print("Please enter the price of item: ");
        price = Integer.parseInt(scan.nextLine());
        float totalPrice = price + (price * gst);
        System.out.println(String.format("The cost is $%.2f and the final price is $%.2f.",price, totalPrice));

        String defaultValue = "HelloWorld";
        Scanner scanM = new Scanner(System.in);
        System.out.print("Please enter a string: ");
        String userInput = scanM.nextLine();
        if(defaultValue.equalsIgnoreCase(userInput)){
            System.out.println("Match");
        }
        else {
            System.out.println("Not Match");
        }

    }

}

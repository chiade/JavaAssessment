package ExceptionHandling;

public class Main {

    public static void checkAge(int age) {
        //Example of using the throw keyword to create a custom error w ArithmeticException w a biz logic
        //age < 18, throw the ArithmeticException with a message to inform user
            try{
                if (age < 18) {
                throw new ArithmeticException("Access denied - You must be at least 18 years old.");
                //system will stop the execution and show the exception being thrown
            }
            else {
                System.out.println("Access granted - You are old enough!");
            }
        }
        catch (ArithmeticException e) {
            System.out.println(e);
        }
    }
    public static void main(String[] args) {

        Calculator calculator = new Calculator();

        //ask user to input 2 numbers into the terminal//can have multiple try..catch statements for different purposes
        //for different arithmetic calculations (add, subtract, multiple, division)
        //2 + 4 * 3 / 2

        try {
            int multiply = calculator.multiply(2, 3);
            System.out.println("multiple: " + multiply);
            System.out.println("divide : " + calculator.divide(10, 2));
            System.out.println("divide : " + calculator.divide(0, 5));
            System.out.println("divide : " + calculator.divide(5, 0));
            //system will auto throw the exception
            //System.out.println("add : " + calculator.add(5, 5));
            //System.out.println("subtract : " + calculator.subtract(20, 5));
        }
        catch (ArithmeticException e) {
            System.out.println("An arithmetic error occurs: " + e);
            //ask user to key in again, reset my variables etc
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("An ArrayIndexOutOfBounds error occurs: " + e);
        }
        catch (Exception e) {
            System.out.println("Other error occurs: " + e);
        }
        finally {
            //cleaning ups e.g. close a database connection, remove variables from the memory, setting default value back to the variables
            System.out.println("add : " + calculator.add(5, 5));
            System.out.println("subtract : " + calculator.subtract(20, 5));
        }
        checkAge(15); // Set age to 15 (which is below 18...)

        //Example of NumberArray Exception and IndexOutOfBoundsException
        int userInput = 8;
        int[] arr = new int[10];

        try {
            arr[userInput] = Integer.parseInt("aaa");
        }
        catch (IndexOutOfBoundsException e) {
            System.out.println("No such element index exist in the array");
            //and do other stuff
        }
        catch (NumberFormatException e) {
            System.out.println("Please enter a valid number.");
        }
        catch (Exception e) {
            System.out.println("All other errors");
        }
    }
}



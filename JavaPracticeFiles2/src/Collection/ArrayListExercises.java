package Collection;

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collections;

public class ArrayListExercises {
        public static void setArray() {
        //1) Standard Array Object - built-in Java package (like JS)
        //- there are some restriction when using standard Array Object
            //has its own properties and methods (e.g. length) and methods (toString())

        String myName = "Jean Looi";
        String [] names = {"Jean", "Tom", "Jerry", "Happy"};
        int[] ages = {19, 25, 32, 40};

        //can reassign value to individual element in the standard array
            names[1] = "Tommy";

            System.out.println(Arrays.toString(names));
            System.out.println(String.format("The size of the array is %d", names.length));

            //1) My name is Jean
            //2) My name is Tommy
            //3) My name is Jerry
            for (String name: names)
            {
                System.out.println("Hi, my name is " + name);
            }

            //Example: add 1 more name in the standard array object
            //Standard Array object has a fixed array length when it first created
            //names[names.length] = "June";   //June is index 4 of array
            //System.out.println(names);  //cannot do this!

            //Standard Array Object is useful for fixed array size that we can retrieve from the database i.e. 12 months, country list, country code

            int countryCodeSize = 6;    //65, 60, 81, .....
            // can create a standard array object with the size of 6
            int[] countryCode = new int[countryCodeSize];
            countryCode[0] = 65;
            countryCode[1] = 60;

            //countryCode[6] = 655;   //ArrayIndexOutOfBoundsException

            //2) Collection Object - additional packages from util to support dynamic array manipulation (insertion, sort, search, deletion)
            //e.g. ArrayList, HashSet, HashMap
            //Create an ArrayList to store all my student's name
            //ArrayList<String> myStudentNames = new ArrayList<String>();

            //After Java JDK 8, Type Inference
            int productItems = 50;
            ArrayList<String> myStudentNames = new ArrayList<>(3);

            //ArrayList is a Class, it has its own properties and methods
            //myStudentNames[0] = "aaaa"; //cannot access the element directly

            myStudentNames.add("Jean Looi");
            myStudentNames.add("Tommy Tan");
            myStudentNames.add("Jerry Lim");
            myStudentNames.add("June Liu");

            //actually - it will call a method called toString() from the ArrayList Class
            //to display - overriding method ?
            System.out.println(myStudentNames);

            System.out.println(myStudentNames.get(2));
            myStudentNames.set(0, "Peter Lim");
            System.out.println(myStudentNames);

            myStudentNames.remove(0); // can find and remove in ArrayList
            System.out.println(myStudentNames.size());

            for (String name: myStudentNames) {
                System.out.println("My name is " + name);
            }

            //ArrayList is known as Generic Class, needs to work with different data types
            //create an ArrayList for String, int, char, float, double, Class object
            //Primitive Data type: int, char, float, double
            //Non-primitive: String, Array, Class (object)
            //ArrayList belongs to List data structure (linear)

            //cannot create an ArrayList by using the primitive data type because ArrayList class takes in only Object
            //so for primitive data types, need to apply a Wrapper Class

            int input = 100;

            ArrayList<Integer> myItems = new ArrayList<>();
            myItems.add(2);
            myItems.add(20);
            myItems.add(200);

            //In the add method from the ArrayList Class, there are algorithms to perform autoboxing (convert primitive type to the corresponding Wrapper Class
            //input is primitive data type, is converted to Integer Class Object
            myItems.add(input);
            System.out.println(myItems);

            //declare a primitive data type to get value from ArrayList
            //Unboxing - converting an object of a Wrapper Class to its corresponding primitive type
            int getItem = myItems.get(1); //get element index 1; return integer

            //ArrayList can contain duplicate values. Navigate thro' the ArrayList
            //depends on the index of the elements in the array for remove or edit
            ArrayList<Character> myChars = new ArrayList<>();
            myChars.add('K');   //index0
            myChars.add('F');   //index1
            myChars.add('C');
            myChars.add('F');   //index 3
            myChars.add('F');   //index 4
            myChars.add('C');
            System.out.println(myChars);
            char getChar = myChars.get(1);
            System.out.println(getChar);

            Collections.sort(myChars);
            System.out.println(myChars);

            myChars.set(4, 'Z');

 //------------------------------Practice 1: Array
            int[] arr = new int[2];
            arr[0] = 1;
            arr[1] = 2;
            System.out.println(arr[0]);

            ArrayList<Integer> arrL = new ArrayList<Integer>(2);
            arrL.add(1);
            arrL.add(2);
            System.out.println(arrL.get(0));

            int[] arr1 = new int[3];
            arr1[0] = 1;
            arr1[1] = 2;
            arr1[2] = 3;

            ArrayList<Integer> arrL1 = new ArrayList<Integer>();
            arrL1.add(1);
            arrL1.add(2);
            arrL1.add(3);
            arrL1.add(4);
            System.out.println(arrL1);

            ArrayList<String> cars = new ArrayList<String>();
            cars.add("Volvo");
            cars.add("BMW");
            cars.add("Ford");
            cars.add("Mazda");
            System.out.println(cars);

            int size = cars.size();
            System.out.println("Total cars: " + size);

            String secondCar = cars.get(1);
            System.out.println("Second car: " + secondCar);

            cars.remove(2);
            System.out.println(cars);

            for (String car: cars) {
                System.out.println("Cars are: " + cars);
            }
            //Exercise 4: create Array (built-in)

            int[] arr2 = new int[5];
                int count = 5;
                for (int i = 0; i < arr2.length; i++) {
                    arr2[i] = count;
                    count += 5;
                }
            System.out.println("Original Array: " + Arrays.toString(arr2));

            int[] newArr = new int[arr2.length-1];
            int removeNum = 20;
                for (int j=0, k=0; j<arr2.length; j++) {
                    if (arr2[j] != 20) {
                        newArr[k] = arr2[j];
                        k++;
                    }
                System.out.println("New Array " + Arrays.toString(newArr));
                }

                //Exercise 5: declare ArrayList
                //Solution #1
            ArrayList<Integer> myArray= new ArrayList<Integer>(10);
                //insert first 10 numbers into array with .add() method
                 for (int i = 1;i<=10; i++) {
                    myArray.add(i);
                }
            //Loop the array to print each number
            for (int number: myArray) {
                System.out.println(number);
            }
            // Remove 5 from array with .remove() method
            // cast 5 to an Integer object, otherwise index:5 is used
            myArray.remove((Integer) 5);
            System.out.println(myArray);

            //solution 2:
            int removeNumber = 5;
            ArrayList<Integer> arrL2 = new ArrayList<>();
            for (int i =0; i<10; i++) {
                arrL2.add(i+1);
            }
            for (int i =0; i<arrL2.size(); i++) {
                if (arrL2.get(i) == removeNumber) {
                    arrL2.remove(i);
                }
            }
            System.out.println(arrL2);
        }
}

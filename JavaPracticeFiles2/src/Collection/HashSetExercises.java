package Collection;

import java.util.Arrays;
import java.util.HashSet;
import java.text.*;
import java.time.*;
import java.util.*;

public class HashSetExercises {

    public static void getHashSet() {

        //Set Data Structure - different from List Data structure
        //HashSet - every element in the HashSet will be unique (no duplication)
        //HashSet - NOT using index of the element, as it stores element in memory i.e. not in a linear way

        HashSet<String> names = new HashSet<>();

        //add method - not thro' adding the String Object into the memory, it will also need to go thro' all elements in the set to check for duplication
        //More efficient in checking for duplication, they will have to store in different way not in linear format
        names.add("Jean");
        names.add("Peter");
        names.add("Jenny");
        names.add("Peter");    //will not store duplicates in HashSet
        System.out.println(names);
        System.out.println(names.size());   //3

        //common usage of HashSet is to search for a value
        System.out.println(names.contains("Peter"));

        if (names.contains("Jean")) {
            names.remove("Jean");
            System.out.println(names);
        } else {
            System.out.println("cannot find Jean");
        }
        /* for (int i=0; i< names.size(); i++) // cannot use this as index
        {
            names.contains(i);
        }*/

        for (String name : names) {
            System.out.println("My name is " + name);
        }

        HashSet<Integer> ages = new HashSet<>();
        ages.add(10);
        ages.add(20);
        ages.add(30);
        ages.add(10);   //will not store duplicates in the HashSet
        System.out.println(ages);

        int checkUserInput = 20;
        //can use Scanner
        System.out.println(ages.contains(checkUserInput));   //true

        //Exercise 2:
        //12 months HashSet - not in order i.e. Jan, Feb, Mar, Apr
        // next time printed i.e. Feb, Apr, Jan, Mar
        //LinkedHashSet is also a collection and works like HashSet except the element can be accessed in their insertion order
        // Solution 1: import java.text.DateFormatSymbols;
        LinkedHashSet<String> months = new LinkedHashSet<String>(12);
        String[] allMonth = new DateFormatSymbols().getMonths();
        for (int month = 1; month <= allMonth.length - 1; month++) {
            months.add(allMonth[month - 1]);
        }
        System.out.println(months); //[January, February, March, April, May, June, July, August, September, October, November, December]

        months.remove("September");
        System.out.println(months);

        //Solution 2:
        LinkedHashSet<String> allMonths = new LinkedHashSet<String>(12);
        for (int monthNumber = 1; monthNumber<=12; monthNumber++) {
            String monthName = Month.of(monthNumber).name();
            allMonths.add(monthName);
        }
        System.out.println(allMonths);
        allMonths.remove("September");
        System.out.println(allMonths);

        //Possible Solution #2
        HashSet<String> monthSet = new HashSet<>();
        String[] months2 = new DateFormatSymbols().getMonths(); //ArrayList, HashSet etc
        for (int i=0 ; i < months2.length-1; i++)
            {
                monthSet.add(months2[i]);
            }
        System.out.println(monthSet);
        monthSet.remove("January");
        System.out.println(monthSet);
    }
}
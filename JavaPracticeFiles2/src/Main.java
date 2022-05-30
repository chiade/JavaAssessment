import Collection.ArrayListExercises;
import Collection.HashMapExercises;
import Collection.HashSetExercises;
import ControlFlowLoop.*;
import VariableExercises.*;

import java.util.ArrayList;

public class Main {

/*
Java compiler will look for main method to start its execution (entry point)

public, protected, private, default - know as Access Modifier - will be covered later

static (Class) method - The programs (e.g. JVM) are able to call the static method directly
without creating instance object of the class. (need to call this method once when
execution)

 non-static (instance object) method - required to create instance object of the class to access the
 method (when there are multiple instances tah twe wanted to create). (e.g. 37
 learners in the class, we need to create 37 instances of the class object)

 void - refers to the return type of the method: void means method will return nothing
 to caller.
 e.g. return type can be int, string, boolean, double.....

 String[] args as the parameter: array of string that can be passed in as arguments
 - when we run/execute the program, we might want to pass in some configuration value.
 */

    public static void main(String[] args) {

        //JVM will call the static main method directly (once) when we run/execute our
        //program

        //1) Java variables and datatype and operators
        //System.out.println("Hello world!");
        //Run another static method from the MyVariables Class
        //MyVariables.practiceVariable();

        //2) ControlFlow & Loops
        //MyControlFlowLoop.practiceControlFlowLoop();
        //CommissionCalculator.commission();

        //MovieDiscounts.discounts();

        //if the method is not static, it belongs to the object (instance) of the Class
        //37 learners (instance object of class) in the lesson. each will have own method
        //e.g. method - setZone(), getZone() - each learner will be in different zone

        //Class learner
        //Learner jeanLooi = new Learner();
        //jeanLooi.setZone();

        //Static method: belongs to Main class (not any instance object)
        //e.g. class that is commonly used by program (utility class)
        // common calculation, in Java packages i.e. System Class (System.out.println()), wrapper, collections (common class that can apply to any of our custom classes created

        //Collection
        //ArrayListExercises.setArray();
        //HashSetExercises.getHashSet();
        //HashMapExercises.getHashMap();


    }
}
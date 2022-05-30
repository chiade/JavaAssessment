package OOPBasic;

//The Class name MUST be the same as the file name
//The first character of the Class name MUST be an uppercase
//then followed by camel case

//MyClass is a class object, which by default inherit from the Java Object Class
public class MyClass {

    /*
        1) What is the state (fields) / class attribute of this Class Object
        2) What type of Constructor(s) to be created for this Class Object
        3) What methods (behaviour/action) to be created for this class object
        - Getter and Setter methods (instance methods)
        - other methods (depend on the requirements)
     */
        int myVariable;

        //Constructor - non-parameterized constructor
        public MyClass() {
            //Set a default value for myVariable
            //This is the constructor
            myVariable = 5;
        }

        public int getMyVariable() {
            //There might be some checks b4 the Class can return the attribute
            return myVariable;
        }

        public void setMyVariable(int myVariable) {
            //There might be some checks b4 the Class update the attribute value
            this.myVariable = myVariable;

            //No return of myVariable back to the caller
        }
} // End of class

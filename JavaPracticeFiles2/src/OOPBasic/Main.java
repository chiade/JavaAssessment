package OOPBasic;

//This Main class is in OOPBasic for practice purposes
public class Main {

    public static void main(String[] args) {
/*
        System.out.println("hello world");

        //Exercise #1: MyClass
        //Create an instance Object of MyClass
        //ArrayList<String> myList = new ArrayList<>();

        //myObj/2 is an instance of MyClass
        //automatically construct my Class object - call the constructor
        //myObj/2 instance has a state named myVariable with a default value of 5.
        //myObj/2 instance is able to access the 2 methods (getter/setter) inside the MyClass
        MyClass myObj = new MyClass();
        //calling the getter method from the class that return value of myVariable
        System.out.println("myVariable for myObj instance: " + myObj.getMyVariable());//5
        //call the setter method to set a new value to myVariable
        myObj.setMyVariable(10);
        System.out.println("myVariable for myObj instance: " +myObj.getMyVariable());//10

        MyClass myObj2 = new MyClass();
        System.out.println("myVariable for myObj2 instance: " +myObj2.getMyVariable());//5
        myObj2.setMyVariable(20);
        System.out.println("myVariable for myObj2 instance: " +myObj2.getMyVariable());//5
*/
        //Exercise #2: MyShoes
        //e.g. 3 instances of MyShoes Class Object
       /* MyShoes sport = new MyShoes(6, "blue");
        MyShoes sandal = new MyShoes(8, "brown");
        MyShoes highheel = new MyShoes(7, "white");

        //Calling of the toString() method in MyShoes Class is from the System.out.println
        System.out.println(sport);
        System.out.println(sandal);
        System.out.println(highheel);

        MyShoes boots = new MyShoes();
        System.out.println(boots);*/

        //Exercise #3 - Bank account
        //Instantiate a bankaccount object, give your object an accountId,  an owner name and a balance, and make its type as ‘O’.
        BankAccount mainAccount = new BankAccount(1111, "Desmond", 200, 'O');
        BankAccount savingsAccount = new BankAccount(0001, "Desmond", 'S');

        //e.g. use scanner input: 1) do in main(); 2) create ScannerInput Class
        mainAccount.withdraw(300);
        mainAccount.deposit(-50);

        boolean checkDeposit = mainAccount.deposit(300);
        if (checkDeposit) //check if return is true
        {
            //do some other further processing e.g. update database, update other classes attribute
            System.out.println("Success deposit");
        } else {
            System.out.println("Failed deposit");
        }
        System.out.println(mainAccount);

        savingsAccount.withdraw(300);
        savingsAccount.deposit(-50);
        System.out.println(savingsAccount);

        //withdraw
        if (savingsAccount.withdraw(1000)) {
            System.out.println("success withdrawal");
        } else {
            System.out.println("Error deducting");
        }

        //Transfer: BankAccount From, BankAccount To, Amount transferred
        //BankAccount From call the transfer method, and pass in BankAccount To, Amount to transfer as the parameter

        if (mainAccount.transfer(savingsAccount, 100)) {
            System.out.println("Success transfer");
        }
        else {
            System.out.println("Error transfer");
        }
        System.out.println(mainAccount);
        System.out.println(savingsAccount);
    }
}

package OOPBasic;

public class BankAccount {

    int bankAccountId;
    String ownerName;
    double balance;
    char type;

    public BankAccount(int bankAccountId, String ownerName, double balance, char type) {
        this.bankAccountId = bankAccountId;
        this.ownerName = ownerName;
        this.balance = balance;
        this.type = type;
    }

    public BankAccount(int bankAccountId, String ownerName, char type) {
        //this.bankAccountId = bankAccountId;
        //this.ownerName = ownerName;
        //this.balance = 100; //by default
        //this.type = type;

        //Constructor Chaining (w/in the same class)
        this(bankAccountId, ownerName, 100, type);
    }
    //Getter and Setter methods - do your own!
    public int getBankAccountId() {
        return bankAccountId;
    }
    public void setBankAccountId(int bankAccountId) {
        this.bankAccountId = bankAccountId;
    }
    public String getOwnerName() {
        return ownerName;
    }
    public void setOwnerName(String ownerName) {
        this.ownerName = ownerName;
    }
    public double getBalance() {
        return balance;
    }
    public void setBalance(double balance) {
        this.balance = balance;
    }
    public char getType() {
        return type;
    }
    public void setType(char type) {
        this.type = type;
    }
    //other methods
    public boolean deposit(double amount) {
        if (amount > 0) {
            this.balance += amount;
            //System.out.println("Success deposit");
            return true;
        }
            //System.out.println("Failed deposit");
            return false;
    }
    //inform caller of the method whether the withdrawal is successful or not
    public boolean withdraw(double amount) {
        //checking if balance after withdrawal is >0
        if (this.balance - amount >= 0) {
            this.balance -= amount;
            System.out.println("Success withdrawal");
            return true;
        }
        System.out.println("Error deducting from balance");
        return false;
    }
    public boolean transfer(BankAccount acctTo, double amount)
    {
        //This refer to account from - calls the transfer() method
        //acctTo refer to account To - passed in as a parameter amount
        //look at what you have for your other methods
        if (this.withdraw(amount)) {
            //can transfer
            acctTo.deposit(amount);
            return true;
    }
        //cannot transfer
        return false;
}
    @Override
    public String toString() {
        return String.format("Bank Account holder: %s, Balance: %.2f, Account type " + "Type: %c", this.ownerName, this.balance, this.type);
    }
}

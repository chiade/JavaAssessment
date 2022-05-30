package CompositionClass.Library;

//Library is a composite of Book and Member
//Library has a list of books and members
//Need to apply collection. This example uses ArrayList to store the books and members

import java.util.*;

public class Library {

    //Library's own attribute
    private String branchID;

    //Create the attribute for book object and member object
    //Creating an ArrayList of Member object

    //ArrayList, HashSet, HashMap are all class objects
    //Classes can implement Interface
    //Class is a blueprint of an object
    //Interface is a guideline of what a class must do and should not do
    //Interface will have all methods that the class needs to implement
    //Multiple classes can implement the same Interface or multiple Interfaces
    ArrayList<Member> members;
    ArrayList<Book> books;

    public Library() {

        //Create an ArrayList of books and members in the library
        //Retrieve the list of books and members from the database
        //No database now, so create 3 books and members

        //Books
        Book java = new Book("111-111-111-111", "Effective Java", "Joe Tan");
        Book css = new Book("111-111-111-222", "Effective CSS", "Jen Tan");
        Book html = new Book("111-111-111-333", "Effective HTML", "Jae Tan");

        //Store all books into the ArrayList
        books = new ArrayList<>();
        books.add(java);
        books.add(css);
        books.add(html);

        //Members
        Member jean = new Member("S1234567A", "Jean Looi", 23);
        Member john = new Member("S1334567A", "John Looi", 33);
        Member jon = new Member("S1434567A", "Jon Looi", 43);

        //Store all members into the ArrayList
        members = new ArrayList<>();
        members.add(jean);
        members.add(john);
        members.add(jon);
    }
    //getter and setter
    public String getBranchID(){
        return branchID;
    }
    public void setBranchID(String branchID) {
        this.branchID = branchID;
    }

    //to get the ArrayList of books and return to the caller
    public ArrayList<Book> getBooks() {
        return books;
    }
    public ArrayList<Member> getMembers() {
        return members;
    }
}

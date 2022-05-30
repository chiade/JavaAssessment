package CompositionClass.Library;

import java.util.*;

public class Main {

    public static void main(String[] args) {

        //create instance of Library Object
        Library tampinesNLB = new Library();
        tampinesNLB.setBranchID("tamp01");

        //get all the books from the library and display it
        ArrayList<Book> allBooks = tampinesNLB.getBooks();

        for (Book book: allBooks) {
            System.out.println(book);
        }

        //Get all members from the library and display it
        ArrayList<Member> allMembers = tampinesNLB.getMembers();

        for (Member member: allMembers) {
            System.out.println(member);
        }
    }
}

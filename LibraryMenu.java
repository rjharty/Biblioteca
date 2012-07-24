package Biblioteca;

import com.sun.servicetag.SystemEnvironment;

import java.awt.print.Book;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.Reader;
import java.util.Scanner;


/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/11/12
 * Time: 11:14 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryMenu {
    private static final String GREETING = "Welcome to Biblioteca. Please select an option 1-6.";
    private static final String INVALIDOPTION = "Select a valid option!!";
    private static final String OPTION1 = "1. View library collection";
    private static final String OPTION2 ="2. Reserve a book";
    private static final String BOOKSELECTIONTITLE = "Please type in the name of the book you wish to reserve";
    public static final String INVALIDBOOKTITLE = "This book does not exist in collection.";

    static void displayMessage(String MessageForUser){
        System.out.println(MessageForUser);
    }

    void printGreeting(){
        displayMessage(GREETING);
    }

    int gatherInput(){
        Scanner selectionReader = new Scanner(System.in);
        int optionSelected = selectionReader.nextInt(); // have to redo error check here
        return optionSelected;
    }

    void processInput(int UserSelection, Customer newCustomer, LibraryCollection CurrentCollection)
    {
        if (UserSelection==1){
        CurrentCollection.displayCollection();
        }
        else if (UserSelection==2)  {
        displayMessage(BOOKSELECTIONTITLE);
        Scanner scanner = new Scanner(System.in);
        String TitleOfBook = scanner.next();
        LibraryBook BookToCheckOut;
        BookToCheckOut = CurrentCollection.findBookInCollection(TitleOfBook);
            if (BookToCheckOut.BookTitle == INVALIDBOOKTITLE)  {
            displayMessage(INVALIDBOOKTITLE);
            }
            else
            {
            BookToCheckOut.checkOutBook();
            }
        }
        else if (UserSelection==3)
        {
            newCustomer.checkLibraryNumber();
        }
        else displayMessage(INVALIDOPTION);
    }
}

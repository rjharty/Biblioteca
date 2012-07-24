package Biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/11/12
 * Time: 12:38 PM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryCollection {
    public ArrayList<LibraryBook> arrayOfBookCollection  = new ArrayList<LibraryBook>();

    public void displayCollection(){
    for(LibraryBook NextBook : arrayOfBookCollection){
        System.out.println(NextBook.BookTitle);
    }
    }                             // prints out collection

    LibraryBook findBookInCollection(String bookToFind){
        for(LibraryBook foundBook : arrayOfBookCollection) {
        if (bookToFind == foundBook.BookTitle)
         {
             return foundBook;
         }
        }
        LibraryBook emptyBook = new LibraryBook();
        emptyBook.BookTitle = LibraryMenu.INVALIDBOOKTITLE;
        return emptyBook;

    }
}




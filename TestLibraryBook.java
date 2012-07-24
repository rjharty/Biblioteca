package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/11/12
 * Time: 10:52 AM
 * To change this template use File | Settings | File Templates.
 */
public class TestLibraryBook {
    public static void main(String[] args){
        LibraryBook BookOne = new LibraryBook();
        BookOne.BookTitle="Harry Potter";
        BookOne.BookAuthor="JK Rowling";
        BookOne.IsAvailable=true;
        BookOne.checkOutBook();
        BookOne.checkOutBook();
    }
}

package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/11/12
 * Time: 10:51 AM
 * To change this template use File | Settings | File Templates.
 */
public class LibraryBook {
    String BookTitle;
    String BookAuthor;
    boolean IsAvailable;

    public void checkOutBook()
    {
        if (IsAvailable==false)
        {
            System.out.println("Sorry we don't have that book yet.");
        }
        else
        {
            System.out.println("Thank You! Enjoy the book.");
            IsAvailable=false;
        }
    }
}

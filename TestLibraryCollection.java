package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/11/12
 * Time: 12:42 PM
 * To change this template use File | Settings | File Templates.
 */

public class TestLibraryCollection {

    public static void main(String[] args){
    LibraryCollection HarryPotterSeries = new LibraryCollection();
    LibraryBook HarryPotter1 = new LibraryBook();
    HarryPotter1.BookTitle = "Harry Potter and the Sorcerer's Stone";
    LibraryBook HarryPotter2 = new LibraryBook();
    HarryPotter2.BookTitle = "Harry Potter and the Chamber of Secrets";

    HarryPotterSeries.arrayOfBookCollection.add(HarryPotter1);
    HarryPotterSeries.arrayOfBookCollection.add(HarryPotter2);

    HarryPotterSeries.displayCollection();

    LibraryBook foundTestBook = HarryPotterSeries.findBookInCollection("Harry Potter and the Sorcerer's Stone");
    LibraryBook foundTestBook2 = HarryPotterSeries.findBookInCollection(HarryPotter2.BookTitle);
    LibraryMenu.displayMessage(foundTestBook.BookTitle);
    LibraryMenu.displayMessage(foundTestBook2.BookTitle);

}
}


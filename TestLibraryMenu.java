package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: Russ
 * Date: 7/13/12
 * Time: 8:42 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestLibraryMenu {
    public static void main(String[] args){
        LibraryCollection HarryPotterSeries = new LibraryCollection();
        LibraryBook HarryPotter1 = new LibraryBook();
        HarryPotter1.BookTitle = "Harry Potter and the Sorcerer's Stone";
        LibraryBook HarryPotter2 = new LibraryBook();
        HarryPotter2.BookTitle = "Harry Potter and the Chamber of Secrets";

        HarryPotterSeries.arrayOfBookCollection.add(HarryPotter1);
        HarryPotterSeries.arrayOfBookCollection.add(HarryPotter2);

        Customer testCustomer = new Customer();

        LibraryMenu testMenu = new LibraryMenu();
        testMenu.printGreeting();
        int userTestInput = testMenu.gatherInput();
        testMenu.processInput(userTestInput, testCustomer, HarryPotterSeries);
    }
}

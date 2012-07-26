package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMenu {public static void main(String[] args){
    Collection HarryPotterSeries = new Collection();
    Book HarryPotter1 = new Book();
    HarryPotter1.Title = "Harry Potter and the Sorcerer's Stone";
    Book HarryPotter2 = new Book();
    HarryPotter2.Title = "Harry Potter and the Chamber of Secrets";
    HarryPotter2.IsAvailable = true;

    HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter1);
    HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter2);

    Collection HarryPotterMovies = new Collection();
    Movie HarryPotterMovie1 = new Movie();
    HarryPotterMovie1.Title = "Harry Potter Movie 1";
    Movie HarryPotterMovie2 = new Movie();
    HarryPotterMovie2.Title = "Harry Potter Movie 2";
    HarryPotterMovie2.IsAvailable = true;

    HarryPotterMovies.arrayOfMediaCollection.add(HarryPotterMovie1);
    HarryPotterMovies.arrayOfMediaCollection.add(HarryPotterMovie2);

    Customer TestCustomer = new Customer();
    TestCustomer.UserName = "111-1111";
    TestCustomer.Password = "password";

    CustomerDataBase TestDataBase = new CustomerDataBase();
    TestDataBase.arrayOfCustomers.add(TestCustomer);


        Menu testMenu = new Menu();
        testMenu.startLibrary();
        int userTestInput = testMenu.gatherInput();
        testMenu.processInput(userTestInput,HarryPotterSeries,HarryPotterMovies,TestDataBase);
        Messages.displayMessage("User Name Is:");
        Messages.displayMessage(Menu.DefaultCustomer.UserName);
        int userTestInput2 = testMenu.gatherInput();
        testMenu.processInput(userTestInput2,HarryPotterSeries,HarryPotterMovies,TestDataBase);
        Messages.displayMessage("User Name Is:");
        Messages.displayMessage(Menu.DefaultCustomer.UserName);
}
}

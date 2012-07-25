package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:52 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestMenu {        public static void main(String[] args){
    Collection HarryPotterSeries = new Collection();
    Book HarryPotter1 = new Book();
    HarryPotter1.Title = "Harry Potter and the Sorcerer's Stone";
    Book HarryPotter2 = new Book();
    HarryPotter2.Title = "Harry Potter and the Chamber of Secrets";
    HarryPotter2.IsAvailable = true;

    HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter1);
    HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter2);

    Customer testCustomer = new Customer();

    Menu testMenu = new Menu();
    testMenu.printGreeting();
    int userTestInput = testMenu.gatherInput();
}
}

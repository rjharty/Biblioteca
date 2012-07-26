package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:53 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCollection {
    public static void main(String[] args){
        Collection HarryPotterSeries = new Collection();
        Book HarryPotter1 = new Book();
        HarryPotter1.Title = "Harry Potter and the Sorcerer's Stone";
        Book HarryPotter2 = new Book();
        HarryPotter2.Title = "Harry Potter and the Chamber of Secrets";

        HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter1);
        HarryPotterSeries.arrayOfMediaCollection.add(HarryPotter2);

        HarryPotterSeries.displayCollection();

        Media foundTestBook = HarryPotterSeries.findMediaInCollection("Harry Potter and the Sorcerer's Stone");
        Media foundTestBook2 = HarryPotterSeries.findMediaInCollection(HarryPotter2.Title);
        Messages.displayMessage(foundTestBook.Title);
        Messages.displayMessage(foundTestBook2.Title);

    }
}

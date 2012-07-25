package Biblioteca;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {
    private static final String GREETING = "Welcome to Biblioteca. Please select an option 1-6.";
    private static final String INVALIDOPTION = "Select a valid option!!";
    private static final String OPTION1 = "1. View Library Book collection";
    private static final String OPTION2 ="2. Reserve a book";
    private static final String OPTION3 ="3. View Movie Collection";
    private static final String OPTION4 ="4. Reserve a movie";
    private static final String OPTION5 = "5. Log In";
    private static final String OPTION6 ="6. Check Library Number";
    private static final String MEDIASELECTIONTITLE = "Please type in the name of the item you wish to reserve";
    public static final String INVALIDTITLE = "This does not exist in collection.";

    static void displayMessage(String MessageForUser){
        System.out.println(MessageForUser);
    }

    void printGreeting(){
        displayMessage(GREETING);
    }

    int gatherInput(){
        Scanner selectionReader = new Scanner(System.in);
        int optionSelected = selectionReader.nextInt();
        return optionSelected;
    }

    void checkOutItem(Collection CurrentCollection){
        displayMessage(MEDIASELECTIONTITLE);
        Scanner scanner = new Scanner(System.in);
        String TitleOfMedia = scanner.nextLine();
        Media MediaToCheckOut;
        MediaToCheckOut = CurrentCollection.findMediaInCollection(TitleOfMedia);
        if (MediaToCheckOut == null)  {
            displayMessage(INVALIDTITLE);
        }
        else
        {
             displayMessage(MediaToCheckOut.checkOutMedia()); // has two possible results: Available or Not Available
        }
    }

    boolean logInUser(){
        Scanner selectionReader = new Scanner(System.in);
        String ScannedUserName = selectionReader.nextLine();
        String ScannedUserPassword = selectionReader.nextLine();
        Customer NewCustomer = new Customer();
        boolean LogInResult = NewCustomer.logIn(ScannedUserName,ScannedUserPassword);
        return LogInResult;
    }

    void checkLibraryNumber(){
        if(logInUser() == true)
        {

        }

    }

    void processInput(int UserSelection, Collection CurrentBookCollection, Collection CurrentMovieCollection)
    {
        if (UserSelection==1){
            CurrentBookCollection.displayCollection();
        }
        else if (UserSelection==2)  {
            checkOutItem(CurrentBookCollection);
        }
        else if (UserSelection==3){
            CurrentMovieCollection.displayCollection();
        }
        else if (UserSelection==4) {
            checkOutItem(CurrentMovieCollection);
        }
        else if (UserSelection==5) {
            logInUser();
        }
        else if (UserSelection==6){
           checkLibraryNumber();
        }
        else displayMessage(INVALIDOPTION);
    }
}

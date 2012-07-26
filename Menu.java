package Biblioteca;

import sun.tools.tree.IfStatement;

import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:45 PM
 * To change this template use File | Settings | File Templates.
 */
public class Menu {

    static Customer DefaultCustomer = new Customer();
    void defineCustomer(){
        DefaultCustomer.setUserName("Default Username");
        DefaultCustomer.setPassWord("Default Password");
    }

    void startLibrary(){
        defineCustomer();
        Messages.displayMessage(Messages.GREETING);
        for (String MenuOption: Messages.MENUOPTIONS){
            Messages.displayMessage(MenuOption);
        }
    }

    int gatherInput(){
        Scanner selectionReader = new Scanner(System.in);
        int optionSelected = selectionReader.nextInt();
        return optionSelected;
    }

    void checkOutItem(Collection CurrentCollection){
        Messages.displayMessage(Messages.MEDIASELECTIONTITLE);
        Scanner scanner = new Scanner(System.in);
        String TitleOfMedia = scanner.nextLine();
        Media MediaToCheckOut;
        MediaToCheckOut = CurrentCollection.findMediaInCollection(TitleOfMedia);
        if (MediaToCheckOut == null)  {
            Messages.displayMessage(Messages.INVALIDTITLE);
        }
        else
        {
             Messages.displayMessage(MediaToCheckOut.checkOutMedia()); // has two possible results: Available or Not Available
        }
    }

    Customer findAndDefineCustomer(CustomerDataBase Database, String UserName)
    {
        Customer Cust = Database.findCustomerInDataBase(UserName);
        if (Cust.UserName.equals("Invalid"))
        {
            Cust.Password = "Invalid";
            Cust.LoggedIn = false;
        }
        return Cust;
    }

    Customer logInUser(CustomerDataBase CurrentCustomerDataBase){
        Scanner selectionReader = new Scanner(System.in);
        Messages.displayMessage("Enter User Name:");
        String ScannedUserName = selectionReader.nextLine();
        Messages.displayMessage("Enter Password");
        String ScannedUserPassword = selectionReader.nextLine();
        Customer NewCustomer = new Customer();
        NewCustomer = findAndDefineCustomer(CurrentCustomerDataBase,ScannedUserName);

    Boolean LogInResult = NewCustomer.logIn(ScannedUserName,ScannedUserPassword);
        if (LogInResult == true)
        {
            DefaultCustomer = NewCustomer;
            Messages.displayMessage("You are now logged in.");
        }
        else {
            Messages.displayMessage("Invalid login information.");
        }
        return NewCustomer;

    }

    void checkLibraryNumber(){
        if(DefaultCustomer.LoggedIn == true)
        {
           Messages.displayMessage(DefaultCustomer.UserName);
        }
        else
           Messages.displayMessage("Please see Librarian.");
    }

    void processInput(int UserSelection, Collection CurrentBookCollection, Collection CurrentMovieCollection, CustomerDataBase CurrentCustomerDataBase)
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
            logInUser(CurrentCustomerDataBase);
        }
        else if (UserSelection==6){
           checkLibraryNumber();
        }
        else Messages.displayMessage(Messages.INVALIDOPTION);
    }
}

package Biblioteca;
import org.omg.CORBA.PUBLIC_MEMBER;

import java.util.Arrays;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/25/12
 * Time: 3:58 PM
 * To change this template use File | Settings | File Templates.
 */
public class Messages {
    public static final String GREETING = "Welcome to Biblioteca. Please select an option 1-6.";
    public static final String INVALIDOPTION = "Select a valid option!!";
    public static final String OPTION1 = "1. View Library Book collection";
    public static final String OPTION2 ="2. Reserve a book";
    public static final String OPTION3 ="3. View Movie Collection";
    public static final String OPTION4 ="4. Reserve a movie";
    public static final String OPTION5 = "5. Log In";
    public static final String OPTION6 ="6. Check Library Number";

    public static String[] MENUOPTIONS = {OPTION1, OPTION2,OPTION3, OPTION4, OPTION5, OPTION6};

    public static final String MEDIASELECTIONTITLE = "Please type in the name of the item you wish to reserve";
    public static final String INVALIDTITLE = "This does not exist in collection.";

    static void displayMessage(String MessageForUser){
        System.out.println(MessageForUser);
    }


}

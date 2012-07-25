package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:51 PM
 * To change this template use File | Settings | File Templates.
 */
public class Customer {
    String UserName;
    String Password;
    Boolean LoggedIn;

    boolean logIn(String EnteredName, String EnteredPassword)
    {
        if (EnteredName.equals(UserName)&&EnteredPassword.equals(Password))
        {
        LoggedIn = true;
        }
        else
        {
        LoggedIn = false;
        }
        return LoggedIn;
    }

    boolean checkNumber()
    {
        if (LoggedIn=true)
        {
            return true;
        }
        else
            return false;
    }

    void setUserName(String NewUserName)
    {
        UserName = NewUserName;
    }

    void setPassWord(String NewPassword)
    {
        Password = NewPassword;
    }


}

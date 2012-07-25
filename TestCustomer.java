package Biblioteca;

import javax.print.attribute.standard.ReferenceUriSchemesSupported;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 3:39 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestCustomer {
    public static void main(String[] args){
    Customer TestCustomer = new Customer();
    TestCustomer.setUserName("Russ");
    TestCustomer.setPassWord("Harty");
    TestCustomer.LoggedIn = false;

    Menu.displayMessage(TestCustomer.UserName);
    Menu.displayMessage(TestCustomer.Password);

}
}

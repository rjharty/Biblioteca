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

    Messages.displayMessage(TestCustomer.UserName);
    Messages.displayMessage(TestCustomer.Password);

    CustomerDataBase TestDataBase = new CustomerDataBase();    //add first customer to database
    TestDataBase.arrayOfCustomers.add(TestCustomer);

        Customer TestCustomer2 = new Customer();
        TestCustomer2.setUserName("Jack");
        TestCustomer2.setPassWord("Bach");
        TestCustomer2.LoggedIn = false;

    TestDataBase.arrayOfCustomers.add(TestCustomer2);        //add second customer to database

    for(Customer NextCustomer : TestDataBase.arrayOfCustomers){   // Ensure that adding to database Worked
        System.out.println("Customer Added to Database:");
        System.out.println(NextCustomer.UserName);
    }

    Customer ReturnedCustomer = TestDataBase.findCustomerInDataBase("Russ");
        Messages.displayMessage("Customer Found in Database:");
        Messages.displayMessage(ReturnedCustomer.UserName); //Ensure customer can be found in data base

    Customer ReturnedCustomer2 = TestDataBase.findCustomerInDataBase("Jack");
        Messages.displayMessage("Customer Found in Database:");
        Messages.displayMessage(ReturnedCustomer2.UserName);  //Find second customer in data base
}

}

package Biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/25/12
 * Time: 10:31 AM
 * To change this template use File | Settings | File Templates.
 */
public class CustomerDataBase {
    public ArrayList<Customer> arrayOfCustomers = new ArrayList<Customer>();

    Customer findCustomerInDataBase(String CustomerToFind){
        for(Customer foundCustomer : arrayOfCustomers) {
            if (CustomerToFind.equals(foundCustomer.UserName))
            {
                return foundCustomer;
            }
        }
        Customer emptyCustomer = new Customer();
        emptyCustomer.UserName = "Invalid";
        return emptyCustomer;
    }
}

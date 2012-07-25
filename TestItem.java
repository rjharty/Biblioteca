package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:55 PM
 * To change this template use File | Settings | File Templates.
 */
public class TestItem {
    public static void main(String[] args){
        Book BookOne = new Book();
        BookOne.Title="Harry Potter";
        BookOne.Creator="JK Rowling";
        BookOne.IsAvailable=true;
        BookOne.checkOutMedia();
        BookOne.checkOutMedia();
    }
}

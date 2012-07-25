package Biblioteca;

import java.util.ArrayList;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:48 PM
 * To change this template use File | Settings | File Templates.
 */
public class Collection {
    public ArrayList<Media> arrayOfMediaCollection  = new ArrayList<Media>();

    public void displayCollection(){
        for(Media NextMedia : arrayOfMediaCollection){
            System.out.println(NextMedia.Title);
        }
    }                             // prints out collection

    Media findMediaInCollection(String MediaToFind){
        for(Media foundMedia : arrayOfMediaCollection) {
            if (MediaToFind.equals(foundMedia.Title))
            {
                return foundMedia;
            }
        }
    return null;
    }

    public void addToCollection(Media NewItem){
        arrayOfMediaCollection.add(NewItem);

    }
}

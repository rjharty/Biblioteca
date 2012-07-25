package Biblioteca;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 1:47 PM
 * To change this template use File | Settings | File Templates.
 */
public class Media {
    String Title;
    String Creator;
    boolean IsAvailable;
    public String MessageIfAvailable = "Thank you. Enjoy the media!";
    public String MessageIfUnAvailable = "Sorry, we do not yet have this media.";

    String checkOutMedia()
    {
        if (IsAvailable==false)
        {
            return MessageIfUnAvailable;
        }

            IsAvailable=false;
            return MessageIfAvailable;
    }

}

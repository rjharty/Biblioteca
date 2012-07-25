package Biblioteca;

import apple.awt.CImage;

import javax.security.sasl.AuthorizeCallback;
import java.util.Scanner;

/**
 * Created with IntelliJ IDEA.
 * User: ThoughtWorks
 * Date: 7/24/12
 * Time: 2:30 PM
 * To change this template use File | Settings | File Templates.
 */
public class Movie extends Media {
    String MessageIfUnAvailable = "Sorry, we do not yet have this movie.";
    String MessageIfAvailable = "Thank you. Enjoy the movie!";
    String Rating = "N/A";

    void setRating(String NewMovieRating){
    Rating = NewMovieRating;
    }

}

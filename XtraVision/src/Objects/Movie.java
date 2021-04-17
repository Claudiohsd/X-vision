/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Objects;

/**
 *
 * @author claudiodionisio
 */
public class Movie {
    
    //variables
    private int MovieID, Amount;
    private String MovieName, Genre;
    
    //constructor
    public Movie(int MovieID, int Amount, String MovieName, String Genre) {
        this.MovieID = MovieID;
        this.Amount = Amount;
        this.MovieName = MovieName;
        this.Genre = Genre;
    }

    //getters and setters
    public int getMovieID() {
        return MovieID;
    }

    public void setMovieID(int MovieID) {
        this.MovieID = MovieID;
    }

    public int getAmount() {
        return Amount;
    }

    public void setAmount(int Amount) {
        this.Amount = Amount;
    }

    public String getMovieName() {
        return MovieName;
    }

    public void setMovieName(String MovieName) {
        this.MovieName = MovieName;
    }

    public String getGenre() {
        return Genre;
    }

    public void setGenre(String Genre) {
        this.Genre = Genre;
    }
   
   
   
    
}

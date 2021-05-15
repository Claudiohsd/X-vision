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
public class User {
    
    //variables
    private String UserID = "";
    private String Email = "";
    
    //constructor
    public User(String UserID) {
        this.UserID = UserID;
    
    }
    
    //getters and setters
    public String getUserID() {
        return UserID;
    }

    public void setUserID(String UserID) {
        this.UserID = UserID;
    }

    public String getEmail() {
        return Email;
    }

    public void setEmail(String Email) {
        this.Email = Email;
    }
    
    
}

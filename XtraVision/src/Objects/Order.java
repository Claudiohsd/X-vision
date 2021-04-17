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
public class Order {
    
    //variables
    private int UserID, Item;
    private double Price;
    
    //constructor
    public Order(int UserID, int Item, double Price) {
        this.UserID = UserID;
        this.Item = Item;
        this.Price = Price;
    }    

    //getters and setters
    public int getUserID() {
        return UserID;
    }

    public void setUserID(int UserID) {
        this.UserID = UserID;
    }

    public int getItem() {
        return Item;
    }

    public void setItem(int Item) {
        this.Item = Item;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }
    
    
    
    
    
}

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
    private String CardNum, Item;
    private double Price;
    
    //constructor
    public Order(String CardNum, String Item, double Price) {
        this.CardNum = CardNum;
        this.Item = Item;
        this.Price = Price;
        
    }    

    //getters and setters
    
    public String getItem() {
        return Item;
    }

    public void setItem(String Item) {
        this.Item = Item;
    }

    public double getPrice() {
        return Price;
    }

    public void setPrice(double Price) {
        this.Price = Price;
    }

    public String getCardNum() {
        return CardNum;
    }

    public void setCardNum(String CardNum) {
        this.CardNum = CardNum;
    }
    
    
    
    
    
}

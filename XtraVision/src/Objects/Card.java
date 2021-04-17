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
public class Card {
    
    //variables
    private int CardNumber, ExpDate, CVC;

    //constructor
    public Card(int CardNumber, int ExpDate, int CVC) {
        this.CardNumber = CardNumber;
        this.ExpDate = ExpDate;
        this.CVC = CVC;
    }

    //getters ans setters
    public int getCardNumber() {
        return CardNumber;
    }

    public void setCardNumber(int CardNumber) {
        this.CardNumber = CardNumber;
    }

    public int getExpDate() {
        return ExpDate;
    }

    public void setExpDate(int ExpDate) {
        this.ExpDate = ExpDate;
    }

    public int getCVC() {
        return CVC;
    }

    public void setCVC(int CVC) {
        this.CVC = CVC;
    }
    
    
}

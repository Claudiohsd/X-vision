/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Model;
import Objects.Movie;
import Objects.Order;
import Views.Checkout;
import Views.Payment;
import Views.Rent;
import Views.Return;
import Views.Welcome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author claudiodionisio and caio
 */
public class Controller implements ActionListener {
    
    private Welcome welcome;
    private String button,item,cardNum;
    private double price;
    private Rent rent;
    private Return returnMovie;
    private Checkout checkout;
    private Movie movie;
    private Payment payment;
    private Model model;

    public Controller() throws IOException {
        //initialize the variables
        this.welcome = new Welcome(this);
        this.model = new Model();
        

    }
    // calls the page rentMovie
    private void rentMovie() {
        welcome.dispose();
        rent = new Rent(this);

    }
    
    private void rent() {
        rent.dispose();
        movie = rent.getMovie();
        checkout = new Checkout(this);

    }
    
    private void returnMovie() {
        welcome.dispose();
        returnMovie = new Return(this);
        
    } 
    
    private void payment() {
        checkout.dispose();
        payment = new Payment(this);
    }
    
    private void pay() throws InterruptedException{
        cardNum = payment.getCard();
        item = checkout.getItem();
        price = checkout.getPrice();
        Order order = new Order(cardNum, item, price);
        model.newOrder(order);
        
        JFrame f;  
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Payment accepted, take your movie!!!"); 
       
        // thread to sleep for 3000 milliseconds
    
        Thread.sleep(3000);
        System.exit(0);

            

    }
    
    private void finish() throws InterruptedException{
        cardNum = returnMovie.getCard();
        model.returnMovie(cardNum);
        
        JFrame f;  
        f=new JFrame();  
        JOptionPane.showMessageDialog(f,"Thanks for renting with us!!!"); 
       
        // thread to sleep for 3000 milliseconds
    
        Thread.sleep(3000);
        System.exit(0);

            

    }
    
    public Movie getMovie(){
        
        return movie;
    
    }
    //override methods   
    @Override
    public void actionPerformed(ActionEvent e) {

//       
        button = e.getActionCommand();
        //check which button was pressed
        System.out.println(button);
        switch (button) {   //start page command
            //checks credential
            case "RENT A MOVIE": {
               rentMovie();
            }
            break;
            case "RENT MOVIE": {
               rent();
            }
            break;
            case "RETURN A MOVIE": {
               returnMovie();
            }
            break;
            case "Cancel": {
               System.exit(0);
            }
            break;
            case "Proceed to payment": {
               payment();
            }
            break;
            case "Pay": {
            try {
                pay();
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
            case "Finish": {
            try {
                finish();
            } catch (InterruptedException ex) {
                Logger.getLogger(Controller.class.getName()).log(Level.SEVERE, null, ex);
            }
            }
            break;
        }
    }

   
}

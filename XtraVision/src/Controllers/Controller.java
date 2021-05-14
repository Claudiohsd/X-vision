/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controllers;

import Models.Model1;
import Views.Rent;
import Views.Return;
import Views.Welcome;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

/**
 *
 * @author claudiodionisio
 */
public class Controller implements ActionListener {
    
    private Welcome welcome;
    private Model1 model1;
    private String button;
    private Rent rent;
    private Return returnMovie;

    public Controller() throws IOException {
        //initialize the variables
        this.welcome = new Welcome(this);
        this.model1 = new Model1();

    }
    // calls the page rentMovie
    private void rentMovie() {
        welcome.dispose();
        rent = new Rent(this);

    }
    
    private void returnMovie() {
        welcome.dispose();
        returnMovie = new Return(this);

    }//override methods   
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
            case "RETURN A MOVIE": {
               returnMovie();
            }
            break;
            case "Cancel": {
               System.exit(0);
            }
            break;
        }
    }
}

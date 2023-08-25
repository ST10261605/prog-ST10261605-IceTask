/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016icetask1;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Sami
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    
    //ST10261605
    
    public static void main(String[] args) {
         Bird brd = new Bird(); //instantiating objects
         Reptile rept = new Reptile(); 
        Animal an = new Animal(); 
        
       brd.Input();
       brd.Output();
       rept.Input();
       rept.Output();
        
        brd.setIDtag(BirdIDtag);
        brd.setSpecies(birdSpecies);
        rept.setIDtag(repIDtag);
        rept.setSpecies(repSpecies);
        
        JOptionPane.showMessageDialog(null, "Bird ID tag: " + brd.getIDtag() + "\n" 
                                                                      + "Bird species: " + brd.getSpecies() + "\n" 
                                                                      +  "Bird color: " + brd.brdColor); 
        
        JOptionPane.showMessageDialog(null, "Reptile ID tag: " + rept.getIDtag() + "\n"
                                                                      + "Reptile species: " + rept.getSpecies() + "\n" 
                                                                      + "Blood temperature: " + rept.bloodTemp); 
        
    }
    
}

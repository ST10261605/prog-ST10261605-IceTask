/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2016icetask1;

import javax.swing.JOptionPane;

/**
 *
 * @author Sami
 */
public class Animal {
   public static int IDtag; 
   public static String species; 

    public static int getIDtag() {
        return IDtag;
    }

    public static void setIDtag(int IDtag) {
        Animal.IDtag = IDtag;
    }

    public static String getSpecies() {
        return species;
    }

    public static void setSpecies(String species) {
        Animal.species = species;
    }
   
   public void Input() {
        IDtag = Integer.parseInt(JOptionPane.showInputDialog(null, "Enter ID tag of animal"));
        species = JOptionPane.showInputDialog(null, "Enter species");
   }
   
   public void Output() {
       JOptionPane.showMessageDialog(null, "ID Tag: " + getIDtag());
       JOptionPane.showMessageDialog(null, "Species: " + getSpecies());
   }
}

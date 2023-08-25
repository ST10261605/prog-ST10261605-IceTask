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
public class Reptile extends Animal { 
    
      private double bloodTemp; 

    public Reptile(double bloodTemp) {
        this.bloodTemp = bloodTemp;
    }

       @Override
   public void Input() {
        super.Input();
        bloodTemp = Double.parseDouble(JOptionPane.showInputDialog(null, "Enter blood temperature of reptile: "));
   } 
   
       @Override
   public void Output() {
       super.Output();
       JOptionPane.showMessageDialog(null, "Blood temperature of reptile: " + bloodTemp);
   }
        
}

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
public class Bird extends Animal {
    
    int color;
    String brdColor;

    public Bird(int color) {
        this.color = color;
    }

    @Override
    public void Input() {
        super.Input();
        color =  Integer.parseInt(JOptionPane.showInputDialog(null, "What is the feather color, 1 = grey, 2 = white, 3 = black")); 
   }
    
    @Override
   public void Output() {
       
       super.Output();
       
       switch (color) {
           case 1: brdColor = "Grey"; break; 
           case 2: brdColor = "White"; break;
           case 3: brdColor = "Black"; break; 
           default: JOptionPane.showMessageDialog(null, "Invalid number entered, please pick between 1-3"); break; 
       }
       JOptionPane.showMessageDialog(null, "Feather color: " + brdColor);
   }

    
    
}

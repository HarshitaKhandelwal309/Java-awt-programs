/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkboxframe;

import java.awt.*;


/**
 *
 * @author Harshii
 */
public class Checkboxframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         Frame f=new Frame("Button Example");  
    Checkbox check1=new Checkbox("Female" , false);  
    check1.setBounds(50,100,80,30);  
     Checkbox check2=new Checkbox("male" , false);  
    check2.setBounds(60,140,90,40); 
     Checkbox check3=new Checkbox("others", true);  
    check3.setBounds(90,50,80,70); 
    
    f.add(check1); 
    f.add(check2);
    f.add(check3);
     f.setSize(400,400);  
    f.setLayout(null);  
   
    f.setVisible(true);   
    }
    
}

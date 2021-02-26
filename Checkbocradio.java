/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package checkbocradio;

/**
 *
 * @author Harshii
 */
import java.awt.*;
public class Checkbocradio {
Checkbocradio(){
    Frame f = new Frame();
    CheckboxGroup c1 = new CheckboxGroup();
    Checkbox check = new Checkbox("A+" ,c1 , false);
    check.setBounds(100,100,50,50);
    
      Checkbox check1 = new Checkbox("O+" ,c1 , false);
    check1.setBounds(100,150,50,50);
    
    f.setSize(400,400);
    f.setLayout(null);
    f.setVisible(true);
    f.add(check); f.add(check1) ;
   
}
    
    public static void main(String[] args) {
        new Checkbocradio();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package buttonframe;


import java.awt.*;
public class Buttonframe {

  
    public static void main(String[] args) {

  Frame f=new Frame("Button Example");  
    Button b=new Button("This is 1 Button"); 
   
    b.setBounds(90,120,120,60);
     b.setBackground(Color.blue);
     f.setBackground(Color.yellow);
     f.add(b) ; 
    f.setSize(400,400);  
    f.setLayout(null);  
    f.setVisible(true); 
    f.setBackground(Color.yellow);
    
    }
    
}

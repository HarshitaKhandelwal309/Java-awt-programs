
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package eventdeligationmodel;

import java.awt.*;
import java.awt.event.*;

 class buttonDemo extends Frame implements ActionListener
{
    Button b1 ;
    Button b2;
    Button b3;
    
     buttonDemo(){
     FlowLayout fl = new  FlowLayout();
     setLayout(fl);
     
     b1  = new Button("Login");
     add(b1);
     
    b1.addActionListener(this);
     
     b2  = new Button("click");
     add(b2);
     
     b2.addActionListener(this);
     
     b3  = new Button("submit");
     add(b3);
     
     b3.addActionListener(this);
     }

public void actionPerformed(ActionEvent e)
{
//    System.out.println("HEllo chinkii");
//    setBackground(Color.red);
    if(e.getSource()==b1)
    {
        setBackground(Color.red);
       
    }
    
    if(e.getSource()==b2)
    {
        setBackground(Color.blue);
    }
    if(e.getSource()==b3)
    {
        setBackground(Color.green);
    }
    
}



 }







public class Eventdeligationmodel {

    
    public static void main(String[] args) {
        
        buttonDemo  bd = new buttonDemo();
        bd.setSize(500,500);
        bd.setVisible(true);
        bd.setBackground(Color.black);
        bd.addWindowListener(new WindowAdapter()
        {public void windowClosing(WindowEvent e)
        {System.exit(0);}
                }
        );
                
                
                
                
    }
    
}

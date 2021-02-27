/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bettersmiley;

import java.awt.*;
import java.awt.event.*;
import java.awt.Graphics;
public class Bettersmiley   extends Frame{
   Bettersmiley()
   {
         //to close frame
      this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
    });
      
      setVisible(true);
      setSize(500,500);
      setLayout(null);
      setLocation(300,200);
      setBackground(Color.red);
       setForeground(Color.YELLOW);
      
    }
   //for graphics 
    public void paint(Graphics g)
      {
         g.fillOval(100, 100, 300, 300);
         g.setColor(Color.YELLOW);// for face 
         
          g.setColor(Color.black); // for left eye
         g.fillOval(170, 180,20 ,20 );
          
           
         g.fillOval(300, 180, 20, 20);
         g.setColor(Color.black);// for right eye
         g.drawLine(250, 230, 250, 260 );
         g.drawArc(185, 260,130, 85, -140, 100);
         
   
     
      }
    public static void main(String[] args) {
        Bettersmiley  bs=  new Bettersmiley ();

    }
    
}

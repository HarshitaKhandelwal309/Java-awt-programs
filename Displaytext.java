/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package displaytext;

import java.awt.*;
import java.awt.Graphics;

import java.awt.event.* ;
public class Displaytext extends Frame {
Displaytext()
{
    //to close frame
      this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
    });
        
        
    setVisible(true);
  setSize(500,500);
  setLocation(200,100);
  setBackground(Color.pink);
    setForeground(Color.blue);
    
    Font f1= new Font("Forte" , Font.ITALIC,30);
    setFont(f1);
 

}
public void paint(Graphics g)
{
    g.drawString("Harshii", 100, 150);
    g.drawString("Software Developer",100 , 250);
    g.drawString("18100BTIT03077" , 100 , 350);
  }


    
    public static void main(String[] args) {
       Displaytext dt = new Displaytext();
    }
    
}

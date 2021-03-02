/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blinlingnumbers2;

import java.awt.*;
import java.awt.event.*;


public class Blinlingnumbers2 extends Frame {
Blinlingnumbers2()
{
    this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);            }

            
    } );
    setSize(1000,600);
    
    setVisible(true);
    setLayout(null);
   setBackground(Color.black);
   setForeground(Color.BLACK);
   
   Font f = new Font("Andalus" ,Font.BOLD,30);
   
     setFont(f);
    
    

            }
  public void  paint (Graphics g)
{
     int x = 150;
     int y = 100 ;
   
   for(int i =1 ;i<=10 ; i++)
   {
      for(int j = 1 ; j<=10 ; j++)
   {
       int r1 = (int)Math.round(Math.random()*255);
       int g1 = (int)Math.round(Math.random()*255);
       int b1 = (int)Math.round(Math.random()*255);
       Color c = new Color(r1 ,g1,b1);
       g.setColor(c);
       
       
     g.drawString("" +(i*j), x, y);
       x = x+50 ;

       try 
       {
           Thread.sleep(90);
       }
       catch(Exception e){}
      
     
}
     
     x=  150 ;
     y= y+50;
       
}
     

}


    public static void main(String[] args) {
     Blinlingnumbers2 bn = new    Blinlingnumbers2();
    }
    
}

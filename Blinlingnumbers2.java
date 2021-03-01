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
   setBackground(Color.ORANGE);
   setForeground(Color.BLACK);
   
   Font f = new Font("Chiller" ,Font.BOLD,60);
   
     setFont(f);
    
    

            }
  public void  paint (Graphics g)
{
    int x = 100;
   
   for(int i =1 ;i<=10 ; i++)
   {
       try{
           Thread.sleep(1500);
       }
       catch(Exception e){}
       g.drawString(" "+i, x, 150);
       x = x+50;
       
   }
   
   int num = 2 ;
   int p = 100;
   for(int z = 1 ; z<=10 ; z++)
   {
     int  result  = num*z;
   
   
      try{
           Thread.sleep(1500);
       }
       catch(Exception e){}
      
     g.drawString("" +result, p, 250);
       p = p+80 ;
   
   
   
}

}


    public static void main(String[] args) {
     Blinlingnumbers2 bn = new    Blinlingnumbers2();
    }
    
}

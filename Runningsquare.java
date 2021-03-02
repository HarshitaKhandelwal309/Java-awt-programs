/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package runningsquare;

import java.awt.*;
import java.awt.event.*;
public class Runningsquare extends Frame  {
Runningsquare()
{
    this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
            }
    );
    setVisible(true);
    setSize(500,500);
    setLayout(null);
    setBackground(Color.black);
    
    
}
public void paint(Graphics g)
{
    int x1 = 100;
    int y1 = 200 ; 
    int x2 = 101 ;
    int y2 = 200;
    for(int i = 1 ; i<=300 ; i++)
    {
        Color c = new Color(0 ,64 ,128);
        g.setColor(c);
    g.drawLine(x1,y1, x2, y2);
   //x1 = x1+1;
    x2= x2+1;

    
    
  
    
    
    try{
        Thread.sleep(10);
    }
    catch(Exception e){}
}
        for(int i = 1 ; i<=300 ; i++)
    {
        
        g.setColor(Color.red);
    g.drawLine(x1,y1, x2, y2);
  // x1 = x1+1;
    y2= y2+1;

    
    
  
    
    
    try{
        Thread.sleep(10);
    }
    catch(Exception e){}
}
        
        
        
            for(int i = 1 ; i<=300 ; i++)
    {
       
        g.setColor(Color.green);
    g.drawLine(x1,y1, x2, y2);
  // x1 = x1+1;
    x2= x2-1;

    
    
  
    
    
    try{
        Thread.sleep(10);
    }
    catch(Exception e){}
}

}
    public static void main(String[] args) {
       Runningsquare rs = new Runningsquare()  ;
    }
    
}

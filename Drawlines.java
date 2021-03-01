/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package drawlines;

import java.awt.*;
import java.awt.event.*;
public class Drawlines extends Frame {
Drawlines()
{
    this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
            }
    );
    
    
    
    setSize(700,600);
    setLayout(null);
    setVisible(true);
    setBackground(Color.black);
    setForeground(Color.red);
}

public void paint(Graphics g)
{
    int x1 = 200;
    int y1 = 100 ;
    int x2 = 600 ; 
    int y2 = 100;
    for(int i  = 1 ; i<=10 ; i++)
    {
        try{
            Thread.sleep(100);
        }
        catch(Exception e){}
         g.drawLine(x1, y1, x2,y2);
         x1 = x1+20;
         y1 = y1+30;
         x2 = x2-20;
         
         
         y2 = y2 +30;
        
    }
   
}
    
    public static void main(String[] args) {
     Drawlines dl = new   Drawlines() ;
    }
    
}

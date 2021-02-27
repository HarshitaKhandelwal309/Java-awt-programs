/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blinkingsquares;

import java.awt.*;
import java.awt.event.* ; 
public class Blinkingsquares extends Frame {
Blinkingsquares()
{
     
        this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
    });
        
        
        setVisible(true);
        setSize(600,600);
        setLayout(null);
        setBackground(Color.black);
        setForeground(Color.red);   
    
    
}

public void paint(Graphics g )
{
 
g.fillRect(100, 200, 300, 300);
try{
    Thread.sleep(2000);
}
catch(Exception e){}
g.setColor(Color.YELLOW);
try{
    Thread.sleep(2000);
}
catch(Exception e){}
g.fillRect(150, 250, 200, 200);
g.setColor(Color.green);
try{
    Thread.sleep(2000);
}
catch(Exception e){}
g.fillRect(200,300,100,100);
}

    
    public static void main(String[] args) {
      new Blinkingsquares();
        
// TODO code application logic here
    }

       
    
}

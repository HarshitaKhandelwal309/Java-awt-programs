/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package smiley;

import java.awt.*;
import java.awt.event.*;


    class Smiley extends Frame
    {
        Smiley(){
            this.addWindowListener(new WindowAdapter()
            {
                public void windowclosing(WindowEvent e)
                {
                    System.exit(0);
                }
            });
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.blue);
        g.fillRect(40, 40,200 ,200 );
        g.setColor(Color.yellow);
        g.fillOval(90, 70, 80, 80);//face 
        g.setColor(Color.black);
        g.fillOval(110,90, 6, 6);//eyes
        g.fillOval(145, 90, 6, 6);//eyes
        g.drawLine(130, 95, 135, 115);//nose
        g.setColor(Color.red);
        g.drawArc(113, 115, 35, 20, 0, -180);// smile
    }
    
    public static void main(String[] args) {
       Smiley s = new Smiley();
       s.setVisible(true);
       s.setSize(500,500);
       
    }
    
}

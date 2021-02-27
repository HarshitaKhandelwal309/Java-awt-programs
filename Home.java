/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package home;
import java.awt.*;
import java.awt.event.*;
public class Home  extends Frame
{
    Home(){
        // to close frame
            this.addWindowListener(new WindowAdapter()
            {public void windowClosing(WindowEvent e)
            {System.exit(0);}
                    }
            );
            
            //to create frame
            setVisible(true);
            setSize(800,800);
            setLayout(null);
            setBackground(Color.black);
            setForeground(Color.blue);
            
    }
    public void paint(Graphics g)
    {
       g.drawLine(250, 100, 150, 300);//for left tedi line
       g.drawLine(250, 100, 350, 300);//for right tedi line
       g.setColor(Color.ORANGE);
       g.drawLine(150, 300, 350, 300);//for 1st horizontal line
       g.drawLine(150, 300, 150, 500);//for left khdi line
       g.setColor(Color.cyan);
       g.drawLine(350, 300, 350, 500);//for right khdi line
        g.setColor(Color.ORANGE);
       g.drawLine(150, 500, 350, 500);//for 2nd horizontal line
       g.drawOval(240, 150, 20, 20);// for circle
       g.setColor(Color.red);
       g.drawLine(250, 100, 550, 100);//for roof ki horizonatlline
       g.drawLine(550,100 ,650 ,300);//for roof ke tedi line
        g.setColor(Color.cyan);
       g.drawLine(350,300 ,650 ,300 );
      
       g.drawLine(650,300 ,650 , 500);
       g.drawLine(350,500 ,650 , 500);
       
    }
    

    public static void main(String[] args) {
        Home h  = new Home();
    }
    
}

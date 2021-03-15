/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javalabel;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.border.Border;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
class label  extends JFrame{
    label()
            
    {
        JLabel labels= new JLabel("Bro do you even code?");
       
        
        this.add(labels);
          ImageIcon image = new ImageIcon("C:/Users/dell/Documents/NetBeansProjects/javalabel/src/javalabel/downoad.png");
        Border border = BorderFactory.createLineBorder(Color.GREEN);
          labels.setIcon(image);
        labels.setForeground(Color.red);
        labels.setFont(new Font("MV Boli",Font.BOLD,30));
        labels.setHorizontalTextPosition(JLabel.CENTER);
           labels.setBorder(border);
       
       
        
         this.setVisible(true); // it will display frame
          this.setSize(400 ,400); // set size  of frame 
          this.setTitle("FirstFrame"); // sset title of frame
          //this.getContentPane().setBackground( Color.CYAN);
          this.getContentPane().setBackground( new Color(0x123456)); // set color of a frame  
          
          this.setResizable(false);// it will stop frame to resize 
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  exit out of application 
          
    }
}
public class Javalabel {

    public static void main(String[] args) {
       label  l1  = new label  ();
    }
    
}

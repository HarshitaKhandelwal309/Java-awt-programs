/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package panel;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import javax.swing.*;
class MyPanel extends JFrame{
     MyPanel()
     {  
         // create 4 label 
         JLabel l1 = new JLabel("HEY This is  red Panel");
         JLabel l2= new JLabel("HEY This is  yellow Panel");
         JLabel l3 = new JLabel("HEY This is  green Panel");
         JLabel l4 = new JLabel("HEY This is  orange Panel");
         
         
         // create 4 panel 
              JPanel  red = new JPanel();
              red.setBackground(Color.red);
              red.setBounds(0,0,200,200);
       
               JPanel Yellow = new JPanel();
               Yellow .setBackground(Color.yellow);
               Yellow.setBounds(200,0,200,200);
       
               JPanel  green= new JPanel();
                green.setBackground(Color.gray);
               green.setBounds(0,200,200,200);
       
               JPanel  orange= new JPanel();
                orange.setBackground(Color.ORANGE);
              orange.setBounds(200,200,200,200);
          
              this.setVisible(true);
              // add panel to frame 
                this.add(red);
                // add label to frame 
                 red.add(l1);
                
                this.add(Yellow);
                Yellow.add(l2);
                
                this.add(green);
                green.add(l3);
                
                this.add(orange);
               orange.add(l4);

                this.setLayout(null);
              this.setSize(500,500);
              this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
             this.getContentPane().setBackground( new Color(0x123456));
              
              
              
     }
}

public class Panel {

    public static void main(String[] args) {
       MyPanel mp = new MyPanel();
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package gridlayout;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import java.awt.GridLayout;
import javax.swing.*;
class gridlayout extends JFrame 
{
   gridlayout()
   {
       this.setLayout(new GridLayout(3,3,12,12));
       
        this.add( new JButton("1"));
         this.add( new JButton("2"));
         this.add( new JButton("3"));
         this.add( new JButton("4"));
         this.add( new JButton("5"));
         this.add( new JButton("6"));
         this.add( new JButton("7"));
         this.add( new JButton("8"));
         this.add( new JButton("9"));
         this.add( new JButton("10"));
          this.add( new JButton("11"));
          this.add( new JButton("12"));
       
        this.setSize(500,500);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
       
   }
}





public class grid {
    public static void main(String[] args) {
      new  gridlayout();
    }
}

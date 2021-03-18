/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package flowlayout;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import java.awt.Dimension;
import java.awt.FlowLayout;
import javax.swing.*;
class flowlayout extends JFrame
{
    flowlayout()
    {
        this.setLayout(new FlowLayout(FlowLayout.CENTER, 40 ,40));
        
        JPanel p= new JPanel();
        p.setBackground(Color.BLACK);
        p.setPreferredSize( new Dimension(250,250));
        
        p.setLayout(new FlowLayout());
        
        
        
         p.add( new JButton("1"));
         p.add( new JButton("2"));
         p.add( new JButton("3"));
         p.add( new JButton("4"));
         p.add( new JButton("5"));
         p.add( new JButton("6"));
         p.add( new JButton("7"));
         p.add( new JButton("8"));
         p.add( new JButton("9"));
         p.add( new JButton("10"));
                 
        
        
        
        this.add(p);
       this.setSize(500,500);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.getContentPane().setBackground(Color.LIGHT_GRAY);
        this.setVisible(true);
    }
}

public class Flow {
    public static void main(String[] args) {
        new flowlayout();
        
    }
}

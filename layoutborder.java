/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poko;

/**
 *
 * @author Harshii
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.*;
import javax.swing.*;

class border extends JFrame implements ActionListener
{
    JButton b1;
    JButton b2;
    JButton b3;
    JButton b4;
    JButton b5;
    border()
    {
        
        
      
           this.setLayout(new BorderLayout(10,10));
        
             b1 = new JButton("North");
             b1.setBounds(220,120,200,150);
             b1.setFont(new Font("comic sans",Font.BOLD,20));
             b1.setForeground(Color.red);
             b1.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
             b1.setBackground(Color.CYAN);
             b1.setFocusable(false);
             b1.addActionListener(this);
             
             b2 = new JButton("South");
             b2.setBounds(220,120,200,150);
             b2.setFont(new Font("comic sans",Font.BOLD,20));
             b2.setForeground(Color.red);
             b2.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
             b2.setBackground(Color.CYAN);
             b2.setFocusable(false);
             b2.addActionListener(this);
             
             b3 = new JButton("East");
             b3.setBounds(220,120,200,150);
             b3.setFont(new Font("comic sans",Font.BOLD,20));
             b3.setForeground(Color.red);
             b3.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
             b3.setBackground(Color.CYAN);
             b3.setFocusable(false);
             b3.addActionListener(this);
             
             b4 = new JButton("West");
             b4.setBounds(220,120,200,150);
             b4.setFont(new Font("comic sans",Font.BOLD,20));
             b4.setForeground(Color.red);
             b4.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
             b4.setBackground(Color.CYAN);
             b4.setFocusable(false);
             b4.addActionListener(this);
             
             b5 = new JButton("center");
             b5.setBounds(220,120,200,150);
             b5.setFont(new Font("comic sans",Font.BOLD,20));
             b5.setForeground(Color.red);
             b5.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
             b5.setBackground(Color.CYAN);
             b5.setFocusable(false);
             b5.addActionListener(this);
             
           
           JPanel  p1 =new JPanel();
           JPanel  p2 =new JPanel();
           JPanel  p3 =new JPanel();
           JPanel  p4 =new JPanel();
           JPanel  p5 =new JPanel();
            
            p1.setBackground(Color.red);
            p2.setBackground(Color.blue);
            p3.setBackground(Color.ORANGE);
            p4.setBackground(Color.BLACK);
            p5.setBackground(Color.DARK_GRAY);
          
            p1.setPreferredSize(new Dimension(100,100));
            p2.setPreferredSize(new Dimension(100,100));
            p3.setPreferredSize(new Dimension(100,100));
            p4.setPreferredSize(new Dimension(100,100));
            
            p1.add(b1);
            p2.add(b2);
             p3.add(b3);
              p4.add(b4);
               p5.add(b5);
                
            

           this.add(p1,BorderLayout.NORTH);
           this.add(p2,BorderLayout.SOUTH);
           this.add(p3,BorderLayout.EAST);
            this.add(p4,BorderLayout.WEST);
            this.add(p5,BorderLayout.CENTER);
                
            
         this.setVisible(true);
        this.setSize(500,500);
            
    }
    public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b1)
    {
        System.out.println("hello");
    }
}
}














public class layoutborder {
    public static void main(String[] args) {
        border b= new border();
    }
}

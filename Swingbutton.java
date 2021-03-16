/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swingbutton;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import java.awt.Font;
import javax.swing.*;
import java.awt.event.*;
class MyFrame extends JFrame implements ActionListener
{
    JButton b;
    JLabel l ;
    MyFrame()
    {
        
        ImageIcon icon = new ImageIcon("images/download.jpg");
        
        l = new JLabel();
        l.setIcon(icon);
        l.setBounds(150,250,250,150);
          l.setVisible(false);
          l.setBackground(Color.black);
       
     //l.setForeground(Color.red);
        
      
//        
//        l.setIconTextGap(-15);
//        l.setHorizontalTextPosition(JLabel.CENTER);
//        l.setVerticalTextPosition(JLabel.BOTTOM);
       
        
        
        
        
          b = new JButton();
        b.setBackground(Color.GRAY);
        b.setBounds(120,120,200,90);
        b.setText("Chinki Click me");
        b.setFocusable(false);
        b.setForeground(Color.black);
        b.setFont(new Font("comic sans",Font.BOLD,20));
        b.addActionListener(this);
         b.setBorder(BorderFactory.createEtchedBorder(Color.lightGray, Color.yellow));
        
     
        
      
         this.setVisible(true);
       this.setSize(500,500);
       this.setLayout(null);
       this.getContentPane().setBackground(Color.black);
       this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
       this.add(b);
       this.add(l);
    }
    public void actionPerformed(ActionEvent e)
{
    if(e.getSource()==b)
    {
        System.out.println("You are selected for Morgan Stanley");
     l.setVisible(true);
    }
}
}








public class Swingbutton {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
    
}

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
import java.awt.Color;
import javax.swing.*;
class jpst extends JFrame {
    jpst()
    {
        //  textarea
        
         JTextArea jt = new JTextArea("hey you can write here" , 10 , 50);
//         jt.setRows(4);
//         jt.setColumns(50);
            jt.setBounds(120, 400,300, 450);
            
            
            // create slider 
            JSlider js = new JSlider(JSlider.HORIZONTAL,0,50,25);
      
        
          // create panel
             JPanel  jp = new JPanel();
             jp.setBackground(Color.LIGHT_GRAY);
            jp.setBounds(100,100,300,300);
            
            // add slider to panel
            jp.add(js);
            //  add text area to panel
            jp.add(jt);
            
            
           
       
            
            
            jp.add(jt);
        this.setVisible(true);
        this.setSize(500,500);
        this.setLayout(null);
       this.getContentPane().setBackground(Color.black);
        this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        // add panel to label
       this.add(jp);
        
    }
}











public class panelslidertextarea {
    public static void main(String[] args) {
        jpst j1 = new jpst();
    }
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package labelframe;

/**
 *
 * @author Harshii
 */
import java.awt.*;
public class Labelframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
       Frame f = new Frame("label example");
       Label l1 , l2 ;
      
       l1 = new  Label("Hello this is first label");
       l1.setBounds(70 , 100 , 120 , 70);
       
        l2 = new  Label("Hello this is second label");
       l2.setBounds(90 , 100 , 140 , 70);
       f.add(l1);
       f.add(l2);
       f.setBackground(Color.green);
        f.setSize(450 ,450);
       f.setVisible(true);
       
       f.setLayout(null);
      
    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package SwingProjects;

import java.awt.Color;
import javax.swing.JFrame; 

  class MyFrame extends JFrame{
    
      MyFrame()
      {
          this.setVisible(true); // it will display frame
          this.setSize(400 ,400); // set size  of frame 
          this.setTitle("FirstFrame"); // sset title of frame
          //this.getContentPane().setBackground( Color.CYAN);
          this.getContentPane().setBackground( new Color(0x123456)); // set color of a frame  
          
          this.setResizable(false);// it will stop frame to resize 
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  exit out of application 
          
      }
}













public class CreateFrameUsingSwing {
    public static void main(String[] args) {
        MyFrame mf = new MyFrame();
    }
    
    
}

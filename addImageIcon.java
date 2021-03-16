/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package SwingProjects;

/**
 *
 * @author Harshii
 */
import java.awt.Color;
import javax.swing.JFrame;
import javax.swing.ImageIcon;
class addimage extends JFrame{
addimage()
{
    this.setVisible(true); // it will display frame
          this.setSize(400 ,400); // set size  of frame 
          this.setTitle("FirstFrame"); // sset title of frame
          //this.getContentPane().setBackground( Color.CYAN);
          this.getContentPane().setBackground(Color.black); // set color of a frame  
          
          this.setResizable(false);// it will stop frame to resize 
          this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //  exit out of application 
          
          ImageIcon image = new ImageIcon("image/download.png");
          this.setIconImage(image.getImage());
     
    
}
}
public class addImageIcon {  
    public static void main(String[] args) {
        addimage im = new addimage();
    }
}

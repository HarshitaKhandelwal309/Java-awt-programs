/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package textareaframe;


import java.awt.*;


public class Textareaframe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
          Frame f=new Frame("text area");  
    TextArea text1=new TextArea();  
    text1.setBounds(10,20,200,300);  
       text1.setBackground(Color.yellow);
    
    f.add(text1); 
    
  
    f.setSize(500,500);  
    f.setLayout(null);  
     f.setBackground(Color.blue);
    f.setVisible(true);   
   
    }
    
}

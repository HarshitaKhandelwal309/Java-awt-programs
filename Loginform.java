/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;
import java.awt.*;
import java.awt .event.* ;

class loginsystem extends Frame
{
    
    
    Label l1 , l2;
    TextField tx1 ,tx2 ;
    Button b1 ;
            
    loginsystem()
    {
        
      //  FlowLayout fl= new  FlowLayout();
        setLayout(null); // yha null krne se component ki size 0 ho jauyegi it means they will not display on frame
        
        l1 = new Label("Name :");
        l1.setSize(80,30);
        l1.setLocation(100,120);
        add(l1);
        
        tx1 = new TextField(20);
        tx1.setSize(150,30);
        tx1.setLocation(190,120);
        add(tx1);
       
        l2 = new Label("Password :");
          l2.setSize(80,30);
        l2.setLocation(100,170);
        add(l2);
        
         tx2 = new TextField(20);
          tx2.setSize(150,30);
        tx2.setLocation(190,170);
        add(tx2);
        
       b1 = new Button("Login");
           b1.setSize(90,40);
        b1.setLocation(150,270);
       add(b1);
        
        
    }
    
}










public class Loginform  {
 public static void main(String[] args) {
       loginsystem fd = new  loginsystem();
      fd.setSize(500,500);
      fd.setVisible(true);
      fd.setBackground(Color.black);
      
              fd.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);            }

            
    } );
      
    }
    
}

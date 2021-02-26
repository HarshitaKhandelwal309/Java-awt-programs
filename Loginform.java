/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package loginform;
import java.awt.*;
public class Loginform {
Loginform(){
    Frame f = new Frame("Login Form");
    Label l1 = new Label("NAME:", Label.CENTER);
     Label l2 = new Label("PASSWORD:", Label.CENTER);
     Label l3 = new Label("EMAIL ID:", Label.CENTER);
     Label l4 = new Label("CONTACT NO:", Label.CENTER);
     
     TextField  t1 = new TextField(50);
     TextField  t2 = new TextField(50);
     TextField  t3 = new TextField(50);
     TextField  t4 = new TextField(50);
     
     
     Button b1 = new Button("Submit");
     Button b2 = new Button("Try again");
          
          l1.setBounds(90,90,90,60);
        l2.setBounds(70,130,90,60);
        l3.setBounds(50 ,170,90,60);
         l4.setBounds(30 ,210,90,60);
        
        t1.setBounds(200,100,90,20);
        t2.setBounds(200,140,90,20);
        t3.setBounds(200,180,90,20);
        t4.setBounds(200,220,90,20);
        
        b1.setBounds(200,360,90,70);
        b2.setBounds(280,360,90,70);
   
    f.setSize(500,500);
    f.setLayout(null);
    f.setVisible(true);
    f.setBackground(Color.gray);
    f.add(l1);f.add(l2) ; f.add(l3);f.add(l4) ;
     f.add(t1);f.add(t2) ; f.add(t3);f.add(t4) ;
      f.add(b1);f.add(b2) ;
      
}

    
    public static void main(String[] args) {
      new Loginform();
    }
    
}

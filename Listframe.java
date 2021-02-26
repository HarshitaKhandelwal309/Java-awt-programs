/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package listframe;

import java.awt.*;
public class Listframe {

    Listframe (){
        Frame f = new Frame();
        List l1= new List(4);
          l1.setBounds(200 ,200 ,150 ,90);
        l1.add("Male");
        l1.add("Female");
        l1.add("transgender");
        l1.add("Others");
      
        f.setSize(500 , 500);
        f.setLayout(null);
        f.setVisible(true);
        f.add(l1);
    }
    
    public static void main(String[] args) {
      new Listframe ();
    }
    
}

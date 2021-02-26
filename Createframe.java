/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package createframe;

import java.awt.*;

public class Createframe {

  Createframe()
  {
      Frame f = new Frame();
      f.setSize(500 ,500);
      f.setLayout(null);
      f.setVisible(true);
      f.setBackground(Color.blue);
      
      
  }
    public static void main(String[] args) {
       Createframe f = new Createframe();
    }
    
}

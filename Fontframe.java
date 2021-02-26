/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fontframe;

/**
 *
 * @author Harshii
 */
  import java.awt.*;
public class Fontframe {

    
    public static void main(String[] args) {
     

String Allfonts[]=GraphicsEnvironment.getLocalGraphicsEnvironment().getAvailableFontFamilyNames();
for(int i=0;i<Allfonts.length;i++){
    System.out.println(Allfonts[i]);
}
}
} 
    
    


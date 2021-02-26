/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package choiceframe;

import java.awt.*;

public class Choiceframe {

    Choiceframe()
    {
        Frame f = new Frame();
        Choice c = new Choice();
        c.add("C");
        c.add("C++");
        c.add("Java");
        c.add("React");
        c.add("Angular");
        c.setBounds(200,200,150,90);
        f.setSize(500 ,500);
        f.setVisible(true);
        f.setLayout(null);
        f.add(c);
    }
    public static void main(String[] args) {
        new   Choiceframe();

    }
    
}

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package buttonaction;
import java.awt.*;
import java.awt.event.*;
class pops extends Frame  implements ActionListener  // step 1 implements listener
{
    Button b1 ;
    Button b2 ;
    TextArea tx1 ;
    pops()
    { 
        
        FlowLayout fl = new FlowLayout();
        setLayout(fl);
        // create object
        b1 = new Button("click me");
        b2= new Button("clear me");
        tx1 = new TextArea();
         // add   them in frame 
         add(b1);
          add(b2);
           add(tx1);
           
           
           //step 2 add listener to component 
           b1.addActionListener(this);
            b2.addActionListener(this);
        
           
    }
    public void actionPerformed(ActionEvent e)
{
    
    if(e.getSource()==b1)
    {
        tx1.setText("You can write Here");
        setBackground(Color.pink);
    }
    
    if(e.getSource()==b2)
    {
        tx1.setText("");
        setBackground(Color.green);
    }

}
}








public class buttonclearclick {
    public static void main(String[] args) {
         pops p = new pops();
    p.setSize(450,400);
    p.setVisible(true);
    p.setBackground(Color.black);
    
    // to close frame
    p.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
            }
    );

    }
       
}

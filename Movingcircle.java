/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package movingcircle;
import java.awt.*;
import java.awt.event.*;
public class Movingcircle extends Frame  {

  Movingcircle ()
{
    this.addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent e)
    {System.exit(0);}
            }
    );
    setVisible(true);
    setSize(500,500);
    setLayout(null);
    setBackground(Color.black);
   
}
  public void paint(Graphics g)
  {int x =  100;
  int y = 200 ;
  int W = 200;
  int H = 200;
  int sa = 0;
  int ma = 30;
  for(int i = 1 ; i<=12 ; i++)
  {
      g.setColor(Color.red);
      
      g.fillArc(x, y, W, H, sa,ma);
      sa = sa+30 ;
      
      try{
      Thread.sleep(100);
      
  }
      catch(Exception e ){}
  }
  }
    public static void main(String[] args) {
         Movingcircle  mc  = new  Movingcircle ();
    }
    
}

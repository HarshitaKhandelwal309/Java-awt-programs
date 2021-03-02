/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package indianflag;

import java.awt.*;
import java. awt . event.*;

public class Indianflag  extends Frame {
    Indianflag()
    {
        this.addWindowListener(new WindowAdapter()
        {public void windowClosing(WindowEvent e )
        {System.exit(0);}
                }
        );
        
         setVisible(true);
    setSize(1000,1000);
    setLayout(null);
    setBackground(Color.DARK_GRAY);
        
    }
    public void paint(Graphics g)
    {
        g.setColor(Color.black);
        try{
            Thread.sleep(500);
        }
        catch(Exception e){}
        g.fillRect(100, 100, 10,500); // vertical rectangle
         try{
            Thread.sleep(500);
        }
        catch(Exception e){}
        g.fillRect(70, 600, 68, 10);// first horizontal
         try{
            Thread.sleep(500);
        }
        catch(Exception e){}
         g.fillRect(60, 610, 85, 10);//second horizontal
          try{
            Thread.sleep(500);
        }
        catch(Exception e){}
          g.fillRect(50, 620, 105, 10);// 3rd horizontal
          
           try{
            Thread.sleep(500);
        }
        catch(Exception e){}
          g.setColor(Color.ORANGE);
          
          g.fillRect(110,110 ,200 , 50);
          
            try{
            Thread.sleep(500);
        }
        catch(Exception e){}
          g.setColor(Color.WHITE);
          
          g.fillRect(110,160 ,200 , 50);
          
      
          
           try{
            Thread.sleep(500);
        }
        catch(Exception e){}
          g.setColor(Color.green);
          
          g.fillRect(110,210 ,200 , 50);
   
    
    
          
              int x = 170;
          int y = 160 ; 
          int w= 70 ;
          int h = 50 ;
         int sa = 0 ;
         int ma = 4;
                  for(int i = 1 ; i<=24 ; i++){
                      g.setColor(Color.blue);
                        try{
            Thread.sleep(50);
        }
        catch(Exception e){}
          g.fillArc(x,y , w, h,sa, ma);
          sa = sa+15;
                  }
    
    }
    
    

    public static void main(String[] args) {
        Indianflag f = new Indianflag();
    }
    
}

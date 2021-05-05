//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

public class BigHouse extends Canvas
{
   public BigHouse()  //constructor - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      bigHouse(window);
      
   }
   
   public void bigHouse( Graphics window )
   {
      window.setColor(Color.BLUE);
      window.drawString( "BIG HOUSE ", 50, 50 );

      window.setColor(Color.BLUE);
      window.fillRect( 200, 200, 400, 400 );
      
      
      window.setColor(Color.GREEN);
      window.fillRect(0, 150, 800, 60);
      
      window.setColor(Color.YELLOW);
      window.fillRect(280, 300, 50, 50);
      
      window.setColor(Color.YELLOW);
      window.fillRect(450, 300, 50, 50);
      
      window.setColor(Color.WHITE);
      window.fillRect(360, 400, 100, 300);
      

   }
}
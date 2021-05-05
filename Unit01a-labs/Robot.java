//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Canvas;

class Robot extends Canvas
{
   public Robot()    //constructor method - sets up the class
   {
      setSize(800,600);
      setBackground(Color.WHITE);   	
      setVisible(true);
   }

   public void paint( Graphics window )
   {
      window.setColor(Color.BLUE);

      window.drawString("Robot LAB ", 35, 35 );

      head(window);
      
      
      upperBody(window);
      
      lowerBody(window);
      
      
   }

   public void head( Graphics window )
   {
      window.setColor(Color.YELLOW);
      window.fillOval(300, 100, 200, 100);

      window.setColor(Color.BLACK);
      window.fillOval(390, 150, 20, 10);
      
      window.setColor(Color.GREEN);
      window.fillOval(330, 120, 30, 30);
      
      window.setColor(Color.GREEN);
      window.fillOval(440, 120, 30, 30);
      
      
      window.setColor(Color.RED);
      window.drawArc(340, 120, 120, 70, 180, 180 );
				
   }

   public void upperBody( Graphics window )
   {

		window.setColor(Color.YELLOW);
		window.drawRect(320, 250, 130, 100);
		
		
		window.setColor(Color.BLUE);
		window.fillRect(320, 250, 130, 100);
		
		
		window.setColor(Color.BLACK);
		window.drawLine(320, 250, 240, 200  );
		
		
		window.setColor(Color.BLACK);
		window.drawLine(450, 250, 530, 200);
		
		
		
   }

   public void lowerBody( Graphics window )
   {

	   window.setColor(Color.YELLOW);
	   window.drawRect(320, 400, 130, 100);
	   
	   
	   window.setColor(Color.RED);
	   window.fillRect(320, 400, 130, 100);
	   
	   window.setColor(Color.BLACK);
	   window.drawLine(320, 500, 210, 450   );
		
		
		window.setColor(Color.BLACK);
		window.drawLine(450, 500, 530, 460);
	   
	   
	   
	   
	   
	   
	   

   }
}
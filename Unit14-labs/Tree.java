//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.awt.Graphics;
import java.awt.Color;
import java.awt.Polygon;
import java.awt.Font;
import java.awt.Canvas;

public class Tree extends Canvas
{
	public Tree()
	{
		setBackground(Color.WHITE);
	}

	public void paint( Graphics window )
	{
		window.setColor(Color.RED);
		window.setFont(new Font("TAHOMA",Font.BOLD,12));
		window.drawString("Lab14h - Tree Lab", 50, 50);
		
		tree(window);



	}
	
	public void tree(Graphics window)
	{
		int[] treeXPoints = {400,200,600};
		int[] treeYPoints = {100,500,500};
		Polygon tree = new Polygon(treeXPoints,treeYPoints,treeXPoints.length);
		window.setColor(Color.GREEN);
		window.fillPolygon(tree);


	}

	public void star(Graphics window)
	{
		int [] starXPoints = {360, 370, 390, 400, 420,440,460,480};
		int [] starYPoints = {100,110,120,130,140,150,160};
		Polygon star = new Polygon(starXPoints, starYPoints, 8);
		window.setColor(Color.YELLOW);	
		window.fillPolygon(star);




	}
}
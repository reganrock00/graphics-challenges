import java.awt.Canvas;
import java.awt.Color;
import java.awt.Graphics;
import java.util.Scanner;

import javax.swing.JFrame;

public class CanvasChallange extends Canvas
	{
	private static final long	serialVersionUID	= 1L;
	    static int sizeHeigth;
	    static int sizeWidth;
	    static String color;
		public static void main(String[] args)
			{
				drawSquare();
				CanvasChallange canvas = new CanvasChallange();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
		        
            }
		public static void drawSquare()
		    {
		    	Scanner userInput =new Scanner (System.in);
		    	System.out.println("How tall of a square do you want?");
		    	sizeHeigth = userInput.nextInt();
		    	Scanner userInput2 =new Scanner (System.in);
		    	System.out.println("How wide of a square do you want?");
		    	sizeWidth = userInput2.nextInt();
		    	Scanner userInput3 =new Scanner (System.in);
		    	System.out.println("Red or blue?");
		    	color = userInput3.nextLine();
		    	color = color.toLowerCase();
		    }
		public void paint(Graphics graphics) 
		    {
		    if (color.equals("red"))
		    	{
		    	graphics.setColor(Color.red);
		        graphics.fillRect(400, 400, sizeWidth, sizeHeigth);
		    	}
		    if (color.equals("blue"))
		    	{
		    	graphics.setColor(Color.blue);
		        graphics.fillRect(400, 400, sizeWidth, sizeHeigth);
		    	}
		    }

	}

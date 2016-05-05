import java.awt.Color;
import java.awt.Graphics;
import java.awt.Canvas;
import javax.swing.JFrame;

public class CheckBoard extends Canvas
	{
	private static final long	serialVersionUID	= 1L;
	    boolean alternate = true;
		public static void main(String[] args)
			{
				CheckBoard canvas = new CheckBoard();
		        JFrame frame = new JFrame();
		        frame.setSize(1000, 1000);
		        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		        frame.getContentPane().add(canvas).setBackground(Color.white);
		        frame.setLocationRelativeTo(null); //Sets JPanel to center of screen 
		        frame.setResizable(false);
		        frame.setVisible(true);
			}
		public void paint(Graphics graphics)
		    {
		    while (alternate = true)
		    	{
		    		for ( int col = 125; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 0, 125, 125);
		    			}
		    		for ( int col = 0; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 125, 125, 125);	
		    			}
		    		for ( int col = 125; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 250, 125, 125);	
		    			}
		    		for ( int col = 0; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 375, 125, 125);	
		    			}
		    		for ( int col = 125; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 500, 125, 125);	
		    			}
		    		for ( int col = 0; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 625, 125, 125);	
		    			}
		    		for ( int col = 125; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 750, 125, 125);	
		    			}
		    		for ( int col = 0; col < 1000; col = col + 250)
		    			{
		    			graphics.setColor(Color.black);
		    			graphics.fillRect(col, 875, 125, 125);	
		    			}
		    	}
			
		    }
	}

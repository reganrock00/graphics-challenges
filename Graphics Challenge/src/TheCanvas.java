import java.awt.*;

import javax.swing.*;
		 
	public class TheCanvas extends Canvas	 
			{
			private static final long	serialVersionUID	= 1L;
		 
		    	public static void main(String[] args) 
		    		{
			        TheCanvas canvas = new TheCanvas();
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
			        graphics.setColor(Color.blue);
			        graphics.fillRect(10, 10, 800, 100);
			        
			        graphics.setColor(Color.red);
			        graphics.drawRect(140, 130, 100, 100);
			        
			        graphics.setColor(Color.yellow);
			        graphics.fillRect(600, 600, 400, 400);
			        
			        graphics.setColor(Color.blue);
			        graphics.drawRect(600, 600, 400, 400);
			        
			        graphics.setColor(Color.black);
			        graphics.drawLine(0, 980, 990, 0);
			        
			        graphics.setColor(Color.black);
			        graphics.drawLine(0, 0, 1000, 980);
			        
			        graphics.setColor(Color.red);
			        graphics.fillOval(350, 350, 300, 300);
			        
			        graphics.setColor(Color.blue);
			        graphics.fillOval(400, 500, 200, 100);
			        
			        graphics.setColor(Color.white);
			        graphics.fillRect(410, 400, 80, 80);
			        
			        graphics.setColor(Color.white);
			        graphics.fillRect(510, 400, 80, 80);
		    		}
		    	
		    		public void delay()
		    			{
		    	        try
		    					{
		    					Thread.sleep(10);
		    					} catch (InterruptedException e)
		    					{
		    					e.printStackTrace();
		    					}
		    			}
		   	}

package sokoban;

import java.awt.Graphics;

import javax.swing.JPanel;

// Abstract class representing a element that has position, can move and draw itself.
public abstract class Figure extends JPanel{
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	protected IPosition position;

	public Figure()
	{
		
	}
	
	// This method have to be implemented by deriving classes.
	// Draws the figure using the viewer object passed in the constructor.
	//public abstract void draw(Graphics g);
	public void paint(Graphics g){
		super.paint(g);
	}
	
	// This method have to be implemented by deriving classes.
	public abstract void move();
}

package sokoban;

import java.awt.Graphics;

// Class representing a figure Box for the Sokoban game.
public class Box extends Figure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Box() {
		
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		position.generatePosition(this);
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	

}

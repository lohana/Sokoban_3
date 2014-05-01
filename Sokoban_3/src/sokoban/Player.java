package sokoban;

import java.awt.Graphics;

// Class representing a figure Player for the Sokoban game.
public class Player extends Figure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Player() {
		
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

package sokoban;

import java.awt.Graphics;

//Class representing a figure Empty field for the Sokoban game.
public class Field extends Figure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Field() {
		
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

package sokoban;

import java.awt.Graphics;

// Class representing a figure Wall for the Sokoban game.
public class Wall extends Figure {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public Wall() {
		
	}

	@Override
	public void paint(Graphics g) {
		super.paint(g);
		position.generatePosition(this);
	}

	@Override
	public void move() {
		return;
	}

}

package sokoban;

import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;

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
		
		BufferedImage playerImage = null;
		
		try{
			playerImage = ImageIO.read(new File("images/player.PNG"));
		}  catch (IOException e){
			
		}
		//g.drawImage(playerImage, position.x, position.x, playerImage.getIconWidth(), playerImage.getIconWidth(), 0, 0, playerImage.getIconWidth(), playerImage.getIconWidth());
		g.drawImage(playerImage, 0, 0, playerImage.getWidth(), playerImage.getWidth(), 0, 0, playerImage.getWidth(), playerImage.getWidth(), null);
		
		g.dispose();
		
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
}

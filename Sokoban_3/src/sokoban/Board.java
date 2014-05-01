package sokoban;

import java.awt.Graphics;
import java.util.*;

// Class representing a figure Board for the Sokoban game.
public class Board extends Figure{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private int height;
	private int width;
	private ArrayList<Figure> figureList;
	
	public Board() {
		
		height = 40;
		width = 30;
		figureList = new ArrayList<Figure>();
		// TODO Auto-generated constructor stub
	}

	@Override
	public void paint(Graphics g) {
		// TODO Auto-generated method stub
		super.paint(g);
		position.generatePosition(this);
		//g.drawRect(position.x, position.y, width, height);
		g.drawRect(0, 0, width, height);
		//g.fillRect(position.x, position.y, width, height);
		g.fillRect(0, 0, width, height);
		g.dispose();
		
		generateElementsOnBoard(g);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub
		
	}
	
	public void generateElementsOnBoard(Graphics g){
		
		Figure playerFigure = new Player();
		figureList.add(playerFigure);
		playerFigure.paint(g);
		//I try to simulate that generate 5 empty fields
	}
}

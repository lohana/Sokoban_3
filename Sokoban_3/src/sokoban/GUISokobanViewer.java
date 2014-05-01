package sokoban;

import java.awt.Graphics;

import javax.swing.JPanel;

public class GUISokobanViewer extends JPanel{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private Figure figure;

	public GUISokobanViewer() {
		// TODO Auto-generated constructor stub
		figure = new Board();
		this.repaint();
		
	}
	
	public static void main(String[] args) {
	    
        new GUISokobanViewer();
    }


	@Override
	public void paint(Graphics g) {
		super.paint(g);
		if (figure!=null)
            figure.paint(g);

		// TODO Auto-generated method stub
	}
	
	
	
	

}

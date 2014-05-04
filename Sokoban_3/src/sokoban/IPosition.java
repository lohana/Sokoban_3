package sokoban;

// Interface that represents the position of a figure.
public interface IPosition {

	// Methods that a position should have.
	public Position generatePosition(Figure figure);
	
	public void setLocation(double x,double y); 
	public double getX();
	public void setX(double x);
	public double getY();
	public void setY(double y);	
	public boolean isEqualto(Figure f);
	public IPosition Clone();
	
	
	

}

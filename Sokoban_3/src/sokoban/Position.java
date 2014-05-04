package sokoban;


// Class that represents the position of a figure as coordinates in table
public class Position implements IPosition {

	 private double x =0;
	 private double y =0;
	 
	  

	public double getX() {
		return this.x;
	}

	public void setX(double x) {
		this.x = x;
	}

	public double getY() {
		return this.y;
	}

	public void setY(double y) {
		this.y = y;
	}
	public void setLocation(double x, double y) {
		this.x = x;
		this.y = y;
		
	}
	
	public boolean isEqualto(Figure f) {
		if(f.getX()== this.x && f.getY()== this.y){
			return true;
		} else {
			return false;
		}
	}
	
	public IPosition Clone(){		
		IPosition p = new Position();
		p.setLocation(this.x, this.y);		
		return p;		
	}
	
	public Position(){		
			this.x = 0;
			this.y = 0;				
		}
	
	public Position(IPosition p){		
		this.setLocation(p.getX(), p.getY());			
	}
	
	
	
	
	@Override
	public Position generatePosition(Figure figure) {
		// TODO Auto-generated method stub	
		return null;
	}

	 
	
	

}

package Package1;

public abstract class Shape {
	int area;
	String colour;
	
	Shape(String colour) {
		this.colour=colour;
	}
	
	public abstract void calcArea();
	
	public void setOuterColour() {
		System.out.println("The color is "+colour);
	}
	
	

}

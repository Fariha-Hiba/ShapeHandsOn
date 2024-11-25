package Package1;

public class Circle extends Shape {
	
	int r=20;
	final float pi = (float) 3.14;
	Circle(String colour) {
		super(colour);
		this.colour=colour;
		// TODO Auto-generated constructor stub
	}



	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		float area = (float) (pi * r * r); 
		System.out.println("Area of circle is "+area);
		
	}
	

}

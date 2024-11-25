package Package1;

public class Rectangle extends Shape {
	
	int l=5;
	int b=10;
	Rectangle(String colour) {
		super(colour);
		this.colour=colour;
		// TODO Auto-generated constructor stub
	}

	

	@Override
	public void calcArea() {
		// TODO Auto-generated method stub
		area= l*b;
		System.out.println("Area of rectangle is "+area);
		
	}



	

}

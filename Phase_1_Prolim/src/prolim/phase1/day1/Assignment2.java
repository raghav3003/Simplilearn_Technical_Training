package prolim.phase1.day1;

public class Assignment2 {

	int side = 0;
	double length = 0;
	double breadth = 0;
	double radius = 0;
	
	Assignment2() {
		side = 0;
		length = 0;
		breadth = 0;
		radius = 0;
	}
	
	Assignment2(int side) {
		this.side = side;
	}
	
	Assignment2(double length, double breadth) {
		this.length = length;
		this.breadth = breadth;
	}
	
	Assignment2(double radius) {
		this.radius = radius;
	}
	
	public void displayRectangleArea() {
		double area = length*breadth;
		System.out.println("Area of rectangle: " + area);
	}
	
	public void displayCircleArea() {
		double area = Math.PI*radius*radius;
		System.out.println("Area of circle: " + area);
	}
	
	public void displaySquareArea() {		
		int area = side*side;
		System.out.println("Area of square: " + area);
	}
	
	public void calculateArea(double base, double height) {
		System.out.println("Area of triangle: " + 0.5*base*height);
	}
	
	public void calculateArea(int p, int q) {
		System.out.println("Area of rhombus: " + 0.5*p*q);
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Assignment2 circle = new Assignment2(10.2);
		Assignment2 square = new Assignment2(10);
		Assignment2 rectangle = new Assignment2(10, 20);
		
		circle.displayCircleArea();
		square.displaySquareArea();
		rectangle.displayRectangleArea();
		
		Assignment2 shape = new Assignment2();
		shape.calculateArea(10.2, 20.3);
		shape.calculateArea(10, 20);
	}

}

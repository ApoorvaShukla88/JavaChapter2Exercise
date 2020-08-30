package chapter9;

public class Rectangle{
	
		double width;
		double height;
	
	
	public Rectangle () {
		
	}
public Rectangle(double width, double height) {
	this.height = height;
	this.width = width;
	}
public double getArea() {
	double area = 2 * (width * height);
	return area;
}
public double getPerimeter() {
	double perimeter = 2 * (width + height);
	return perimeter;
}

	
}